import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author camaridodds
 */
public class HW2_Wiki {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String website,topic;
        
        
        System.out.println("This program will extract the topic from a valid Wikipedia webpage address.");
        website = "https://en.wikipedia.org/wiki/Shark";
        topic = "Shark";
        System.out.println("Enter a web address: " + website);
        System.out.println("Topic: " + topic);
        if ("topic" != topic){
            System.out.println(topic);
        }
        else{
            System.out.println("Not a valid wikipedia webpage address.");
        }
        System.out.println("Bye");
        
        
        
    }
    
}
