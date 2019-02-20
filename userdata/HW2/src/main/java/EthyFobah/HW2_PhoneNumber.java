/* Fobah Ethy
Write a program that reads a string and formats it as a phone number.
First it should check that the string has exactly 10 symbols. If it does, the program will print 
the formatted version. If the string does not have exactly 10 symbols, print Invalid and do not process it. */
import java.util.Scanner;

public class HW2_PhoneNumber {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String number, format1, format2, format3; // create to store strings
        int value; // create to store integer numbers
        System.out.println(" This program will format a string as a phone number."); // announce current  step. user's input required
        System.out.println("Enter a number: ");// also announce current step. user's input required 
        number = kb.nextLine(); // allow to have user's input

        value = number.length();// check the length of string or integer enterred by user

        if (value == 10) // Condition statement - compare the length to 10 -only if correct goes to next in bracket 
        {
            format1 = number.substring(0, 3);// capture the first set of 3 digits or characters
            format2 = number.substring(3, 6);// capture the second set of 3 digits or characters
            format3 = number.substring(6, 10);// capture the last set of 4 digits or characters
            System.out.printf("Formatted number:(%s)%s-%s%n", format1, format2, format3); // print this format only if above statement is correct
        } 
        else // if the "if" statement is not correct we go to the one below 
        {
            System.out.println("Not a valid number.Please enter another one:");//  announce users with the next step
           
            number = kb.nextLine();// allow to have user's input
            value = number.length();//check the length of string or integer enterred by user
            if (value == 10) // Condition statement - compare the length to 10 -only if correct goes to next in bracket
            {
                format1 = number.substring(0, 3);// capture the first set of 3 digits or characters
                format2 = number.substring(3, 6);// capture the second set of 3 digits or characters
                format3 = number.substring(6, 10);// capture the last set of 4 digits or characters
                System.out.printf("Formatted number:(%s)%s-%s%n", format1, format2, format3);
            } 
            else // if the "if" statement is not correct we go to the one below 
            {
                System.out.println("you missed your second:"); // print this format only if above else statement is correct
            }
        }
    }


}
