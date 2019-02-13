package HW1_Sathenapalli;//Arun Joel Sathenapalli
//1001664942


/**
 *
 * @author arunj
 */
import java.util.Scanner;
public class HW1_Parenthesis {
    public static void main(String[] args){
        Scanner kb=new Scanner (System.in);
        String extract; int fp1,fp2;
        System.out.println("program will read one line of text fom the user and extract the part of it that is in the parenthesis");
        System.out.println("enter one line of text(it must include parenthesis)");
        extract=kb.nextLine();
        fp1=extract.indexOf("("); fp2=extract.lastIndexOf(")");
        System.out.println(extract.substring(fp1+1,fp2));
    
        
        
        
        
        
                
    }
    
}
