// arun joel sathenapalli
//1001664942
package hw2_phonenumber;
import java.util.Scanner;
/**
 *
 * @author moham
 */
public class HW2_PhoneNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner kb = new Scanner(System.in);
        
        String number = "";
        String onetothreeDigits = "";
        String ThreetosevenDigits = "";
        String lastFourDigits = "";
        
        System.out.println("This program will format a string as a phone number.");
        System.out.print("Enter the number: ");
        
        //The variable number takes in input from the user and stores it.
        number = kb.nextLine();
            
            //The conditionis for if the number provided is exactly 10 digits long.
        if (number.length() == 10) {
            
            //This part of the program takes the input from the variable number and splits it into 3 parts.
            onetothreeDigits = number.substring(0,3);
            ThreetosevenDigits = number.substring(3,6);
            lastFourDigits = number.substring(6);
            
            //This part of the code concatenates those three parts in a formatted output.
            System.out.printf("Formatter number: (%s)%s-%s%n", onetothreeDigits,ThreetosevenDigits,lastFourDigits);
            
        } else {
            //The program takes this path only if the number provided is not exactly 10 digits long.
            System.out.print("Not a valid number. ");
            
            //allows the user to enter their number once more.
            System.out.print("Please enter another one: ");
            number = kb.nextLine();
            
            if (number.length() == 10) {
                onetothreeDigits = number.substring(0,3);
                ThreetosevenDigits = number.substring(3,6);
                lastFourDigits = number.substring(6);

                System.out.printf("Formatter number: (%s)%s-%s%n",onetothreeDigits,ThreetosevenDigits,lastFourDigits);
            } else {
                System.out.println("You missed your second try! No more chances!");
            }
            
            }
        System.out.println("Bye.");
    }
    
}

  

    
    

