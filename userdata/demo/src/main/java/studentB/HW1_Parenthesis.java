package studentB;


import java.util.Scanner;

/**
 *
 * Timothy Balela
 */
public class HW1_Parenthesis {
    public static void main(String[] args) {
        // Instantiate Variables
        Scanner kb = new Scanner(System.in);
        String Parenthesis = " ";
        String User_Input = " ";
      
        // Printout Text
        System.out.println("This program will read one line of text from the user and extract the part of it that is in parenthesis.");
        System.out.print("Enter one line of text (It must include parenthesis.):");
        
        // Get user input
        User_Input = kb.nextLine();
        
        // Tell user what's in parenthesis
        System.out.print("The text in parenthesis is: ");
       
        // To get parenthesis text and print
        //User_Input.substring(User_Input.indexOf("("),User_Input.indexOf(")")+1);
        System.out.println(User_Input.substring(User_Input.indexOf("(")+1,User_Input.indexOf(")")));
        
        // Text Bye
        System.out.println("Bye");
        
    }
    
}
