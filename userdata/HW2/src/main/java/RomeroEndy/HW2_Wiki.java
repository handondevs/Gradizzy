/* 
Endy Romero
Write a program that reads a string from the user. If it is a valid wikipedia 
webpage, it extracts and prints the topic for that page. If it is not a valid 
address it prints the message Not a valid wikipedia webpage address. 
*/

import java.util.Scanner;

public class HW2_Wiki {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String url, topic;
        int idx;
        
        System.out.println("This program will extract the topic from a valid Wikipedia webpage address.");
        System.out.print("Enter a web address: ");
        
        url = kb.nextLine();
        idx = url.indexOf("https://en.wikipedia.org/wiki/");
        
        if(idx == 0){
            topic = url.substring(idx+30);
            System.out.println("Topic: " + topic);
        }
        else{
            System.out.println("Not a valid wikipedia webpage address.");
        }
        
        System.out.println("Bye.");

        }

    }
    
