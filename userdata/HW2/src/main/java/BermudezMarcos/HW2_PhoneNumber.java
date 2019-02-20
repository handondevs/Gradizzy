/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2_phonenumber;
import java.util.Scanner;
        
/**
 *
 * @author marcosbermudez
 * By: Marcos Bermudez
 * Problem: We were asked to take input from the user and format it to look like
 * (###)###-### and if it did not have 10 characters to print out a statement to the 
 * user that what they input was invalid
 */
public class HW2_PhoneNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This program will format a string as a phone number.");
        Scanner numb = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String phone = numb.nextLine();
        
        if(phone.length() == 10)
        {
            String beginning = phone.substring(0,3);
            String middle = phone.substring(3,6);
            String end = phone.substring(6,10);
            System.out.println("Formatted number: ("+beginning+")"+middle+"-"+end);
        }
        else
        {
            System.out.print("Not a valid number. Please enter another one: ");
            phone = numb.nextLine();
            if (phone.length() == 10)
            {
            String beginning1 = phone.substring(0,3);
            String middle1 = phone.substring(3,6);
            String end1 = phone.substring(6,10);
            System.out.println("Formatted number: ("+beginning1+")"+middle1+"-"+end1);
            }
            else
            {
                System.out.println("You missed your second try! No more chances!");
            }
        }
        System.out.println("Bye.");
    }
    
}
