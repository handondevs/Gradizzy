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

console.log(uiAction.getFiles('/Users/phuocdo/Documents/Computer Science/Projects/ReactTest/gradle/SampleHW1',/.*_[a-z]{3}[0-9]{4}_attempt_[0-9]{4}-[0-9]{2}-[0-9]{2}-[0-9]{2}-[0-9]{2}-[0-9]{2}\.txt/g));