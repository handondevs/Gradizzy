const fs = require('fs-extra');
const fstream = require('fstream');
const path = require('path');

const readTitles = function(dataURL){ 
    let titles = []
    fs.readdirSync(dataURL).forEach((file, i) => {
        if(file.split('.md').length==2){
            titles.push({
                title: `${file.split('.md')[0]}`, 
                dir: `${dataURL}/${file}` 
            })
        }
    })
   return titles
}

const extractFolderPath = (path) => {
    if (path.charAt(path.length-1) === '/'){
        path = path.substring(0, path.length-1);
    }
    lastSlash = path.lastIndexOf('/');
    return {
        full: path,
        parent: path.substring(0, lastSlash+1),
        name: path.substring(lastSlash+1)
    }
}

const changeFolderName = function(path, name){
    comps = extractFolderPath(path);
    fs.rename(path, comps.parent + name, (err) => {
        if (err) {
            console.error(err);
            return;
        }
    })
}

const refactorFile = function(path, packageName, cb) {
    fs.readFile(path, function(err, buf) {
        if (err)
        {
            return cb(err);
        }
        let str = buf.toString();
        let pkgIndex = str.indexOf('package');
        if (!packageName){
            if (pkgIndex == -1) {
                return;
            }
            else {
                let endIndex = str.indexOf(';', pkgIndex);
                str = str.substring(0, pkgIndex) + str.substring(endIndex+1);
            }
        }
        else {
            if (pkgIndex == -1) {
                str = 'package ' +packageName + ';' + str;
            }
            else {
                let endIndex = str.indexOf(';', pkgIndex);
                str = str.substring(0, pkgIndex) + 
                'package ' +packageName + ';' +
                str.substring(endIndex+1);
            }
        }
        fs.writeFile(path, str, function(err) {
            if (err) {
                return cb(err);
            }
            return cb(undefined)
        });
    });
}

const isFile = fileName => {
    return fs.lstatSync(fileName).isFile()
}

const getFiles = async function(folderPath, regex) {
    return new Promise((resolve, reject) => {
        fs.readdir(folderPath, (err, files) => {
            if (err){
                reject(err);
                return;
            }
            const res = files.map(fileName => {
                return path.join(folderPath, fileName);
            }).filter(isFile);
            if (!regex){
                resolve(res);
                return;
            }
            res.filter(fileName => {
                return regex.test(fileName);
            });
            resolve(res.filter(fileName => {
                return regex.test(fileName);
            }));
        })
    });
}

const refactorFolder = async function(path) {
    if (isFile(path)){
        return new Promise((resolve, reject) => {
            reject(new Error('Not a folder.'));
        })
    }
    return getFiles(path)
    .then((files) => {
        const comps = extractFolderPath(path);
        const promises = files.map(filePath => (new Promise((resolve, reject) => {
            refactorFile(filePath, comps.name, (err) => {
                if (err){
                    reject(new Error('Error refactoring file: '+filePath+'\nMore details:\n' + err));
                }
                else {
                    resolve();
                }
            })
        })))
        return Promise.all(promises);
    });
}

const extractZip = function(zip_path, dest, srcDirExpand) {

    var AdmZip = require('adm-zip');
    var zip = new AdmZip(zip_path);
    var zipEntries = zip.getEntries();

    const extractRootName = (path) => {
        let slash = path.indexOf('/');
        if (slash >= 0) {
            return {
                root: path.substring(0, slash+1),
                remain: path.substring(slash+1)
            }
        } else 
            return {
                root: undefined,
                remain: path
            }
    };

    zipEntries = zipEntries.filter((entry, index, arr) => {
        const { root } = extractRootName(entry.entryName);
        return (root !== '__MACOSX/');
    })

    let containsRoot = 0;
    if (zipEntries.length > 1) {
        const { parent } = extractFolderPath(zipEntries[1].entryName);
        if (parent === zipEntries[0].entryName){
            containsRoot = 1;
        }
    }

    if (containsRoot === 0){
        let root = zipEntries[0].entryName;
        root = root.substring(0,root.indexOf('/')+1);
        let index;
        for (index = 0; index < zipEntries.length; index++){
            let temp = zipEntries[index].entryName;
            temp = temp.substring(0,temp.indexOf('/')+1);
            if (temp !== root){
                break;
            }
        }
        if (index === zipEntries.length)
            containsRoot = 2;
    }

    if (srcDirExpand === true && containsRoot > 0){
        for (let i in zipEntries){
            if (i == 0 && containsRoot === 1)
                continue;
            zip.extractEntryTo(zipEntries[i].entryName, dest, false, true);
        }
    }
    else {
        zip.extractAllTo(dest, true);
    }

}

const getInfoFiles = async function(submissions_dir) {
    return getFiles(submissions_dir,
        /.*_[a-z]{3}[0-9]{4}_attempt_[0-9]{4}-[0-9]{2}-[0-9]{2}-[0-9]{2}-[0-9]{2}-[0-9]{2}\.txt/);
}

const readNext = function(string, delimiter, ignore_delim){
    var num = string.indexOf(delimiter);
    if (num === -1){ 
        var res = string;
        var re = null;
        return{ 
            result: res.trim(),
            remain: re,
        }
    }
    else{
        var res = string.substring(0,num);
    } 
    if(ignore_delim===false || ignore_delim===undefined){
        var re = string.substring(num+1);
    }
    else {
        var re = string.substring(num);
    }
    return{ 
        result: res.trim(),
        remain: re,
    }
}

