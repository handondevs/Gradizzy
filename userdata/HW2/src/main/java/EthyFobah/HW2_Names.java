import java.util.Scanner;
// Fobah Ethy
/*Write a program that asks the user for their full name given in the format first last. 
The program will do the necessary processing and print the name in a table with 3 columns: 
Last, First, Initials. Requirements/Specifications:
1. Your program run must be identical with the one shown as an example (both in how it reads the input and it on what it prints). The table must have the top and bottom lines as shown. 
2. The columns for Last and First must have exactly 15 spaces each. 
3. The data in the columns must be LEFT aligned 
4. You can assume that the user gives good input: two words separated by one space
*/

public class HW2_Names {

   
    public static void main(String[] args) {
     Scanner kb= new Scanner(System.in);
     String name, first, last,Initial1,Initial2;
     int pace;
     String curveline= "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
          System.out.print("Enter first and last name: ");
          name= kb.nextLine();   //Allow the user to input their name
          pace = name.indexOf(" "); // looking for the space after user's first entry
          first= name.substring(0,pace); // Allow user to space first name from last name
          last= name.substring(pace+1);
          Initial1=first.substring(0,1); // Copy user's first character of his first name .
          Initial2= last.substring(0,1);// Copy user's first character of his last name 
          System.out.println(curveline);
          System.out.printf("|%-15s|%-15s|%s.%s.|%n",last,first,Initial1,Initial2); // print the name in the desired format
          System.out.println(curveline);
   
     
    }
    
}
