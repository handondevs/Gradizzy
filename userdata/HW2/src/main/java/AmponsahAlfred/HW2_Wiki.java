/*
 Alfred Amponsah
This program reads a string from the user and if it is a
vaild  wikipedia webpage, it extracts and prints the topic 
for that page.
 */

import java.util.Scanner;
public class HW2_Wiki {

    public static void main(String[] args) {
       Scanner kb = new Scanner(System.in);
       String website, topic, The_Right_Web = "https://en.wikipedia.org/wiki/", webpage_address;
       
       System.out.println("This program will extract the topic from a valid Wikipedia webpage address.");
       System.out.print("Enter a web address: ");
       website= kb.nextLine();
      
       webpage_address = website.substring(0,30); //Length of the entered webpage address
       topic = website.substring(30); //topic after the "/" after "wiki"
       
       
       if (The_Right_Web.equals(webpage_address))//if wikipedia page matches the entered address
        {
           System.out.println("Topic: " +topic );// Prints out topic after the "/" after wikipeida website 
        }
        else 
        {
           System.out.println("Not a vaild wikipedia webpage address.");
        }
           System.out.println("Bye.");
    
      
       
    }
    
}
