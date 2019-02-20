/*
Imani Rucker
* asks for 2 names of companies
* asks how much each of the given companies donated for Christmas.
* asks how much each of the given companies donated for school support
* prints the total donations for Christmas
* prints the total donations for school support
* prints which one of 2 companies donated more money in general. 
 */
import java.util.Scanner;
public class HW2_Donations 
{
    
    public static void main(String[] args) 
    {
    // Scanner method
    Scanner kb = new Scanner(System.in);
    // intializing variable names for int and string 
    String comp_1, comp_2;
     int donation_1, donation_2,schooldon_1,schooldon_2,sum_school,
             sum_christmas,total_comp1, total_comp2;
 
     
     
    // stores the first company name in variable called comp_1
    System.out.print("Enter the first company: ");
     comp_1 = kb.nextLine();
     
    // Stores the second company name in variable called comp_2 
    System.out.print("Enter the second company: ");
    comp_2 = kb.nextLine();
     
    // Prints Enter how much each company donated for Christmas gifts:
    System.out.println("Enter how much each company donated for "
             + "Christmas gifts: ");
    // Use printf method to input company name and ask for user data
    System.out.printf("%s donated: ",comp_1 );
    donation_1 = kb.nextInt();
    
    // Use printf method to input second company as for user data
    System.out.printf("%s donated: ", comp_2);
    donation_2 = kb.nextInt();
    
    // Prints Enter how much each company donated for school support:
    System.out.println("Enter how much each company donated for school "
            + "support:");
    
    //Stores school donations for first company name
    System.out.printf("%s donated: ",comp_1);
    schooldon_1 = kb.nextInt();
    
    // Stores school donations for second company name
    System.out.printf("%s donated: ", comp_2);
    schooldon_2 = kb.nextInt();
    
    //  equatioin for the sum of christmas donations
     sum_christmas = (donation_1 +donation_2);
     
     // equation for sum of school donations
     sum_school = (schooldon_1 + schooldon_2);
     
     // prints total for christmas
     System.out.printf("Total Christmas donations: %d%n", sum_christmas);
     
     // prints total for school
     System.out.printf("Total school support donations: %d%n", sum_school);
     
     //we have to find the total donations for company 1 and 2
     // for if else statement
     total_comp1 = (donation_1 + schooldon_1);
     total_comp2 = (donation_2 + schooldon_2);
     
     // create and if else statement that tells use which company donated more
     // then prints there name
     
    if (total_comp1 > total_comp2)
    {
     System.out.printf("The company that donated the most is: %s%n", comp_1); 
     System.out.println("Bye");
    }
    else
    {
     System.out.printf("The company that donated the most is: %s%n", comp_2); 
     System.out.println("Bye");       
    }
    
    
    
    
    
        
     
    }
    
}
