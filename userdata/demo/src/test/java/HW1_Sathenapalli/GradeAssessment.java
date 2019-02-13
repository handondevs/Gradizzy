package HW1_Sathenapalli;

import info.debatty.java.stringsimilarity.JaroWinkler;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.greaterThan;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;

public class GradeAssessment{

    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @Rule
    public TestName testName = new TestName();
    
    @Before
    public void setUpOutput() {
        if (testName.getMethodName().equals("FACE"))
            return;
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    public void resetIO(){
        testIn.reset();
        testOut.reset();
    }
    
    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();
    }

    @After
    public void restoreSystemIO() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }
    

    @Test
    public void FACE() {
        try{
            System.out.println("FACE: ");
            HW1_Face.main(new String[0]);
        } catch (Exception e){
            System.err.println(e);
        }
    }
    
    @Test
    public void ANIMALS_UI(){      
        JaroWinkler jw = new JaroWinkler();
        provideInput("fox whale eagle");
        HW1_Animals.main(new String[0]);
        assertThat(getOutput(),
            allOf(containsString("Enter three animal names separated by a space"),
                containsString("The three animals are"),
                containsString("The tiny whale asked the eagle to go check on the restless fox"),
                containsString("Bye"))
        );
        assertThat("Output Similarity",
                jw.similarity(getOutput(), 
            "Enter three animal names separated by a space:\n" +
            "The three animals are:\n" +
            "fox\n" +
            "whale\n" +
            "eagle\n" +
            "The tiny whale asked the eagle to go check on the restless fox.\n" +
            "Bye\n"),
             greaterThan(0.7)
            );
    }
    
    @Test
    public void ANIMALS_FUNC(){      
        provideInput("dog cat tiger");
        HW1_Animals.main(new String[0]);
        assertThat(getOutput(),containsString("The tiny cat asked the tiger to go check on the restless dog"));
        resetIO();
        
        provideInput("Peter Hailey love");
        HW1_Animals.main(new String[0]);
        assertThat(getOutput(),containsString("The tiny Hailey asked the love to go check on the restless Peter"));
    }
    
    @Test
    public void AVG_UI(){      
        JaroWinkler jw = new JaroWinkler();
        provideInput("100 85 90");
        HW1_Avg.main(new String[0]);
        assertThat(getOutput(),
            allOf(containsString("Enter grade 1:"),
                containsString("Enter grade 2"),
                containsString("Enter grade 3"),
                containsString("The average is: 91.66666666666667"),
                containsString("Bye"))
        );
        assertThat("Output Similarity",
                jw.similarity(getOutput(), 
            "Enter grade 1:" +
            "Enter grade 2:" +
            "Enter grade 3:" +
            "The average is: 91.66666666666667\n" +
            "Bye\n"),
             greaterThan(0.75)
            );
    }
    
    @Test
    public void AVG_FUNC_1(){  
        double res;
        provideInput("100 85 90");
        HW1_Avg.main(new String[0]);
        res = (100+85+90)/3.0;
        assertThat(getOutput(),containsString(Double.toString(res)));
        resetIO();
    }
    
    @Test
    public void AVG_FUNC_2(){  
        double res;
        provideInput("3012 4213 593");
        HW1_Avg.main(new String[0]);
        res = (3012+4213+593)/3.0;
        assertThat(getOutput(),containsString(Double.toString(res)));
    }
    
    @Test
    public void AVG_FUNC_3(){
        double res;
        provideInput("-299 42 4021");
        HW1_Avg.main(new String[0]);
        res = (-299+42+4021)/3.0;
        assertThat(getOutput(),containsString(Double.toString(res)));
    }
    
    public int countSubstringOccurences(String str, String findStr){
        
        int lastIndex = 0;
        int count = 0;

        while(lastIndex != -1){

            lastIndex = str.indexOf(findStr,lastIndex);

            if(lastIndex != -1){
                count ++;
                lastIndex += findStr.length();
            }
        }
        
        return count;
    }
    
    @Test
    public void PARENTHESIS_UI(){      
        JaroWinkler jw = new JaroWinkler();
        provideInput("Wild animals (e.g. foxes and mice) can be seen in Arlington.");
        HW1_Parenthesis.main(new String[0]);
        assertThat(getOutput(),
                allOf(containsString("This program will read one line of text from the user and extract the part of it that is in parenthesis"),
                        containsString("Enter one line of text (It must include parenthesis.)"),
                        containsString("The text in parenthesis is"),
                        containsString("Bye"))
            );
        assertThat("High Output Similarity",
            jw.similarity(getOutput(), "This program will read one line of text from the user and extract the part of it that is in parenthesis.\n" +
            "Enter one line of text (It must include parenthesis.): Wild animals (e.g. foxes and mice) can be seen in Arlington.\n" +
            "The text in parenthesis is: e.g. foxes and mice\n" +
            "Bye"), greaterThan(0.7));
    }
    
    @Test
    public void PARENTHESIS_FUNC_1(){  
        provideInput("(HiHat) sdafw\n");
        HW1_Parenthesis.main(new String[0]);
        String res = "HiHat";
        String expectedRegex = res+"\\s*\n";
        String actual = getOutput();
        Pattern r = Pattern.compile(expectedRegex);
        Matcher m = r.matcher(actual);
        assertTrue("\nExpected: a string matching \"" +expectedRegex+ "\".\nGot: \n"+actual, m.find());
    }
    
    @Test
    public void PARENTHESIS_FUNC_2(){
        provideInput("THIS(lo v-e)\n");
        HW1_Parenthesis.main(new String[0]);
        String res = "lo v-e";
        String expectedRegex = res+"\\s*\n";
        String actual = getOutput();
        Pattern r = Pattern.compile(expectedRegex);
        Matcher m = r.matcher(actual);
        assertTrue("\nExpected: a string matching \"" +expectedRegex+ "\".\nGot: \n"+actual, m.find());
    }
    
    @Test
    public void PARENTHESIS_FUNC_3(){
        provideInput("Okay right... (   another  example  ) !!!\n");
        HW1_Parenthesis.main(new String[0]);
        String res = "   another  example  ";
        String expectedRegex = res+"\\s*\n";
        String actual = getOutput();
        Pattern r = Pattern.compile(expectedRegex);
        Matcher m = r.matcher(actual);
        assertTrue("\nExpected: a string matching \"" +expectedRegex+ "\".\nGot: \n"+actual, m.find());
    }
    
    public static void main(String[] args){
        String res = "HiHat";
        String expectedRegex = res+"\\s*Bye";
        Pattern r = Pattern.compile(expectedRegex);
        Matcher m = r.matcher("HiHat  \nBye");
        if (m.find()) {
            System.out.println("Found value: " + m.group(0) );
        }else {
           System.out.println("NO MATCH");
        }
    }

}