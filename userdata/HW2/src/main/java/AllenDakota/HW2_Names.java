
import java.util.Scanner;

public class HW2_Names {
    
    /*
    Dakota Allen
    This program asks for a name and reformats it in a table
    */
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        
        System.out.print("Please enter your first and last name: ");
        String name = in.nextLine();
        
        int idx = name.indexOf(" ");
        
        String first = name.substring(0,idx);
        //Finds the first name from the entered string
        String capfirst = first.substring(0,1).toUpperCase() + first.substring(1);
        //Capitalizes the first letter of the first name and pastes the rest of the name after
        
        String last = name.substring(idx+1);
        //Finds the last name from the entered string
        String caplast = last.substring(0,1).toUpperCase() + last.substring(1);
        //Capitalizes the first letter of the last name and pastes the rest of the name after
       
        String initials = capfirst.charAt(0) + "." + caplast.charAt(0) + ".";
        //Creates the initals using the new capitalized leters
        
        System.out.println(line);
        //Top line
        System.out.printf("|%-20s|%-20s|%-2s|%n", caplast, capfirst, initials);
        //Reserved a lot of space for each name to match the length of the top line
        System.out.println(line);
    }
    
}
