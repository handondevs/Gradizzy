/*
 Raul Adhikari
this program compares how how much two companies donated.
*/

import java.util.Scanner;
public class HW2_Donations {

    
    public static void main(String[] args) {
        
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter the first company: ");
      String company1 = kb.nextLine();
      System.out.print("Enter the second company: ");
      String company2 = kb.nextLine();
      System.out.println("Enter how much each compnay donated for Chirsmas gifts: ");
      System.out.printf("%s donated: ",company1);
     int company1Money = kb.nextInt();
     System.out.printf("%s donated: ",company2);
     int company2Money = kb.nextInt();
     System.out.println("Enter how much each company donated for school support: ");
     System.out.printf("%s donated: ",company1);
     int schoolMoney1 = kb.nextInt();
     System.out.printf("%s donated: ",company2);
     int schoolMoney2 = kb.nextInt();
    int totalChrismas = company1Money + company2Money;
    System.out.println("Total Chrismas donations: "+ totalChrismas);
    int totalSchool = schoolMoney1 + schoolMoney2;
    System.out.println("Total Chrismas donations: " + totalSchool);
    int companyDonations1 = company1Money + schoolMoney1;
    int companyDonations2 = company2Money + schoolMoney2;
    
    if (companyDonations1 > companyDonations2)
     
    {
        System.out.println("The company that donated the most is: " + company1 );
        
    } 
    else{
        System.out.println(" The company that donated the most is: " + company2 );

        
    }
     
    System.out.println("Bye");
    
      
      
        // TODO code application logic here
    }
    
}
