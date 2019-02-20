/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RWBOYSEN18
 */
import java.util.Scanner;
public class HW2_PhoneNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String number;
        
        System.out.println("This program will format a string as a "
                + "phone number. ");
        System.out.print("Enter the Number: ");
        number = keyboard.next();
        
        while (number.length() != 10)
        {
            System.out.print("Not a valid number. Please enter another one:");
            number = keyboard.next();
        }
        if (number.length()== 10 )
        {
            
            String format = number.replaceFirst("(\\d{3})(\\d{3})(\\d+)", 
                    "($1) $2-$3");
            System.out.print("Formatted Number: "+ format +"\n");
            
        }
        System.out.println("bye");
        
        
           
    }
    
}
