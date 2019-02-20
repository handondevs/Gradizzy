
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Leo Sanchez
 * CSE 1310-004
 * @author leosanchez
 */
public class HW2_Wiki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String  webAddress;
        String topic;
        String checkAddress = "";
        String cAddress = "https://en.wikipedia.org/wiki/";
        System.out.println("This program will extract the topic from a valid "
                + "Wikipedia webpage address.");
        System.out.print("Enter a web address: ");
        webAddress = kb.nextLine();
        //checkAddress = webAddress.substring(0,30);
        topic = webAddress.substring(29+1);
        
        if  (webAddress.equals(cAddress)){
                System.out.println("Topic: " + topic);
                System.out.println("Bye");
           
        }    
        else {
                System.out.println("Not a valid wikipedia webpage address" );
                System.out.println("Bye");

        
                }
    }
}
       

