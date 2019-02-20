/**
 *
 * @author aaryan patel
 */
import java.util.Scanner;
public class HW2_Donations {

    public static void main(String[] args) {
        //goal: write a program that calculates total donations of two different causes.
        Scanner kb = new Scanner(System.in);
        
        //get company names
        System.out.print("Enter the first company: ");
        String co1 = kb.nextLine();
        System.out.print("Enter the second company: ");
        String co2 = kb.nextLine();
        
        //get donation amounts
        System.out.println("Enter how much each company donated for Christmas gifts:");
        System.out.printf("%s donated: ",co1);
        int gifts_co1 = kb.nextInt();
        System.out.printf("%s donated: ",co2);
        int gifts_co2 = kb.nextInt();
        System.out.println("Enter how much each company donated for school support:");
        System.out.printf("%s donated: ",co1);
        int sch_co1 = kb.nextInt();
        System.out.printf("%s donated: ",co2);
        int sch_co2 = kb.nextInt();
        
        //calculate total donations
        int co1_total = gifts_co1 + sch_co1; //company 1 total
        int co2_total = gifts_co2 + sch_co2; //company 2 total
        
        int gifts_total = gifts_co1 + gifts_co2; //total Christmas gifts donations (both companies)
        int sch_total = sch_co1 + sch_co2; //total school donations (both companies)
        
        //identifying which company donated the most
        String mostDonations = "";
        if(co1_total > co2_total){
            mostDonations = co1;
        }
        else{
            mostDonations = co2;
        }
        
        //output
        System.out.printf("Total Christmas donations: %d%n", gifts_total);
        System.out.printf("Total school support donations: %d%n", sch_total);
        System.out.printf("The company that donated the most is: %s%n", mostDonations);
        System.out.println("Bye");
    }
    
}
