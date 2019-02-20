//arun joel sathenapalli
//1001664942
package hw2_wiki;
import java.util.Scanner;

public class HW2_Wiki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner kb = new Scanner(System.in);
    String webaddress = " ";
    String Topic = " ";
    String correctWikiWebaddress = " ";
    String QueryWikiWebaddress = " ";
    int idx;
    
    System.out.println("This program will extract the topic from a valid Wikipedia webpage address.");
    System.out.print("Enter a web address:"); 
    webaddress = kb.nextLine(); //This variable takes input from the user
    idx = webaddress.lastIndexOf("/");
    correctWikiWebaddress = "https://en.wikipedia.org/wiki/";
    QueryWikiWebaddress = webaddress.substring(0,idx+1);
    if (correctWikiWebaddress.equals(QueryWikiWebaddress))
    {
      Topic = webaddress.substring(idx+1);
      System.out.printf("Topic: %s%n",Topic);
    }
    else {
        System.out.println("Not a valid wikipedia webpage address.");
    }
       System.out.println("Bye");
}
}