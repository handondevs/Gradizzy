/**
 *
 * @author aaryan patel
 */
import java.util.Scanner;
public class HW2_Wiki {

    public static void main(String[] args) {
        //goal: get user-input webpage address and compare it to the wikipedia url. Then, print only the topic of the webpage.
        Scanner kb = new Scanner(System.in);
        
        //get web address
        System.out.println("This program will extract the topic from a valid Wikipedia webpage address.");
        System.out.print("Enter a web address: ");
        String url = kb.next();
        
        //identify web address and split if it's a proper wikipedia url
        String prefix = "https://en.wikipedia.org/wiki/";
        int slash = url.lastIndexOf("/");
        
        String topic = "";
        if(url.substring(0,slash+1).equalsIgnoreCase(prefix)){
            topic = url.substring(slash+1);
        }
        else{
            topic = "Not a valid wikipedia webpage address.";
        }
        
        //output
        System.out.printf("Topic: %s%n",topic);
        System.out.println("Bye.");
    }
    
}
