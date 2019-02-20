/*
 * This program is to extract the topic of a wiki address
 * Before that it must determine if it is a proper wiki address
 * then is can properly give a topic
 */

/**
 * UTA ID: 1001584020
 * @author Justin
 */
import java.util.Scanner;

public class HW2_Wiki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // define variables and creating a scanner
        String webpage = "", topic = "";
        String wikiTest = "https://en.wikipedia.org/wiki/";
        String wikiTry = "";
        int len = 0;
        Scanner input = new Scanner(System.in);
        
        // asking the user to enter in the proper requirements
        System.out.println("This program will extract the topic from a valid Wikipedia webpage address.");
        System.out.println("Enter a web address: ");
        webpage = input.nextLine();
        len = webpage.length(); // taking the length of the web address
        wikiTry = webpage.substring(0, 30); // seeing if the address is equal to the wiki
        
        // testing if it's the wki address and if it has a topic at the end
        if(wikiTry.equals(wikiTest) && len > 30)
        {
            topic = webpage.substring(30,len);
        }
        // entering the last output
        System.out.println("Topic: " + topic);
        System.out.println("Good Bye."); // because it'd be rude not to do so
    }
    
}
