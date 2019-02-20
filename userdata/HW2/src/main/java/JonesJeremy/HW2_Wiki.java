// Jeremy Jones
// This program prints the subject of a wikipedia article when a link to the wikipedia page is given.
import java.util.Scanner;
public class HW2_Wiki {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String base = "https://en.wikipedia.org/wiki/", address, topic; //Declaring variables
        int length = base.length();
        System.out.println("This program will extract the topic from a valid webpage address");
        System.out.print("Enter a web address: ");
        address = input.nextLine(); //User input
        topic = address.substring(length); //Identify topic of webpage
        if (base.equals(address.substring(0, length))){ //Check if address is valid
            System.out.println("Topic: " + topic); //Print topic
        }
        else{
            System.out.println("Not a valid wikipedia webpage address."); //If invalid
        }
        System.out.println("Bye.");
    }
    
}
