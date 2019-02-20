/*
Endy Romero
This Program asks for 2 names of companies
aks how much each of the given companies donated for Christmas.
aks how much each of the given companies donated for school support
prints the total donations for Christmas
prints the total donations for school support
prints which one of 2 companies donated more money in general.
 */

import java.util.Scanner;
        
public class HW2_Donations {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String company1, company2;
        int xmas1, xmas2, sch1, sch2, tot1, tot2;
        
        System.out.print("Enter the first company: ");
        company1 = kb.nextLine();
        System.out.print("Enter the second company: ");
        company2 = kb.nextLine();
        
        System.out.println("Enter how much each company donated for Christmas gifts: ");
        System.out.print(company1+ " donated: ");
        xmas1 = kb.nextInt();
        System.out.print(company2 + " donated: ");
        xmas2 = kb.nextInt();
        
        System.out.println("Enter how much each company donated for school support: ");
        System.out.print(company1+ " donated: ");
        sch1 = kb.nextInt();
        System.out.print(company2 + " donated: ");
        sch2 = kb.nextInt();
        
        System.out.println("Total Christmas donations: "+ (xmas1+xmas2));
        System.out.println("Total school support donations: "+ (sch1+sch2));
                
        tot1 = xmas1+sch1;
        tot2 = xmas2+sch2;
                
        if(tot1 >= tot2){
            System.out.printf("The company that donated the most is: %s%n", company1);
                    }
        else {
            System.out.printf("The company that donated the most is: %s%n", company2);
        }
        System.out.println("Bye");
    }
    
}
