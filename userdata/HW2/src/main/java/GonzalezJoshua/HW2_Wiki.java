
import java.util.Scanner;

/*
Joshua Gonzalez
This program asks the user to give a wikipedia webpage address and returns the topic of the webpage address
also checks if the address entered is actually a wikipeadea webpage
 */

/**
 *
 * @author joshu
 */
public class HW2_Wiki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);    //scanner
        String link;   //will later be the user input 
        String check = "https://en.wikipedia.org/wiki/";  //will be used later to compare to the link
        
        System.out.println("This program will extract the topic from a valid Wikipedia webpage address."); //information to user
        System.out.print("Enter a web address: ");   //asks user to do something
        link = kb.nextLine();   //assigns the user input to previous variable "link"
        String address = link.substring(0,30); //sets address equal to the first 30 characters of the user input link
        String topic = link.substring(30); //grabs the rest
        
        if (address.equals(check)){  //checks to see if the user input is a wikipedea webpage address
            System.out.println("Topic: "+ topic);    //prints out the topic
        }
        else{   //goes here if the user input is not a valid wikipedia webpage address
            System.out.println("Not a valid wikipedia webpage address"); //tells the user the link is not valid
        }
        
        System.out.println("Bye!"); //says goodbye
        
        
    }
    
}
