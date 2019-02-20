/*
Rajan Acharya
This program ask the user for web address check wheather it is a valid wikipedia webpage 
and if it is a valid webpage extract the topic for the webpage.
*/
import java.util.Scanner;
public class HW2_Wiki {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.println("This program will extract the topic from a valid wikipedia webpage address. ");
    System.out.print("Enter a web address: ");
     String input = in.nextLine();
     String value = input.substring(0,30);
     String topic = input.substring(30,input.length());
     if(value.equalsIgnoreCase("https://en.wikipedia.org/wiki/"))
     {
         System.out.println("Topic: " + topic);
     }
     else
     {
         System.out.println("Not a valid wikipedia webpage address.");
     }
    
}
}

 
