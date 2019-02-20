/*
 * This program will take 10 characters and put it in a 
 * phone number format (###)###-####
 * if it's not 10 characters then it will print an invalid input
 */

/**
 * UTA ID: 1001584020
 * @author Justin
 */
import java.util.Scanner;

public class HW2_PhoneNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating variables to be reinitialized later
        String number = "";
        String firstThree, secondThree, lastFour;
        int len = 0;
        // creating a scanner for input
        Scanner input = new Scanner(System.in);
        
        // giving the user instructions and so forth
        System.out.println("This program will format a string as a phone number.");
        System.out.println("Enter the number: ");
        number = input.nextLine();
        len = number.length(); // initializing the length
        
        if(len != 10) // if the length isn't 10 then the following will happen
        {
            System.out.println("Not a valid number. Please enter another one: ");
            number = input.nextLine();
            len = number.length();
            if(len != 10) // no more tries
            {
                System.out.println("You missed your second try! No more chances!");
            }
            else // last chance
            {
                firstThree = number.substring(0, 3);
                secondThree = number.substring(3,6);
                lastFour = number.substring(6, 10);
            
                System.out.println("(" + firstThree + ")" + secondThree + "-" + lastFour);
            }
        }
        else // if it was valid from the begining
        {
            firstThree = number.substring(0, 3);
            secondThree = number.substring(3,6);
            lastFour = number.substring(6, 10);
            
            System.out.println("(" + firstThree + ")" + secondThree + "-" + lastFour);
        }
        System.out.println("Good Bye"); // because it'd be rude not to
    }
    
}
