
import java.util.Scanner;

/**
 *
 * Timothy Balela
 */
public class HW2_Names {
    public static void main(String[] args) {
       // Instantiate Variables
       Scanner kb = new Scanner(System.in);
       String User_Name = " ";
       String First_Name = " ";
       String Last_Name = " ";
       String First_Initial = " ";
       String Last_Initial = " ";
       int SpaceIndex = 0;
       
       // Ask user for name
        System.out.print("Please enter your first and last name: ");
        User_Name = kb.nextLine();
        
        // Line Print
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        //Substrings
        SpaceIndex = User_Name.indexOf(" ");
        First_Name = User_Name.substring(0,SpaceIndex);
        Last_Name = User_Name.substring(SpaceIndex+1);
        First_Initial = User_Name.substring(0,1);
        Last_Initial = User_Name.substring(SpaceIndex+1,SpaceIndex+2);
        
        // Make string Capital first letter
        First_Name = First_Name.substring(0, 1).toUpperCase() + First_Name.substring(1);
        Last_Name = Last_Name.substring(0, 1).toUpperCase() + Last_Name.substring(1);
        First_Initial = User_Name.substring(0,1).toUpperCase();
        Last_Initial = User_Name.substring(SpaceIndex+1,SpaceIndex+2).toUpperCase();
        
        // Print formmating
        System.out.printf("|%-15s|%-15s|%s.%s|", First_Name,Last_Name,First_Initial,Last_Initial);
        
        
        
       
       
       
    }
    
}
