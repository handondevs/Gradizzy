
import java.util.Scanner;

/*
Joshua Gonzalez
This program takes a user input phone numebr or any 10 digits and formats them like a phone number
also if the user enters it incorrectly it will give them a second chance
 */

/**
 *
 * @author joshu
 */
public class HW2_PhoneNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in); //scanner for user input
        String phoneNumber; //will later be used as input
        
        System.out.println("This program will format a string as a phone number."); //tells the user information
        System.out.print("Enter the number: "); //asks for a number
        phoneNumber = kb.nextLine(); //takes the user input and assigns it to the string we made earlier
        int size = phoneNumber.length(); //finds the length of the string
        
        if (size == 10){   //makes sure the size of the string is exactly 10
        String a = phoneNumber.substring(0,3);  //first 3 digits
        String b = phoneNumber.substring(3,6);  //second 3 digits
        String c = phoneNumber.substring(6,10); //last 4 digits
        System.out.printf("Formated number: (%s)%s-%s",a,b,c); //prints the formated number
        System.out.println(""); //adds a line for the "bye" at the end of the program
        }
        else{
        System.out.print("Not a valid number. Please enter another one: "); //tells the user its wrong and lets them try again
        phoneNumber = kb.nextLine();  //takes user input a second time
        int size2 = phoneNumber.length();  //finds the length of the string
        
        if(size2 == 10){  //checks to make sure the legth is 10 
        String a = phoneNumber.substring(0,3);  //repetition from the first time
        String b = phoneNumber.substring(3,6);
        String c = phoneNumber.substring(6,10);
        System.out.printf("Formated number: (%s)%s-%s",a,b,c);
        System.out.println("");
        }
        else{
            System.out.println("You missed your second try! No more chances!");  //if they mess up a second time it tells them no more chances     
        }
        }
        System.out.println("Bye.");
    }
    
}
