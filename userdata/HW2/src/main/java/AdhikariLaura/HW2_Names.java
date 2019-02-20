


/*
  Laura Adhikari
Formated output, string processing
 */

import java.util.Scanner;

public class HW2_Names {
    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);
        //declare variables
        String  first, last;
        String hLine = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
       
              
        System.out.print("Please enter your first and last name: ");
        first = input.next();
        last = input.nextLine();
               
        String initials =first.substring(0,1) + "." + last.substring(1,2) + ".";
        initials = initials.toUpperCase();
        
        //changing first letter of first and last name to uppercase
        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
        last = last.substring(1,2).toUpperCase() + last.substring(2).toLowerCase();
        
        System.out.println(hLine);
        System.out.printf(" |%-15s|%-15s|%s|%n ",last ,first,initials );
        System.out.println(hLine);
        
    }
}
