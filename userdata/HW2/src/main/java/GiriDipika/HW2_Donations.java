/*
Dipika Giri
This program prints total donations for Christmas and school support and which one donated more money.
 */

import java.util.Scanner;

public class HW2_Donations {

    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String fcompany, scompany; 
        int fdonation, sdonation, fschooldon, sschooldon, sum, sum2, total1, total2;
       
        System.out.print("Enter the first company: ");
        fcompany = kb.nextLine();
        System.out.print("Enter the second company: ");
        scompany = kb.nextLine();
        System.out.println("Enter how much each company donated for Christmas gifts: ");
        System.out.print(fcompany + " donated: ");
        fdonation = kb.nextInt();
        System.out.print(scompany + " donated: ");
        sdonation = kb.nextInt();
        sum = fdonation + sdonation; //sum of christmas donation
                
        System.out.println("Enter how much each company donated for school support: ");
        System.out.print(fcompany + " donated: ");
        fschooldon = kb.nextInt();
        System.out.print(scompany + " donated: ");
        sschooldon = kb.nextInt();
        sum2 = fschooldon + sschooldon;
        
        System.out.println("Total Christmas donations: " + sum);
        System.out.println("Total school support donation: " + sum2);
        
        total1 = fdonation + fschooldon; //sum of the first company donation
        total2 = sdonation + sschooldon; //sum of the second company donation
        
        if (total1 > total2) {
            System.out.println("The company that donated the most is: " + fcompany);
        }
        else {
            System.out.println("The company that donated the most is: " + scompany);
        }
        System.out.println("Bye");
        
    }
    
}
