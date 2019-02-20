/*
Puskar Dev
This program asks the user for the name for two companies and prints thier total individual donations and also prints the name of the company that donated the most.
*/
import java.util.Scanner;
public class HW2_Donations {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.printf("Enter the first company: ");
        String first_company = in.nextLine(); // in.nextLine() is used incase the cpmpany's name comprises of more than one word.
        System.out.printf("Enter the second company: ");
        String second_company = in.nextLine();
        
        System.out.printf("Enter how much each company donated for Christmas gifts:\n");
        System.out.printf("%s donated: ", first_company); // Company name is accessed from above and is displayed to ask for more data of the company.
        int christmas_d1 = in.nextInt();
        System.out.printf("%s donated: ",second_company);
        int christmas_d2 = in.nextInt();
        
        System.out.printf("Enter how much each company donated for school support:\n");
        System.out.printf("%s donated: ", first_company);
        int school_d1 = in.nextInt();
        System.out.printf("%s donated: ",second_company);
        int school_d2 = in.nextInt();
        
        System.out.printf("Total Christmas donations: %d\n", christmas_d1+christmas_d2);
        System.out.printf("Total school support donations: %d\n", school_d1+school_d2);
        
        if ((christmas_d1 + school_d1) > (christmas_d2 + school_d2)) // compares the total donation of both companies
            System.out.printf("The company that donated the most is: %s\n", first_company);
        else
            System.out.printf("The company that donated the most is: %s\n", second_company); 
       
        System.out.printf("Bye.\n");
        
    }
    
}
