
/*
 Laura Adhikari
This program reads a string from the user and prints the topic from the webpage address.
 */

import java.util.Scanner;

public class HW2_Wiki {
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       
       System.out.println("This program will extract the topic from a valid Wikipedia webpage address.");
       System.out.print("Enter a web address: ");
       String address = input.nextLine();
       String data =address.substring(0,30);
        String web = "https://en.wikipedia.org/wiki/" ;  
        
       if  (data.equals (web)){
           String topic = address.substring(30);
           System.out.println("Topic: " + topic);
       }
       else  {
           System.out.println("Not a valid wikipedia webpage address.");
       }
       
       System.out.println("Bye.");
    }
    
}
