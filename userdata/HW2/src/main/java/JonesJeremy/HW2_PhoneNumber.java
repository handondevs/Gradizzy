/*
Jeremy Jones
This program takes a given phone number and formats it
 */
import java.util.Scanner;
public class HW2_PhoneNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String number, area, first, last; //Declaring variables
        System.out.println("This program will format a string as a phone number.");
        System.out.print("Enter the number: ");
        number = input.nextLine();
        if (number.length()==10){ //Verifying string length
            area = number.substring(0,3);
            first = number.substring(3,6);
            last = number.substring(6);
            System.out.println("(" + area + ")" + first + "-" + last);
        }
        else{ //Giving second attempt at input
            System.out.print("Not a valid number. Please enter another one: ");
            number = input.nextLine();
            if (number.length()==10){ //Verifying string length
                area = number.substring(0,3);
                first = number.substring(3,6);
                last = number.substring(6);
                System.out.println("(" + area + ")" + first + "-" + last);
            }
            else{//Ending program
                System.out.println("You missed your second try! No more chances!");
            }
        System.out.println ("Bye.");
        }
    
    }
    
}
