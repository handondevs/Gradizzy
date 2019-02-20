
import java.util.Scanner;

//************************************
// Name: Edrik Aguilera
// Class: HW2_Wiki
// Description: Prompt user for
// wikipedia page, determine if valid
// if it is display the topic of the
// wikipage
//************************************

public class HW2_Wiki 
{

    public static void main(String[] args) 
    {
        // Allow access to user input
        Scanner myInput = new Scanner(System.in);
        
        // Declared variables
        String usrInput = new String();
        String topic = new String();
        
        // Global variables
        final String VALID_WIKI = "https://en.wikipedia.org/wiki/";
        final int VALID_LENGTH = VALID_WIKI.length();
        
        // User program introduction
        System.out.println("This program will extract the topic from a valid" +
                " Wikipedia webpage address.");
        // Prompt user to enter a wikipedia page
        System.out.print("Enter a web address: ");
        usrInput = myInput.nextLine() + " "; // Add a space in case someone doesnt add a topic
        
        // Test if valid Wiki page
        // If it is valid extract the topic
        if (usrInput.substring(0, VALID_LENGTH).equalsIgnoreCase(VALID_WIKI))
        {
            topic = usrInput.substring(VALID_LENGTH);
            System.out.println("Topic: " + topic);
        }
        else
        {
            System.out.println("Not a valid Wikipedia webpage address.");
        }
        
        // Goodbye
        System.out.println("Bye.");
        
    }
    
}
