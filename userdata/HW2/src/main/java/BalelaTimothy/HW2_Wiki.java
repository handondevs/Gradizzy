
import java.util.Scanner;

/**
 *
 * Timothy Balela
 */
public class HW2_Wiki {
    public static void main(String[] args) {
        // Instantiate Variables
        Scanner kb = new Scanner(System.in);
        String website = " ";
        String topic = " ";
        
        // Print text for website
        System.out.println("This program will extract the topic from a valid Wikipedia webpage address.");
        System.out.print("Enter a web address: ");
        website = kb.nextLine();
        
        // Gets length of website
        int Length_Website = website.length();
        
            // Check if website is valid
            if(website.substring(0, 30) .equals("https://en.wikipedia.org/wiki/"))
            {
                System.out.print("Topic: ");
                // Checks for valid topic/substring
                if(Length_Website > 30)
                {
                    System.out.println(website.substring(30));
                }
            }
            else
            {
                System.out.println("Not a valid wikipedia webpage address.");    
            }
            
        // print out bye  
        System.out.println("Bye");
    }
    
}
