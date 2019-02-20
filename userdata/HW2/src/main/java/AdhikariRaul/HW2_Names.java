
/*
 Raul Adhikari
this program asks the user for its name, then it prints it out in a specific way.
 */

import java.util.Scanner;

public class HW2_Names {


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter your first and last name: ");
        
        String firstName = kb.next();
        String lastName = kb.next();
        String fullName1 = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
        String fullName2 = lastName.substring(0,1) .toUpperCase() + lastName.substring(1);
       
        String fName = firstName.substring(0, 1).toUpperCase();
        String lName = lastName.substring(0,1).toUpperCase();
     
       
       
        
       System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
       System.out.printf("|%s               |%s               |%s.%s.|%n",fullName2,fullName1,fName,lName);
       System.out.println("~~~~~~~~~1~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
}
