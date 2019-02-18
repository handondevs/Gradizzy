const fs = require('fs-extra');

const addSubmissions = function(path) {
    fs.copy(path, __dirname+'/src/main/java')
    .then(() => {

    })
    .catch(err => {
        if (err) return console.error(err)
        console.log('success!')
    })
}

const addTest = function(path) {

}

const getAllTests = function(path) {

}

const getTestPath = function() {
    return __dirname+'/src/main/java';
}

const submissions = function() {

}

const getReport = function(submission) {
    
}

const getAllReports = function() {

}

const testSubmission = function(submission) {

}

const testAll = function() {

}

const extractAllStudentInfo = function(info_files){
    var result =[];
    for(var i=0; i<info_files.length();i++){
        result.push(extractStudentinfo(info_files[i]));
    }
    return result;
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

const extractStudentinfo = function(path) {
    const fs =require('fs')
    fs.readFile(path, (err,data)=> {
        if (err) throw err;
        var string = data.toString();
        //console.log(string);
        delim=":";
        var res=readNext(string,delim).result;
        var re = readNext(string, delim).remain;
        delim = "(";
        var name = readNext(re,delim).result;
        re = readNext(re,delim).remain;
        delim = ")";
        var id = readNext(re,delim).result;
        re = readNext(re,delim).remain;
        delim = ":";
        re = readNext(re,delim).remain;
        delim ="\n";
        var assignment = readNext(re,delim).result;
        re = readNext(re,delim).remain;
        delim = ":";
        re = readNext(re,delim).remain;
        delim ="\n";
        var date = readNext(re,delim).result;
        re = readNext(re,delim).remain;
        delim=":";
        var status = readNext(re,delim).result;
        re = readNext(re,delim).remain;
        delim =".";
        re = readNext(re,delim).remain;
        delim=":";
        var re = readNext(re,delim).remain;
        delim =".";
        re = readNext(re,delim).remain;
        delim =":";
        re = readNext(re,delim).remain;
        delim="\n";
        re = readNext(re,delim).remain; //begin to read fileanem
        var file = [];
        while (re!=null){
        delim=":";
        re = readNext(re,delim).remain;
        delim ="\n";
        var origin_filename = readNext(re,delim).result;
        re = readNext(re,delim).remain;
        delim =":";
        re  = readNext(re,delim).remain;
        delim = "\n";
        var filename  = readNext(re,delim).result;
        re  = readNext(re,delim).remain;
        file.push({origin_filename,filename});
        }
        return {
            name, id, assignment, date, file
        }
    })
}

module.exports = {
    getTestPath,
    submissions,
    //getSubmissionReport,
    getReport,
    //getAllReport,
    testSubmission,
    testAll,
    extractStudentinfo,
};
