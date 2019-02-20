/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RWBOYSEN18
 */
import java.util.Scanner;
public class HW2_Wiki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String web;
        int x;
        String sub;
        System.out.println("This program will extract the topic from"
                + "a valid Wikipedia address.");
        System.out.print("Enter a web address: ");
        web = keyboard.next();
        
        String AD = "https://en.wikipedia.org/wiki/";
        int valid = web.indexOf(AD);
        x = web.indexOf("/");
        sub = web.substring(x+24);
        if (valid != -1)
        {
            System.out.print("Topic: " +sub + " ");
        }
        else 
        {
           System.out.print("Not a valid wikipedia page address. ");
        }
    }
}
