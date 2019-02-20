/*
Dipika Giri
This program reads a string from the user.
 */
import java.util.Scanner;

public class HW2_Wiki {

   
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String web, web1,topic1, idx1;
        
        System.out.print("Enter a web address: ");
        web = kb.next();
        web1 = web.substring(0,30);
        topic1 = "https://en.wikipedia.org/wiki/";
        
        if (web1.equals(topic1)) {
            System.out.println("Topic: "+ web.substring(30));
            
        }
        else {
            System.out.println("Not a valid wikipedia webpage address.");
        }
        
        System.out.println("Bye");
        
    }
    
}
