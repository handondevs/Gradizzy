const uiAction = require('../uiActions');

//uiAction.changeFolderName('../../../demo/src/test/java/studentA', 'studentB');
/*uiAction.refactorFile('../../../demo/src/test/java/studentB/GradeAssessment.java', 'studentB', (err) => {
    if (err)
    {
        console.log(err);
    } 
})*/


// uiAction.refactorFolder('../../../demo/src/main/java/HW1_Sathenapalli/').then(() => {
//   console.log('Success');
// }).catch(err => {
//     console.log(err);
// })

/*
console.log(uiAction.getFiles('/Users/phuocdo/Documents/Computer Science/Projects/ReactTest/gradle/SampleHW1',/.*_[a-z]{3}[0-9]{4}_attempt_[0-9]{4}-[0-9]{2}-[0-9]{2}-[0-9]{2}-[0-9]{2}-[0-9]{2}\.txt/g));
*/

/*
uiAction.extractStudentinfo("/Users/phuocdo/Documents/Computer Science/Projects/ReactTest/gradle/sampleExtraction/Homework 1_msf5072_attempt_2019-01-31-02-51-33.txt")
.then(data => console.log(data))
.catch(err => console.log(err));
*/


uiAction.extractZipBeautiful('/Users/phuocdo/Documents/Computer Science/Projects/ReactTest/gradle/SampleHW1.zip',
    '/Users/phuocdo/Documents/Computer Science/Projects/ReactTest/gradle/sampleExtraction',
    '/Users/phuocdo/Documents/Computer Science/Projects/ReactTest/gradle/sampleExtraction')
.catch(err => {
    console.log(err);
})