
/*
 Laura Adhikari
Donations project
*/


import java.util.Scanner;

public class HW2_Donations {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String company1, company2;
        int christmas1, christmas2; // donations for christmas gifts
        int school1, school2; // donations for school support
        
        System.out.print("Enter the first company: " );
        company1 = input.nextLine();
        System.out.print("Enter the second company: " );
        company2 = input.nextLine();
        System.out.println("Enter how much each company donated for Christmas gifts: ");
        System.out.print(company1 + " donated: ");
        christmas1 = input.nextInt();
        System.out.print(company2 + " donated: ");
        christmas2 = input.nextInt();
        System.out.println("Enter how much each company donated for school support: ");
        System.out.print(company1 + " donated: ");
        school1 = input.nextInt();
        System.out.print(company2 + " donated: ");
        school2 = input.nextInt();
        System.out.println("Total Christmas donations: "+ (christmas1 + christmas2));
        System.out.println("Total school support donations: " + (school1 + school2));
      
        int donation1 = christmas1 + school1; // total donation by company1
        int donation2 = christmas2 + school2; //total donation by company2
        
        System.out.print("The company that donated the most is: ");
        if (donation1>donation2) {
            System.out.println(company1);
        }
        else {
            System.out.println(company2);
        }
        
        System.out.println("Bye");
      
        
    }
    
}
