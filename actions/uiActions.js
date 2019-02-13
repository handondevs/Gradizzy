const fs = require('fs');
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

const getFiles = function(folderPath) {
    return fs.readdirSync(folderPath).map(fileName => {
        return path.join(folderPath, fileName);
    }).filter(isFile);
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

module.exports = {
    readTitles,
    extractFolderPath,
    changeFolderName,
    refactorFile,
    refactorFolder,
};





