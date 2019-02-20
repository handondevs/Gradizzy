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
public class HW2_Donations {
    
    public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    String com1,com2;
    int don1, don2;
    
    System.out.print("Enter the first company: ");
    com1 = kb.nextLine();
    System.out.print("Enter the second company: ");
    com2 = kb.nextLine();
    
    System.out.println("Enter how much each company donated for Christmas gifts:");
    System.out.print(com1 + " donated: ");
    don1 = kb.nextInt();
    System.out.print(com2 + " donated: ");
    don2 = kb.nextInt();
    
    System.out.println("Enter how much each company donated for school support: ");
    System.out.print(com1 + " donated: ");
    don1 = kb.nextInt();
    System.out.print(com2 + " donated: ");
    don2 = kb.nextInt();
    
    System.out.println("Total Christmas donations: ");
    System.out.println("Total school support donations: ");
    if (don1 <= don2){
        don1 = don1+1;
    }
    else{
        don2 = don2+1;
    }
    System.out.print("The compnay that donated the most is: ");
    if (don1>don2){
        System.out.println(com1);
    }
    else {
        System.out.println(com2);
    }
    
    System.out.println("Bye");
    }
}