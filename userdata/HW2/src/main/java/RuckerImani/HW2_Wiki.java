/*
Imani Rucker
Write a program that creates an if else statement
in order to figure out if the link is a wiki link
once it finds this condition true
it prints out the topic of the wiki page

 */
import java.util.Scanner;
public class HW2_Wiki
{

    public static void main(String[] args)
    {
        
        
        Scanner kb = new Scanner(System.in);
        
        // initialize variable string
        String wikilink,topic,original_link,comparewiki;
        int length;
        
        
        // Prints this program will extract the topic from a valid Wikipedia 
        //webpage address
        System.out.println("This program will extract the topic from a valid "
                + "Wikipedia webpage address.");
        
        // Prints out Enter a web address:
        System.out.print("Enter a web address: ");
        
        // Stores user data in variable kb
        wikilink = kb.nextLine();
        
        // finds the length of the wiki link
        length = wikilink.length();
        
        //finds the substring from 30 to end of string
        topic = wikilink.substring(30, length);
        comparewiki = wikilink.substring(0,30);
        
        
        
        // wiki orginial link
        original_link = "https://en.wikipedia.org/wiki/";
        
        // create an if else statement 
        // if index 0 to 30 matches user input 
        // print out 30 to end
        // if else print out not valid
       
        
        if (comparewiki.equals("https://en.wikipedia.org/wiki/"))
        {
           System.out.println("Topic: " + topic);
           System.out.println("Bye."); 
        }
         else
        {
            System.out.println("Not a valid wikipedia webpage address.");
            System.out.println("Bye.");
        }
        
        
        
        
  
        
       
    

    }
    
}