const extractStudentinfo = async function(path) {
    const fs =require('fs')
    let info = {};
    return new Promise((resolve, reject) => {
        fs.readFile(path, (err,data) => {
        if (err){
            reject(err);
            return;
        }
        var string = data.toString();
        delim=":";
        var res=readNext(string,delim).result.trim();
        var re = readNext(string, delim).remain;
        delim = "(";
        var name = readNext(re,delim).result;
        info.name = name;
        re = readNext(re,delim).remain;
        delim = ")";
        var id = readNext(re,delim).result;
        info.id = id;
        re = readNext(re,delim).remain;
        for (let i = 0; i < 5; i++){
            var { result:att, remain } = readNext(re, ":");
            re = remain.trim();
            var { result:val, remain } = readNext(re, "\n");
            re = remain.trim();
            info[replaceAll(att, " ","")] = val;
        }
        var { result:att, remain } = readNext(re, ":");
        re = remain.trim();
        info.files = [];
        while (re !== null && re.trim() !== ""){
            var { remain } = readNext(re, ":");
            if (remain === null){
                resolve(info);
                return;
            }
            re = remain.trim();
            var { result:val, remain } = readNext(re, "\n");
            re = remain.trim();
            let original_filename = val;

            var { remain } = readNext(re, ":");
            re = remain.trim();
            var { result:val, remain } = readNext(re, "\n");
            if (remain !== null)
                re = remain.trim();
            else
                re = remain;
            let filename = val;

            info.files.push({original_filename,filename});
        }
        resolve(info);
    })});
}

const extractAllStudentInfo = async (info_files) => {
    return Promise.all(info_files.map(
        filepath => extractStudentinfo(filepath)
    ))
}

const replaceAll = function(target, search, replacement) {
    return target.replace(new RegExp(search, 'g'), replacement);
};

const parseStudentName = function(student_name, strReplace) {
    const strBetween = (strReplace)?strReplace:"";
    let { result, remain } = readNext(student_name, " ");
    remain = replaceAll(remain, " ", strBetween);
    return {
        full: result + strBetween + remain,
        first: result,
        last: remain
    };
}

const extractZipBeautiful = async function(zip_path, destination, studentInfoSavePath) {
    extractZip(zip_path, destination, true);
    const { full: dest } = extractFolderPath(destination);

    return getInfoFiles(destination)
    .then(infoFiles => {
        return extractAllStudentInfo(infoFiles)
        .then((studentInfos) => {
            // Remove all txt files
            return Promise.all(infoFiles.map(file => new Promise((resolve, reject) => {
                fs.remove(file, err => {
                    if (err)
                        reject(err);
                    else
                        resolve();
                })
            })))
            .then(() => {
                return Promise.resolve(studentInfos);
            });
        });
    })
    .then(studentInfos => {
        // Copy each student's files into their own folder
        let B = Promise.all(studentInfos.map(student => {
            const studentName = parseStudentName(student.name);
            fs.mkdirsSync(dest + '/' + studentName.last + studentName.first);
            return new Promise( (resolve, reject) => {
                if (student.files.length === 0){
                    resolve([]);
                    return;
                }
                const {filename} = student.files[0];
                const type = filename.substring(filename.lastIndexOf(".")+1);

                // If student file contains only one zip folder
                if (student.files.length === 1 && type === 'zip'){ 
                    extractZip(dest+'/'+filename, dest + '/' + studentName.last + studentName.first, true);
                    resolve([dest+'/'+filename]);
                }
                else {
                    Promise.all(student.files.map(file => new Promise( (resolve, reject) => {
                        fs.copy(dest+'/'+file.filename, dest + '/' + studentName.last + studentName.first + '/' + file.original_filename, function(err){
                            if (err){
                                reject(new Error('Error copying file from:\n'+
                                '\tsrcDir: "' + dest + '/",\n'+
                                '\toldFileName: "' + file.filename + '"\n'+
                                'to the following path:\n' + 
                                '\tdestDir: "' + student_folder + '/",\n'+
                                '\tfile: "' + file.original_filename + '"\n'));
                            }
                            resolve(dest+'/'+file.filename);
                        });
                    })))
                    .then(resolve)
                    .catch(reject);
                }
            })
            .then((filesToRemove)=>{
                if (filesToRemove.length === 0){
                    return Promise.resolve();
                }
                return Promise.all(filesToRemove.map(file => new Promise((resolve, reject)=>{
                    fs.remove(file, err => {
                        if (err)
                            reject(err);
                        else
                            resolve();
                    })
                })));
            });
        }));

        // Save student infos into file
        let C = new Promise( (resolve, reject) => {
            if (studentInfoSavePath){
                const { full : studentInfoPath } = extractFolderPath(studentInfoSavePath);
                fs.createFile(studentInfoPath + '/studentInfo.json', err => {
                    if (err){
                        reject(err);
                    }
                    else {
                        fs.writeFile(studentInfoPath + '/studentInfo.json', 
                            JSON.stringify(studentInfos), 'utf8', err => {
                                if (err){
                                    reject(err);
                                }
                                else{
                                    resolve();
                                }
                            }
                        );
                    }
                });
            }
        });

        return Promise.all([B,C]);
    });
}

module.exports = {
    readTitles,
    extractFolderPath,
    changeFolderName,
    refactorFile,
    getFiles,
    refactorFolder,
    extractZipBeautiful,
    extractZip,
    extractStudentinfo,
};





