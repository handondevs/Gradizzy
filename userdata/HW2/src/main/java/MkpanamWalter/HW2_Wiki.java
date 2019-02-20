// Walter Mkpanam
// CSE 1310-004
// Homework 2: Wiki
// Program Description: This program reads a string from the user and 
//                      determines if it is a valid wikipedia address and prints
//                      out the topic

import java.util.Scanner; 

public class HW2_Wiki {
    
    public static void main(String[] args) {
       String address; // variable declaration for address input
       
       Scanner kb = new Scanner(System.in); // scanner in object
       
       System.out.println("This program wil extract the topic from a valid Wikipedia webpage address.");
       System.out.print("Enter a web address: ");
       address = kb.nextLine(); // accepts string from user
       
       int length = address.length();
       String compare = address.substring(0,30); // gets string for comparison
       String topic = address.substring(30,length);// gets string for topic ouput
       
       if(compare.equals("https://en.wikipedia.org/wiki/")) // if statement 
       {
           System.out.printf("Topic: %s\n",topic); // if wikipedia address, print topic
           System.out.println("Bye.");
       }
       else
       {
           System.out.println("Not a valid wikipedia webpage address."); // if not wikipedia address
           System.out.println("Bye.");
       }
     
       
      
       
    }
    
}
