const uiAction = require('../uiActions');

//uiAction.changeFolderName('../../../demo/src/test/java/studentA', 'studentB');
/*uiAction.refactorFile('../../../demo/src/test/java/studentB/GradeAssessment.java', 'studentB', (err) => {
    if (err)
    {
        console.log(err);
    } 
})*/

uiAction.refactorFolder('../../../demo/src/main/java/HW1_Sathenapalli/').then(() => {
    console.log('Success');
}).catch(err => {
    console.log(err);
})