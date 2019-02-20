/**
 *
 * @author aaryan patel
 */
import java.util.Scanner;
public class HW2_PhoneNumber {

    public static void main(String[] args) {
        //goal: get input String and format into an actual phone-number format, then print.
        Scanner kb = new Scanner(System.in);
        
        //get phone number
        System.out.println("This program will format a string as a phone number.");
        System.out.print("Enter the number: ");
        String num = kb.next(); //variable num is short for number (phone number)
        
        //convert the entered number into a proper phone number format
        //output also included inside if statements  
        if(num.length() != 10){
            System.out.print("Not a valid number. Please enter another one: ");
            num = kb.next();
            
            if(num.length() != 10){
                System.out.println("You missed your second try! No more chances!");
            }
            else{
                String properFormat = "(" + num.substring(0,3) + ")" + num.substring(3,6) + "-" + num.substring(6,10);
                System.out.printf("Formatted number: %s%n",properFormat);
            }
        }
        else{
            String properFormat = "(" + num.substring(0,3) + ")" + num.substring(3,6) + "-" + num.substring(6,10);
            System.out.printf("Formatted number: %s%n",properFormat);
        }
        System.out.println("Bye.");
    }
    
}
