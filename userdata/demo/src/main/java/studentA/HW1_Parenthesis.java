/*
Rajan Acharya
This program will reads text from user and print the part in the paraenthesis.

*/
package studentA;
import java.util.Scanner;
public class HW1_Parenthesis {

  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Getting the input from user.
        System.out.println("This program will read one line of text from the user and extract the part of it that is in paranthesis.");
        System.out.print("Enter one line of text(It must include parenthesis.): ");
        String text = in.nextLine();
        String word = text.substring(text.indexOf("(")+1);// Extracting the word in parenthesis.
        System.out.println("The text in parenthesis is: " + word );// Printing the word in parenthesis.
        System.out.println("Bye");
        
        
    }
    
}
