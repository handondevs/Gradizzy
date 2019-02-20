// Walter Mkpanam
// CSE 1310-004
// Homework 2: Donations
// Program Description: This program gets donation data from two companies and 
//                      checks which one gave the highest donation

import java.util.Scanner; 

public class HW2_Donations {
    public static void main(String[] args) {
        
        String firstCompany; // name of first company
        String secondCompany; // name of second company
        int firstDonation,secondDonation,firstSupport,secondSupport;
        int totalChristmas, totalSupport; // total donations for seperate times        
        
        Scanner input = new Scanner(System.in); // defining scanner object
        
        System.out.print("Enter the first company: ");
        firstCompany = input.nextLine(); // accept string from user 
        
        System.out.print("Enter the second company: ");
        secondCompany = input.nextLine(); // accept string from user 
        
        System.out.println("Enter how much each company donated for Christmas gifts: ");
        System.out.printf("%s donated: ",firstCompany);
        firstDonation = input.nextInt(); // wait for user input
        System.out.printf("%s donated: ",secondCompany);
        secondDonation = input.nextInt();
        
        System.out.println("Enter how much each company donated for school support: ");
        System.out.printf("%s donated: ", firstCompany);
        firstSupport = input.nextInt();
        System.out.printf("%s donated: ", secondCompany);
        secondSupport = input.nextInt();
        
        totalChristmas = firstDonation + secondDonation;
        totalSupport = firstSupport + secondSupport;
        
        
        System.out.printf("Total Christmas donations: %d \n",totalChristmas);
        System.out.printf("Total school support donations: %d \n", totalSupport);
        
        int totalFirst = firstDonation + firstSupport; // calculate total from first 
        int totalSecond = secondDonation + secondSupport; // calculate total from second
        
        if(totalFirst >= totalSecond) // if statement to evaluate donations 
        {
            System.out.printf("The company that donated the most is: %s\n",firstCompany);
            
        }
        else
        {
            System.out.printf("The company that donated the most is: %s\n", secondCompany);
        }
        
        System.out.println("Bye");
       
    }
    
}
