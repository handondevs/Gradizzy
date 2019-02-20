
import java.util.Scanner;

public class HW2_Wiki {

    /*
    Dakota Allen
    This program asks for a Wikipedia website and displays the topic of that site
    */
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("This program will extract the topic from a valid Wikipedia webpage address.");
        System.out.print("Enter a web address: ");
        String input = in.nextLine();
        
        String web = input.substring(0,30);
        //This is used later to compare the beginning of the web address entered to what it should be
        //If the entered web address does not exactly match "https://en.wikipedia.org/wiki/," then it will say it's wrong
        //See line 31 to see what I mean
        
        int idx = input.indexOf("/");
        int idx2 = input.indexOf("/",idx+1);
        int idx3 = input.indexOf("/",idx2+1);
        int idx4 = input.indexOf("/",idx3+1);
        //All of this is to find the text after the 4 forward slashes in the web address
        
        String topic = input.substring(idx4+1);
        //Finds the text after the last forward slash
        
        if (web.equals("https://en.wikipedia.org/wiki/")) {
            System.out.println("Topic: " + topic);
            //Prints the topic if the beginning of the web address matches
        }
        
            else {
                    System.out.println("Not a valid wikipedia webpage address.");
        }

        System.out.println("Bye.");
        
    }
    
}
