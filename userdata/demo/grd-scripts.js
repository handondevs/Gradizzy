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

module.exports = {
    getTestPath,
    submissions,
    getSubmissionReport,
    getReport,
    getAllReport,
    testSubmission,
    testAll,
};
