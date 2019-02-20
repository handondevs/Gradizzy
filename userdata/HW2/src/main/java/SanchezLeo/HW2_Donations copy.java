
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
public class HW2_Donations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String first, second;
        int donation1, donation2, support1, support2;
        System.out.print("Enter the first company name: ");
        first = kb.nextLine();
        System.out.print("Enter the second company name: ");
        second = kb.nextLine();
        System.out.println("Enter how much each company donated for "
                + "Christams gifts: ");
        System.out.print(first + " donated: ");
        donation1 = kb.nextInt();
        System.out.print(second + " donated: ");
        donation2 = kb.nextInt();
        System.out.println("Enter how much each company donated for school "
                + "support");
        System.out.print(first + " donated: ");
        support1 = kb.nextInt();
        System.out.print(second + " donated: ");
        support2 = kb.nextInt();
        System.out.println("Total christmas donations: " + (donation1+donation2));
        System.out.println("Total school support donations: " + (support1+support2));
        int firstCompany = (donation1+support1);
        int secondCompany = (donation2+support2);
        if (firstCompany > secondCompany){
            System.out.println("The company that donated the most is: " + first);
        }
        else 
            System.out.println("The company that donated the most is :" + second);
        System.out.println("Bye");
        
    }
    
}
