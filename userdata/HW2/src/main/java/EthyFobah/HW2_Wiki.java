/* Fobah Ethy 
WIkipedia pages have a specific webpage address. Any address starts with https://en.wikipedia.org/wiki/ and then 
continues with the topic for that page e.g. Computer_science, Java_(programming_language). See examples below: 
https://en.wikipedia.org/wiki/Computer_science
https://en.wikipedia.org/wiki/Java_(programming_language)
https://en.wikipedia.org/wiki/Imagine_Dragons 

Write a program that reads a string from the user. If it is a valid wikipedia webpage, 
it extracts and prints the topic for that page. I
f it is not a valid address it prints the message Not a valid wikipedia webpage address. */
import java.util.Scanner;
public class HW2_Wiki {

    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        String address, valid,Topic;  // create to store strings
        int maxL;  // create to store integer
        System.out.println(" This program will extract the topic from a valid wikipedia webpage address.");// announce current  step. user's input required
        System.out.println("Enter a web address:");// announce current  step. user's input required
        address= kb.next(); // allow to have user's input
        valid= ("https://en.wikipedia.org/wiki/"); 
        maxL=valid.length(); //  check the length of above string 
        Topic=address.substring(maxL);   // Evaluate and compute anything after maxL     
          
        if (address.substring(0,maxL).equals(valid)) // compare to see if user's input equal to valid
        {
            System.out.println(Topic); // compute this statement only if equal to valid 
            
        }
        else // if the "if" statement is not correct we go to the one below 
        {
            System.out.println("Not a valid wikipedia webpage address"); //  if the "if" statement is not correct print this statement
        }
        System.out.println("Bye");
   }
    
    
}
