/* 
Endy Romero
Write a program that asks the user for their full name given in the format 
first last. The program will do the necessary processing and print the name in 
a table with 3 columns: Last, First, Initials.
*/

import java.util.Scanner;

public class HW2_Names {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String name, first, last, initials;
        String hLine = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        int idx;
        
        System.out.print("Please enter your first and last name: ");
        name = kb.nextLine();
        idx = name.indexOf(" ");
        first = name.substring(0,idx);
        first = first.substring(0, 1).toUpperCase() + first.substring(1); 
                //capitalizes the first letter of the string
        last = name.substring(idx+1);
        last = last.substring(0, 1).toUpperCase() + last.substring(1);
                //capitalizes the first letter of the string

        initials = (name.charAt(0) + "." + last.charAt(0) + ".");
        
        System.out.println(hLine);
        System.out.printf("|%-15s|%-15s|%-4S|%n",last,first,initials);
        System.out.println(hLine);

    }
    
}
