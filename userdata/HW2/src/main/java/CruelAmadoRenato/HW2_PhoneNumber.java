/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Renato Cruel Amado
 * This program will take a phone number inputted by the user, decide whenever
 * or not it is a valid number and format it
 */
public class HW2_PhoneNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Introduce scanner for user input
        Scanner kb = new Scanner (System.in);
        //Set string for phone number given by the user
        String pn;
        //Set strings for formatted phone number parts 1, 2 and 3
        String fpn1, fpn2, fpn3;
        //Set string for phone number given by the user on second try
        String phn;
        //Set strings for formatted phone number try#2 parts 1, 2 and 3
        String fphn1, fphn2, fphn3;
        
        System.out.println("This program will format a string as a phone number.");
        System.out.print("Enter the number: ");
        //Take phone number from user
        pn = kb.nextLine();
        //Set interger to later make sure that phone number given by user has
        //10 digits
        int pnl = pn.length();
        
        //Set condition to make sure number is 10 digits long
        if (pnl==10){
        //Set substrings from phone number introduced by user to be separated in
        //the 3 parts that will be later formatted
        fpn1 = pn.substring(0,3);
        fpn2 = pn.substring(3,6);
        fpn3 = pn.substring(6,10);
        //If condition is meet, give proper formation (xxx)-yyy-zzzz
        System.out.print("Formatted number: ");    
        System.out.print("("+fpn1+") ");
        System.out.println( fpn2 + " - " + fpn3);
        }
        //If not give user a second try
        else{
        System.out.print("Not a valid number. Please enter another one: ");
        //Take second try for user
        phn = kb.nextLine();
        //Set interger to later make sure that phone number given by user has
        //10 digits
        int phnl = phn.length();
         
        //Second if statement to make sure user data is 10digits long
        if (phnl==10){
        //Set substrings from phone number introduced by user to be separated in
        //the 3 parts that will be later formatted
        fphn1 = phn.substring(0,3);
        fphn2 = phn.substring(3,6);
        fphn3 = phn.substring(6,10);
        //If condition is meet, give proper formation (xxx)-yyy-zzzz
        System.out.print("Formatted number: ");    
        System.out.print("("+fphn1+") ");
        System.out.println( fphn2 + " - " + fphn3);
        }
        //If not, dont take any more attempts from user
        else{
        System.out.println("You missed your second try! No more changes!");
        }
        }
        System.out.println("Bye");
    }
    
}
