
import java.util.Scanner;

//****************************************
// Name: Edrik Aguilera
// Class: HW2_Names
// Description: Take user input for their
// name and display a table using
// last name, first name, then initials
//****************************************

public class HW2_Names 
{
    public static void main(String[] args) 
    {
        // Allow access to user input
        Scanner myInput = new Scanner(System.in);
        
        // Declared variables
        int spaceIndex = 0;
        String usrInput = new String();
        String first = new String();
        String last = new String();
        String border = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        String initials = new String();
        
        // Prompt user to enter name
        System.out.print("Please enter your first and last name separated by a space: ");
        usrInput = myInput.nextLine();
        
        // Find idx of space
        spaceIndex = usrInput.indexOf(" ");
        // Store the substring of usrInput into first, Always capitalize first letter and lowercase the rest
        first = usrInput.substring(0, 1).toUpperCase() + usrInput.substring(1, spaceIndex).toLowerCase();
        // Use the spaceIndex + 1 to update usrInput to only last name
        usrInput = usrInput.substring(spaceIndex + 1);
        // store the substring of usrInput into last, Always capitalize first letter and lowercase the rest
        last = usrInput.substring(0, 1).toUpperCase() + usrInput.substring(1).toLowerCase();
        // Assign the initials using substring
        initials = first.substring(0, 1) + "." + last.substring(0, 1) + ".";
        
        // Display the output using left alligned columns
        // Last name then first name then initials separated by a |
        System.out.println(border);
        System.out.printf("|%-15s|%-15s|%-4s|%n", last, first, initials);
        System.out.println(border);
        
        
        
        
        
        
        
    }
    
}
