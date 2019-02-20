/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Renato Cruel Amado
 * Takes the name of 2 companies, their respective donations toward Christmas
 * and school supplies, add them up and decide the winner based on donation
 * amounts
 */
public class HW2_Donations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Set scanner for user input
        Scanner kb = new Scanner (System.in);
        //Set strings for the two companies to be entered by the user
        String co1, co2;
        //Set string for Christmas donations and total, school donations and
        //total, winner, and each companies total
        int xmas1, xmas2, xmast, sch1, sch2, scht, winner, co1t, co2t;
        
        System.out.print("Enter the first company: ");
        //Take name of first company given by user
        co1 = kb.nextLine();
        System.out.print("Enter the second company: ");
        //Take name of second company given by user
        co2 = kb.nextLine();
        System.out.println("Enter how much each company donate from Christmas"
                + " gifts: ");
        //Print company's name and take amount donated, input by user
        System.out.print(co1 + " donated: ");
        xmas1 = kb.nextInt();
        System.out.print(co2 + " donated: ");
        xmas2 = kb.nextInt();
        System.out.println("Enter how much each company donated for school"
                + " support: ");
        System.out.print(co1 + " donated: ");
        sch1 = kb.nextInt();
        System.out.print(co2 + " donated: ");
        sch2 = kb.nextInt();
        //Add total donations for Christmas and school
        xmast = xmas1 + xmas2;
        scht = sch1 + sch2;
        //Print total donations
        System.out.println("Total Christmas donations: " + (xmast));
        System.out.println("Total school support donations: " + (scht));
        //Calculate company totals
        co1t = xmas1 + sch1;
        co2t = xmas2 + sch2;
        
        //Set condition to find winner out of the 2 companies       
        if (co1t>co2t){
        //If the first company donations are higher
        System.out.println("The company that donated the most is: " + co1);
        System.out.println("Bye");
        }
        else{
        //If the second company donation are higher
        System.out.println("The company that donated the most is: " + co2);
        System.out.println("Bye");
        }
      
        
        
    }
    
}
