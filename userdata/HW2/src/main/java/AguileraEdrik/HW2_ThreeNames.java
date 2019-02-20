
import java.util.Scanner;

//****************************************
// Name: Edrik Aguilera
// Class: HW2_ThreeNames
// Description: Take user input for their
// name and display a table using
// last name, first, middle then initials
//****************************************

public class HW2_ThreeNames 
{
    public static void main(String[] args) 
    {
        // Allow access to user input
        Scanner myInput = new Scanner(System.in);
        
        // Declared variables
        int spaceIndex = 0;
        String usrChoice = new String();
        String usrInput = new String();
        String first = new String();
        String last = new String();
        String middle = new String();
        String border = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        String border2 = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        String initials = new String();
        
        // Determine if the user has a middle name
        System.out.print("Do you have a middle name? (Y/N): ");
        usrChoice = myInput.nextLine();
        
        if (usrChoice.equalsIgnoreCase("y"))
        {
            // Prompt user to enter name
            System.out.print("Please enter your first, middle, and last name separated by a space: ");
            usrInput = myInput.nextLine();
        
            // Find idx of space
            spaceIndex = usrInput.indexOf(" ");
            // Store the substring of usrInput into first, Always capitalize first letter and lowercase the rest
            first = usrInput.substring(0, 1).toUpperCase() + usrInput.substring(1, spaceIndex).toLowerCase();
            // Use the spaceIndex + 1 to update usrInput to only middle name and last name
            usrInput = usrInput.substring(spaceIndex + 1);
            // Update spaceIndex
            spaceIndex = usrInput.indexOf(" ");
            // store the substring of usrInput into middle name, Always capitalize first letter and lowercase the rest
            middle = usrInput.substring(0, 1).toUpperCase() + usrInput.substring(1, spaceIndex).toLowerCase();
            // Update usrInput to contain only last name
            usrInput = usrInput.substring(spaceIndex + 1);
            // Assign usrInput to last
            last = usrInput.substring(0, 1).toUpperCase() + usrInput.substring(1).toLowerCase();
            // Assign the initials using substring
            initials = first.substring(0, 1) + "." + middle.substring(0, 1) + "."+ last.substring(0, 1) + ".";
        
            // Display the output using left alligned columns
            // Last name then first name then initials separated by a |
            System.out.println(border2);
            System.out.printf("|%-15s|%-15s|%-15s|%-6s|%n", last, first, middle, initials);
            System.out.println(border2);
        }
        else
        {
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
    
}
