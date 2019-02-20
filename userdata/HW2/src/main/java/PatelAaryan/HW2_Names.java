/**
 *
 * @author aaryan patel
 */
import java.util.Scanner;
public class HW2_Names {
    
    public static void main(String[] args) {
        //goal: to retrieve a user-input name and output it in the format of the assignment.
        Scanner kb = new Scanner(System.in);
        
        //get name
        System.out.print("Please enter your first and last name: ");
        String name = kb.nextLine();
        
        //splitting name into first name and last name
        int space = name.indexOf(" ");
        String firstname = name.substring(0,space);
        String lastname = name.substring(space+1);
        
        //making the strings all capitalized
        String firstinitial = firstname.substring(0,1);
        String lastinitial = lastname.substring(0,1);
        String initials = firstinitial.toUpperCase() + "." + lastinitial.toUpperCase() + ".";
        
        //making a full name with initials uppercased
        String firstinitialCaps = firstinitial.toUpperCase();
        String lastinitialCaps = lastinitial.toUpperCase();
        String firstname2 = firstinitialCaps + name.substring(1,space);
        String lastname2 = lastinitialCaps + name.substring(space+2);
        
        //output
        System.out.printf("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~%n");
        System.out.printf("|%-15s|%-15s|%-4s|%n", firstname2, lastname2, initials);
        System.out.printf("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~%n");
    }
    
}
