/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Labib Haq
 * 1001061166
 * Description: takes a first and last name and prints it in a table with initials.
 */
import java.util.Scanner;
public class HW2_Names {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Set up user input and get it for first and last name
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String firstname = kb.next();
        String lastname = kb.next();
    
        //Capitalize the first letters and initials
        String firstprint = "|" + firstname.substring(0,1).toUpperCase() + firstname.substring(1);
        String lastprint = "|" + lastname.substring(0,1).toUpperCase() + lastname.substring(1);
        String initials = "|" + firstname.substring(0,1).toUpperCase() + "." + lastname.substring(0,1).toUpperCase() + ".|";
    
        //Use printf to format the info into a table
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.printf("%-15s %-15s %-15s\n", lastprint, firstprint, initials);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        System.out.println("Bye");
    }
    
}
