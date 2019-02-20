/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author marcosbermudez
 * By: Marcos Bermudez
 * Problem: We were asked to check to make sure that the input from the user was a 
 * valid wiki page and to then print out the topic of the wiki page if the page was valid
 */
public class HW2_Wiki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This program will extract the topic from a valid Wikipedia webpage address.");
        Scanner wiki = new Scanner(System.in);
        System.out.print("Enter a web address: ");
        String page = wiki.nextLine();
        // 30 spaces
        String topic = page.substring(30);
        if (page.contains("https://en.wikipedia.org/wiki/"))
        {
            System.out.println("Topic: "+topic);
        }
        else
        {
            System.out.println("Not a valid wikipedia webpage address.");
        }
        System.out.println("Bye.");
    }
}

