/*
Khaled Ahmed
This program that reads a string from the user. If it is a valid wikipedia webpage, 
it extracts and prints the topic for that page .
*/

import java.util.Scanner;
public class HW2_WiKi {
    
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("This program will extract the topic from a valid Wikipedia webpage address.");
        String link;
        System.out.print("Enter a web address:");
        link=kb.nextLine();
        String topic=link.substring(29);
        String address=link.substring(0,29);
        String wiki="https//en.wikipedia.org/wiki/";
        if(wiki.equals(address)){
            System.out.println("Topic:"+topic );
        }
        else {
            System.out.println("Not a valid wikipedia webpage address.");
        }
         System.out.println("Bye.");
    }
    
}
