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

const readNext = function(string, delimiter){
    var num = string.indexOf(delimiter);
    var res = string.substring(1,num);
    var re = string.substring(num);
    return{ 
        result: res,
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
        var re = readNext(re,delim).remain;
        delim = ")";
        var id = readNext(re,delim).result;
        var re = readNext(re,delim).remain;
        delim = ":";
        var re = readNext(re,delim).remain;
        delim ="\n";
        var assignment = readNext(re,delim).result;
        var re = readNext(re,delim).remain;
        delim = ":";
        var re = readNext(re,delim).remain;
        delim ="\n";
        var date = readNext(re,delim).result;
        var re = readNext(re,delim).remain;
        delim=":";
        var status = readNext(re,delim).result;
        var re = readNext(re,delim).remain;
        delim =".";
        var re = readNext(re,delim).remain;
        delim=":";
        var re = readNext(re,delim).remain;
        delim =".";
        var re = readNext(re,delim).remain;
        delim =":";
        var re = readNext(re,delim).remain;
        delim="\n";
        var re = readNext(re,delim).remain;
        delim=":";
        var re = readNext(re,delim).remain;
        delim ="\n";
        var origin_filename = readNext(re,delim).result;
        var re = readNext(re,delim).remain;
        delim =":";
        var re  = readNext(re,delim).remain;
        delim ="\n";
        var filename  = readNext(re,delim).result;
       console.log(name," ",id," ",assignment," ",date," ",origin_filename,"\n ",filename);
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
