/*
Sanjita Dhakal
ID:1001670562
Date:02/07/2019
*/

//Task4
package hw2_donations;

import java.util.Scanner;
public class HW2_Donations {

   
    public static void main(String[] args) {
     Scanner kb= new Scanner(System.in);
     
     System.out.print("Enter the first company:");
     String firstCompany=kb.nextLine();
     System.out.print("Enter the second company:");
     String secondCompany=kb.nextLine();
     
     System.out.println("Enter how much each company donated for Christmas gifts:");
     System.out.print(firstCompany+" donated:");
     int firstDonation=kb.nextInt();
     System.out.print(secondCompany+" donated:");
     int secondDonation=kb.nextInt();
     
     System.out.println("Enter how much each company donated for schoool support: ");
     System.out.print(firstCompany+" donated:");
     int schoolDonation1=kb.nextInt();
     System.out.print(secondCompany+" donated:");
     int schoolDonation2=kb.nextInt();
     
     int totalFirstCompany=firstDonation+schoolDonation1;
     int totalSecondCompany=secondDonation+schoolDonation2;
     
     int totalChristmas,totalSchool;
     
     totalChristmas= firstDonation+secondDonation;
     totalSchool=schoolDonation1+schoolDonation2;
     
     System.out.println("Total Christmas donations:"+totalChristmas);
     System.out.println("Total school support donations:"+totalSchool);
     
     
     
     
     
     if(totalFirstCompany>totalSecondCompany) {
         
         System.out.println("The company that donated the most is:"+ firstCompany);
         
     }
     
     else if(totalFirstCompany<totalSecondCompany)
     {
         System.out.println("The company that donated the most is:"+ secondCompany);
         
     }
     
     else if(totalFirstCompany<totalSecondCompany || totalFirstCompany>totalSecondCompany)
     {
         System.out.println("The company that donated the most is:"+ secondCompany);
     }
     
     System.out.println("Bye");
     
   
     
    }
    
}
