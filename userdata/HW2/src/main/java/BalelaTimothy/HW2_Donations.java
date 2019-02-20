
import java.util.Scanner;

/**
 *
 * Timothy Balela
 */
public class HW2_Donations {
    public static void main(String[] args) {
        // Instantiate Variables
        Scanner kb = new Scanner(System.in);
        String company1_name = " ";
        String company2_name = " ";
        int company1_Christmas = 0;
        int company2_Christmas = 0;
        int company1_school = 0;
        int company2_school = 0;
        int company_total_christmas = 0;
        int company_total_school = 0;
        int company1_total_donations = 0;
        int company2_total_donations = 0;
        
        // Ask user for company names
        System.out.print("Enter the first company: ");
        company1_name = kb.nextLine();
        System.out.print("Enter the second company: ");
        company2_name = kb.nextLine();
        
        // Ask for company christmas donations
        System.out.println("Enter how much each company donated for Christmas gifts:");
        System.out.print(company1_name+" donated: ");
        company1_Christmas = kb.nextInt();
        System.out.print(company2_name+" donated: ");
        company2_Christmas = kb.nextInt();
        
        
        // Ask for company school donations
        System.out.println("Enter how much each company donated for school support:");
        System.out.print(company1_name+" donated: ");
        company1_school = kb.nextInt();
        System.out.print(company2_name+" donated: ");
        company2_school = kb.nextInt();
        
        // Total Donation for Christmas
        company_total_christmas = company1_Christmas + company2_Christmas;
        System.out.println("Total Christmas donations: " + company_total_christmas );
        company_total_school = company1_school + company2_school;
        System.out.println("Total school support donations: " + company_total_school );
        
        // Getting totals for each company
        company1_total_donations = company1_school + company1_Christmas;
        company2_total_donations = company2_school + company2_Christmas;
        
        // Comparing Totals
        if(company1_total_donations >= company2_total_donations )
        {
            System.out.println("The company that donated the most is: " + company1_name);
        }
        else
        {
            System.out.println("The company that donated the most is: " + company2_name);
        }
        
        // Text for bye
        System.out.println("Bye");
    }
        
}
