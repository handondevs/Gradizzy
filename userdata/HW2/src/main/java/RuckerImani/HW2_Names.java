/*
Imani Rucker
Write a program that asks the user for their full name given in the format first last. The program will do the necessary processing and print the name in a table with 3 columns: Last, First, Initials. Requirements/Specifications:

    Your program run must be identical with the one shown as an example (both in how it reads the input and it on what it prints). The table must have the top and bottom lines as shown.
    The columns for Last and First must have exactly 15 spaces each.
    The data in the columns must be LEFT aligned
    You can assume that the user gives good input: two words separated by one space. 
*/

import java.util.Scanner;

public class HW2_Names
{
    public static void main(String[] args)
    {
    // Use the print method Please enter your first and last name :
        System.out.print("Please enter your first and last name: ");

    // Allows user input with this method
        Scanner kb = new Scanner(System.in);
    // initialize variable names for int    
        int length, idexfn;
    // initialize variable names for string
        String first_lastname,first_name, header_line;
    //  initialize char names 
        char first_intial,last_intial;
    
    // creates header for table
       header_line = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        
    // stores string input in a variable called names
        first_lastname = kb.nextLine();
        
    // We need to find the text before and after the space
        idexfn = first_lastname.indexOf(" ");
        //int idexln = first_lastname.lastIndexOf(" ");
        
    // find the length at the end of the string
        length = first_lastname.length();
    // finds the first intial in first name
        
    // finds the first name
        first_name = first_lastname.substring(0,idexfn);
   
        
        
    // finds the last name in the string 
        String last_name = first_lastname.substring(idexfn +1 ,length);
    
    // finds first initial in first name
        first_intial = first_name.charAt(0);
    // finds first initial in last name
        last_intial = last_name.charAt(0);
        
     
   
    //Symbol printed out for table
        System.out.println(header_line);
  
    // Prints out 15 allocated spaces for the name
        System.out.printf("|%-15s|%-15s|%s.%s.|%n", first_name,last_name, 
                first_intial,last_intial);
  
    //Symbol printed out for table
        System.out.println(header_line);    
        
    }
}