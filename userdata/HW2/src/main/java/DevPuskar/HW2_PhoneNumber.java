/*
Puskar Dev
This program reads reads a string from the user and formats it as a phone number format ( i.e. (xxx)yyy-zzzz ( e.g.(817)272-7227 )).
*/
import java.util.Scanner;
public class HW2_PhoneNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.printf("This program will format a string as a phone number.\n");
        System.out.printf("Enter the number: ");
        String number = in.nextLine();
        
        if (number.length() == 10)
        {
           System.out.printf("Formatted number: (%s)%s-%s\n",number.substring(0,3),number.substring(3,6),number.substring(6)); // using substring to access the specified segment of the number and priting it as in specified format.
           System.out.printf("Bye.\n");
           
        }
        else
        {
            System.out.printf("Not a valid number. Please enter another one: ");
            String number2 = in.nextLine();           
            if (number2.length() == 10) // nested if-else if used in case the user enters an invalid number the first time.
            {
                System.out.printf("Formatted number: (%s)%s-%s\n",number2.substring(0,3),number2.substring(3,6),number2.substring(6));
                System.out.printf("Bye.\n");
            }
            else
            {
                System.out.printf("You missed your second try! No more chances!\n"); // if the second attempt for phone number validation fails, prints as no more chances available.
                System.out.printf("Bye.\n");
            }
        }
        
    }
    
}
