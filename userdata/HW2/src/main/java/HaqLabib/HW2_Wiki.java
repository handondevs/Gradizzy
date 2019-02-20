/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Labib Haq
 * 1001061166
 * Description: checks to see if a wikipedia link is inputted and prints the topic
 */
import java.util.Scanner;
public class HW2_Wiki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //set up scanner
        Scanner kb = new Scanner(System.in);
     
        //take user input of the web address
        System.out.println("This program will extract the topic from a valid Wikipedia webpage address.");
        System.out.print("Enter a web address: ");
        String link = kb.nextLine();
  
        //check if link has the correct webpage address
        String check = "https://en.wikipedia.org/wiki/";
        if (link.contains(check)) {
            //makes it so it prints text after the webpage address
            System.out.println("Topic: " + link.substring(check.length()));
        }
        else {
            System.out.println("Not a valid wikipedia webpage address.");
        }
        System.out.println("Bye");
    }
    
}
