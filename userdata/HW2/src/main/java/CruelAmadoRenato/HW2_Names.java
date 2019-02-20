/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Renato Cruel Amado
 * This program will take first and last name from user and place it
 * in a table with 3 columns, First, Last, and Initials
 */
public class HW2_Names {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Introduce scanner for user input
        Scanner kb = new Scanner (System.in);
        //Introduce strings for names, initials and division line
        String name, first, last, initial, line;
        //Hardcode string for line with apropriate length
        line = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        
        System.out.print("Enter your first and last name: ");
        //Take first and last name from user
        name = kb.nextLine();
        //Set and interger with space to detect division between first and last
        int idx = name.indexOf (" ");
        //Use set interger to create a string for first and last, out of name
        first = name.substring(0,idx);
        last = name.substring(idx+1);
        //Remove the first letter of first and last name, to use as initials
        initial = first.substring(0,1) + "." + last.substring(0,1) + ".";
        //Print table with division line and specs indicated by the task
        System.out.println(line);
        System.out.printf("|%-15s|%-15s|%5s|\n", last, first, initial);
        System.out.println(line);
        
        
        
    }
    
}
