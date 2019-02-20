/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Labib Haq
 *1001061166
 * Description: compares donation values from 2 companies
 */
import java.util.Scanner;
public class HW2_Donations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //set up user input and take the name of each company
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the first company: ");
        String company1 = kb.nextLine();
        System.out.print("Enter the second company: ");
        String company2 = kb.nextLine(); 
        
        //ask the user how much each company donated in gifts
        System.out.println("Enter how much each company donated for Christmas gifts:");
        System.out.print(company1 + " donated: ");
        int comp1gifts = kb.nextInt();
        System.out.print(company2 + " donated: ");
        int comp2gifts = kb.nextInt(); 
        
        //ask the user how much each company donated in for school support
        System.out.println("Enter how much each company donated for school support:");
        System.out.print(company1 + " donated: ");
        int comp1school = kb.nextInt();
        System.out.print(company2 + " donated: ");
        int comp2school = kb.nextInt();   
        
        //calculate and print how much each company donated in total for each category
        System.out.println("Total Christmas donations: " + (comp1gifts + comp2gifts));
        System.out.println("Total school support donations: " + (comp1school + comp2school));
        
        // prints the company that donated the most in total
        if (comp1gifts + comp1school > comp2gifts + comp2school) {
            System.out.println(" The company that donated the most is:" +  company1);    
        }
        else if (comp1gifts + comp1school == comp2gifts + comp2school){
            System.out.println("Both companies donated an equal amount.");
        }
        else {
            System.out.println("The company that donated the most is: " +  company2);    
        }
        
        System.out.println("Bye");
    }
    
}
