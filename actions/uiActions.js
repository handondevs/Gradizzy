const fs = require('fs-extra');
const path = require('path');
const unzip = require('unzip');

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

const getFiles = function(folderPath, regex) {
    let files = fs.readdirSync(folderPath).map(fileName => {
        return path.join(folderPath, fileName);
    }).filter(isFile);
    if (!regex){
        return files;
    }
    return files.filter(fileName => {
        return regex.test(fileName);
    });
}

const refactorFolder = function(path) {
    if (isFile(path)){
        return new Promise((resolve, reject) => {
            reject(new Error('Not a folder.'));
        })
    }
    const files = getFiles(path);
    const comps = extractFolderPath(path);
    console.log(comps);
    const promises = files.map(filePath => (new Promise((resolve, reject) => {
        refactorFile(filePath, comps.name, (err) => {
            if (err){
                reject(new Error('Error refactoring file: '+filePath+'\nMore details:\n' + err));
            }
            else {
                resolve(undefined);
            }
        })
    })))
    return Promise.all(promises);
}

const extractZip = function(zip_path, dest) {
    var readStream = fs.createReadStream(zip_path);
    var writeStream = fstream.Writer(dest);
    
    readStream
    .pipe(unzip.Parse())
    .pipe(writeStream)
}

const getInfoFiles = function(submissions_dir) {
    return getFiles(submissions_dir,
        /.*_[a-z]{3}[0-9]{4}_attempt_[0-9]{4}-[0-9]{2}-[0-9]{2}-[0-9]{2}-[0-9]{2}-[0-9]{2}\.txt/g);
}

const extractAllStudentInfo = function(info_files){
    // From Tuan Hung
}

const parseStudentName = function(student_name, strBetween) {

}

const extractZipBeautiful = async function(zip_path, dest, studentInfoSavePath) {
    extractZip(zip_path, dest);
    let infoFiles = getInfoFiles(dest);
    let studentInfos = extractAllStudentInfo(infoFiles);
    const { full: dest } = extractFolderPath(dest);
    return Promise.all(studentInfos.map(student => {
        const { studentName } = parseStudentName(student.name);
        let student_folder = fs.mkdirsSync(full + '/' + studentName.full);
        return Promise.all(student.files.map(file => new Promise( (resolve, reject) => {
            fs.copy(dest+'/'+file.filename, student_folder + '/' + file.original_filename, function(err){
                if (err){
                    reject(new Error('Error copying file from:\n'+
                    '\tsrcDir: "' + dest + '/",\n'+
                    '\toldFileName: "' + file.filename + '"\n'+
                    'to the following path:\n' + 
                    '\tdestDir: "' + student_folder + '/",\n'+
                    '\tfile: "' + file.original_filename + '"\n'));
                }
                else {
                    resolve(undefined);
                }
            });
        })))
    }))
    .then(() => Promise.all(infoFiles.map(file => new Promise( (resolve, reject) => {
        fs.remove(dest + '/' + file, err => {
            if (err) {
                reject(err);
            }
        });
    }))))
    .then(() => new Promise( (resolve, reject) => {
        if (studentInfoSavePath)
            const { full : studentInfoSavePath } = extractFolderPath(studentInfoSavePath);
            fs.createFile(studentInfoSavePath + '/studentInfo.json', reject);
    }));
}

module.exports = {
    readTitles,
    extractFolderPath,
    changeFolderName,
    refactorFile,
    getFiles,
    refactorFolder,
    extractZipBeautiful
};





