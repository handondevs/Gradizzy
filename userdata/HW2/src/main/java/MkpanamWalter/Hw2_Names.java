// Walter Mkpanam
// CSE 1310-004
// Homework 2: Names
// Program Description: This program will ask the user for their full name 
//                     and print the name in a table with 3 columns: Last,
//                      First, and initials

import java.util.Scanner; 

public class Hw2_Names {

   
    public static void main(String[] args) {
        String userInput; // variable for user input
        
        Scanner kb = new Scanner(System.in); // scanner in object
        
        System.out.print("Please enter your first and last name: ");
        userInput = kb.nextLine(); 
        
        int space = userInput.indexOf(" "); // for string processing
        int length = userInput.length(); // get length of string
        String firstName = userInput.substring(0,space); // get firstname
        String lastName = userInput.substring(space,length);// get lastname
        String firstInitial = userInput.substring(0,1); // get first initial
        String lastInitial = userInput.substring(space,space+2); // get second
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.printf("|%s               |%s               |%s.%s.|\n",lastName,
                firstName,firstInitial,lastInitial); // print in specified format
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
               
    }
    
}
