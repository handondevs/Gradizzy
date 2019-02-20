
package hw2_wiki;
import java.util.Scanner;
public class HW2_Wiki {


    public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    String URL, topic;
    int idx;
    
    System.out.println("This program will extract the topic from a valid Wikipedia webpage address.");
    System.out.println("Enter a web address: ");
    
    URL = kb.nextLine();
    idx = URL.indexOf(" ");
    
    System.out.printf("Topic: %n");
    }
    
}
