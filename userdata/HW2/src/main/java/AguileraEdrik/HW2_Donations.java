
import java.util.Scanner;

//****************************************
// Name: Edrik Aguilera
// Class: HW2_Donations
// Description: Ask for two company names
// ask for their christmas donations as  
// well as their school donations.
// Count up all the donations for both
// occasions and count up the total donations
// for each company to determine who donated
// the most.
//****************************************

public class HW2_Donations 
{

    public static void main(String[] args) 
    {
        // Allow access to user input
        Scanner myInput = new Scanner(System.in);
        
        // Declared variables
        String company1 = new String();
        String company2 = new String();
        int totalChristmas = 0;
        int totalSchool = 0;
        int donations1 = 0;
        int donations2 = 0;
        int temp = 0;
        
        // Prompt user to enter company names
        System.out.print("Enter the first company: ");
        company1 = myInput.nextLine();
        System.out.print("Enter the second company: ");
        company2 = myInput.nextLine();
        
        // Ask for christmas donations for each company
        System.out.println("Enter how much each company donated for Christmas gifts:");
        System.out.print(company1 + " donated: ");
        donations1 = myInput.nextInt();
        System.out.print(company2 + " donated: ");
        donations2 = myInput.nextInt();
        
        // Total christmas donations
        totalChristmas = donations1 + donations2;
        
        // Ask for school donations for each company
        System.out.println("Enter how much each company donated for school support:");
        System.out.print(company1 + " donated: ");
        totalSchool = myInput.nextInt();
        // Update company1's total donations
        donations1 += totalSchool;
        // Get the company2 donations for school
        System.out.print(company2 + " donated: ");
        temp = myInput.nextInt();
        // Update total school donations
        totalSchool += temp;
        //Update company2's total donations
        donations2 += temp;
        
        // Display the total donations for Christmas and schooling
        System.out.println("Total Christmas donations: " + totalChristmas);
        System.out.println("Total school support donations: " + totalSchool);
        
        // Determine which company donated the most or if they both donated the 
        // same amount thats great! Donating is good!!!!
        if (donations1 > donations2)
        {
            System.out.println("The company that donated the most is: " + company1);
        }
        if (donations2 > donations1)
        {
            System.out.println("The company that donated the most is: " + company2);
        }
        if (donations1 == donations2)
        {
            System.out.println("Both companies donated the same amount! Yay!");
        }
        // Goodbye
        System.out.println("Bye.");
        
    }

}
