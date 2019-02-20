
import java.util.Scanner;

/*
Joshua Gonzalez
This program takes a name given from user input, changes the first letter of each to uppercase and
then inputs it into a specific way
 */

/**
 *
 * @author joshu
 */

 
public class HW2_Names {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        String name, first, last;
        int temp;
        
         //String output = input.substring(0, 1).toUpperCase() + input.substring(1);       
        
        System.out.print("Please enter your first and last name: ");
        name = kb.nextLine();  //scanner
        temp = name.indexOf(" ");    //separates the two words 
        first = name.substring(0,temp);  //singles out the first name or first word
        last = name.substring(temp+1);   //singles out the last name or second word
        first = first.substring(0, 1).toUpperCase()+first.substring(1);  //changes the letter of the first name to capital
        last = last.substring(0,1).toUpperCase()+last.substring(1);   //changes the letter of the last name to capital
        String letterOne = first.substring(0,1);  //singles out the first letter of the first name or first word
        String letterTwo = last.substring(0,1);   //singles out the first letter of the last name or second word
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.printf("|%-15s|%-15s|%s.%s.|",last,first,letterOne,letterTwo); //prints the last name, first name, then the first name letter, and last name letter
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
}
