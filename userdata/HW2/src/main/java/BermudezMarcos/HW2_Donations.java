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
 * Problem: We were asked to take user input on 2 companies and compare what they donated 
 * and find totals for both times the companies donated
 */
public class HW2_Donations {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner comdata = new Scanner(System.in);
        System.out.print("Enter the first company: ");
        String company1 = comdata.nextLine(); 
        System.out.print("Enter the second company: ");
        String company2 = comdata.nextLine();
        System.out.println("Enter how much each company donated for Christmas gifts: ");
        int com1do1,com1do2,com2do1,com2do2;
        System.out.print(company1+" donated: ");
        com1do1 = comdata.nextInt();
        System.out.print(company2+" donated: ");
        com2do1 = comdata.nextInt();
        System.out.println("Enter how much each company donated for school support: ");
        System.out.print(company1+" donated: ");
        com1do2 = comdata.nextInt();
        System.out.print(company2+" donated: ");
        com2do2 = comdata.nextInt();
        int christmas_t = com1do1+com2do1;
        System.out.println("Total Christmas donations: " +christmas_t);
        int schoolsup = com1do2+com2do2;
        System.out.println("Total school support donations: "+schoolsup);
        int company1total = com1do1+com1do2;
        int company2total = com2do1+com2do2;
        if(company1total > company2total)
        {
            System.out.print ("The company that donated the most is: " +company1);
        }
        else
        {
            System.out.println("The company that donated the most is: " +company2);
        }
        System.out.println("Bye");
    }
}