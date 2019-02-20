/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Renato Cruel Amado
 * This program will extract a string from the user, and decide if it is
 * a valid wiki address or not 
 */
public class HW2_Wiki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Introduce scanner for user input
        Scanner kb = new Scanner (System.in);
        //Set string for user input
        String website;
        //Set strings for program computation
        String valid, validwebsite, topic;
        
        System.out.println("This program will extract the topic from a valid "
                + "Wikipedia webpage address");
        System.out.print ("Enter a web adress: ");
        //Take website from user input
        website = kb.nextLine();
        //Set interger to make sure the website is not too short and creates
        //an error in the program
        int len = website.length ();
        //Make sure user data is not too short
        if (len>=30){
        //Set substring out of user input info for the first 30chars, where the
        //valid website is suppose to exist
        valid = website.substring (0,30);
        //Hardcode string for the valid wikipedia website
        validwebsite = "https://en.wikipedia.org/wiki/";
        //Create if statement inside if statement to make sure website is at 
        //least 30 chars and matches and valid wikipedia site
        if (valid.equals (validwebsite)){
        //Set string to remove topic from website string, which would be on the
        //30th chard onwards
        topic = website.substring (30);   
        System.out.println("Topic: " + topic);
        System.out.println("Bye.");
        }
        //If condition is not meet, give notice to user
        else {
        System.out.println("Not a valid wikipedia webpage address.");
        System.out.println("Bye.");
        }
        //If user data is too short and therefore invalid, give notice to user
        }
        else {
        System.out.println("Not a valid wikipedia webpage address.");
        System.out.println("Bye.");
    
        }
    }

}