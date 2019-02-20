/*
 Alfred Amponsah
This program prints the user's full name given in the format "first last" and 
print the name in a table with 3 columns: Last, First, Initials.
 */

import java.util.Scanner;

public class HW2_Names {

    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String name, first, last, initial_1, initial_2;
        String hLine = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        String object = "|"; //Left vertical line before name
        String period = "."; //Period between the initals
        int start = 0, nextSpace;
        
        System.out.print("Please enter your first and last name: ");// Enter first and last name
        name = kb.nextLine();
        
        nextSpace = name.indexOf(" ", start);//position to find the first empty space and start 
        first = name.substring(start, nextSpace);
        start = nextSpace + 1;
        last = name.substring(start);
        
        initial_1 = last.substring(0,1); //Last name initial
        initial_2 = first.substring(0,1);//first name initial
        
        System.out.println(hLine);//Top Line
        System.out.printf("|%s %15s%s %15s%s| %n", last, object, first, object+initial_1,period+initial_2);
        System.out.println(hLine);//Bottom Line
       
        
        
        
        
        
    }
    
}
