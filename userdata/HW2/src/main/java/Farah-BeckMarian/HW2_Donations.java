/*
by Marian Farah-Beck
This program prints the total donations and which of 2 companies donated more money.
*/
import java.util.Scanner;

public class HW2_Donations {

public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    String company1, company2;
    int christmas1, christmas2, schoolsupport1, schoolsupport2; 
    int TotalChristmas, Totalschoolsupport;
    int Totalcompany1, Totalcompany2, TotalHighestdonation;
    
    System.out.print("Enter the first company:");
    company1 = kb.nextLine();
    System.out.print("Enter the second company:");
    company2 = kb.nextLine();
    System.out.print("Enter how much each company donated for Christmas gifts:");
    christmas1 = kb.nextInt();
    christmas2 = kb.nextInt();
    //System.out.println(company1 + "donated: " + kb.nextInt(christmas1));
   // System.out.println(company2 + "donated: " + kb.nextInt(christmas2));
    System.out.print("Enter how much each company donated for school support:");
    schoolsupport1 = kb.nextInt();
    schoolsupport2 = kb.nextInt();
   // System.out.println(company1 + "donated: " + schoolsupport1);
   // System.out.println(company2 + "donated: " + schoolsupport2);
    TotalChristmas = christmas1 + christmas2;
    System.out.println("Total Christmas donations: ");
    System.out.println(TotalChristmas);
    Totalschoolsupport = schoolsupport1 + schoolsupport2;
    System.out.println("Total school support donations: ");
    System.out.println(Totalschoolsupport);
    Totalcompany1 = christmas1 + schoolsupport1;
    Totalcompany2 = christmas2 + schoolsupport2;
    If(Totalcompany1 > Totalcompany2)
            {
            System.out.print("The company that donated the most is: " + company1);
            }
        else if (Totalcompany1 < Totalcompany2)
            {
            System.out.print("The company that donated the most is: " + company2);
            }
    }
}
