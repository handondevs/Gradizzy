/*
 Alfred Amponsah
This program prints how much donations each of the given companies donated for 
Christmas, and School support.
 */

import java.util.Scanner;

public class HW2_Donations {

   
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String CompanyOne, CompanyTwo;
        int donationChris1, donationChris2, donationSch1, donationSch2;
        int CompanyOneCombo,CompanyTwoCombo;
        
        System.out.print("Enter the first company: ");// Enter the first company name
        CompanyOne = kb.nextLine();
        System.out.print("Enter the second company: "); //Enter the second company name
        CompanyTwo= kb.nextLine();
        
        System.out.println("Enter how much each company donated for Christmas gifts: "); //Christmas donations from both companies
        System.out.printf("%s donated: ", CompanyOne);// Company one's Christmas donation
        donationChris1 = kb.nextInt();
        System.out.printf("%s donated: ", CompanyTwo);//Company two's Christmas donation
        donationChris2=kb.nextInt();
        
        
        System.out.println("Enter how much each company donated for school support: ");//School support donations from both Companies
        System.out.printf("%s donated: ", CompanyOne);//Company one's school support donation
        donationSch1 = kb.nextInt();
        System.out.printf("%s donated: ", CompanyTwo);//Company two's school support donation
        donationSch2=kb.nextInt();
        
        
        System.out.println("Total Christmas donations: "+(donationChris1+donationChris2));//Total Christmas donations
        System.out.println("Total school support donations: "+(donationSch1+donationSch2));//Total school support donations
        
        CompanyOneCombo = donationChris1+donationChris2;
        CompanyTwoCombo = donationSch1+donationSch2;
        
        if ((CompanyOneCombo > CompanyTwoCombo))
           {
            System.out.printf("The company that donated the most is: %s %n", CompanyOne);
           }
           else 
           {
            System.out.printf("The company that donated the most is: %s %n", CompanyTwo);
           }
        System.out.println("Bye");
        
        
        
        
        
        
        
        
        
    }
    
}
