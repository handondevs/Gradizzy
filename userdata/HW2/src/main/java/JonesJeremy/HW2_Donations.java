/*
Jeremy Jones
This program calculates donations from two companies.
 */
import java.util.Scanner;
public class HW2_Donations {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String C1, C2, CDM;
        double DA1, DA2, DB1, DB2, Dc, Ds;
        System.out.print("Enter the first company: ");
        C1 = input.nextLine();
        System.out.print("Enter the second company: ");
        C2 = input.nextLine();
        System.out.println("Enter how much each company donated for Christmas gifts:");
        System.out.print(C1+" donated: ");
        DA1 = input.nextDouble();
        System.out.print(C2+" donated: ");
        DB1 = input.nextDouble();
        System.out.println("Enter how much each company donated for school support:");
        System.out.print(C1+" donated: ");
        DA2 = input.nextDouble();
        System.out.print(C2+" donated: ");
        DB2 = input.nextDouble();
        Dc = DA1 + DB1;
        Ds = DA2 + DB2;
        System.out.println("Total Christmas donations: " + Dc);
        System.out.println("Total school support donations: " + Ds);
        System.out.print("The company that donated the most is: ");
        if (DA1+DA2 > DB1+DB2){
            System.out.println(C1);
        }
        else{
            System.out.println(C2);
        }
        System.out.println("Bye.");
        
    }
    
}
