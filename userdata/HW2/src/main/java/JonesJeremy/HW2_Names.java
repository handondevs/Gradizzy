//Jeremy Jones
// This program takes a given name, formats it, and prints it.
import java.util.Scanner;
public class HW2_Names {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); //Declaring user input variable
        String Name, First, Last, Initials; //Declaring main variables
        String FCL, LCL; //Declaring formatting variables
        System.out.print("Please enter your first and last name: ");
        Name = input.nextLine();
        First = Name.substring(0,Name.indexOf(" ")); //Defining variable for first name
        Last = Name.substring(Name.indexOf(" ")+1); //Defining variable for last name
        FCL = First.toUpperCase(); //This line and following to capitalize first letter of first name
        FCL = FCL.substring(0,1);
        LCL = Last.toUpperCase(); //This line and following to capitalize first letter of last name
        LCL = LCL.substring(0,1);
        Initials = FCL + "." + LCL + "."; //Defining variable for initials
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.printf ("|%-15s|%-15s|%-4s|" ,LCL+Last.substring(1),FCL+First.substring(1), Initials);
        System.out.println(); //Line Break
        System.out.println ("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
}
