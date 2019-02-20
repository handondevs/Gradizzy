/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Labib Haq
 *1001061166
 *Description: Takes in a phone number and prints it in the correct format
 */
import java.util.Scanner;
public class HW2_PhoneNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //sets up user input and asks for a phone number
        Scanner kb = new Scanner(System.in);
        System.out.println("This program will format a string as a phone number.");
        System.out.print("Enter a number: ");
        String phonenum = kb.next();

        // checks if phone # is 10 symbols and prints it formatted
        if (phonenum.length() == 10) {
            System.out.print("Formatted number:");
            System.out.println("(" + phonenum.substring(0,3) + ")" + phonenum.substring(3,6)  + "-" + phonenum.substring(6));
        }
        // asks user to input another number if first input was not 10 symbols
        else {
            System.out.print("Not a valid number. Please enter another one: ");
            phonenum = kb.next();
            // prints the phone # if the user enters 10 symbols correctly the 2nd time
            if (phonenum.length() == 10) {
                System.out.print("Formatted number:");
                System.out.println("(" + phonenum.substring(0,3) + ")" + phonenum.substring(3,6)  + "-" + phonenum.substring(6));
            }
            // gives the user no more chances if user failed to put 10 symbols on the 2nd try
            else {
                System.out.println("You missed your second try! No more chances!");
            }
        }
        System.out.println("Bye");
   }
}
    

