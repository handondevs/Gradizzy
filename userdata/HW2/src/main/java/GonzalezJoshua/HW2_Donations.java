/*
Joshua Gonzalez
This program compares two companies and their contributions to the community
also it determines which one helped more
 */
package hw2_donations;
import java.util.Scanner;
/**
 *
 * @author joshu
 */
public class HW2_Donations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);   //scanner
        String companyOne, companyTwo; //strings for two companies
        int donationOne, donationTwo, schoolOne, schoolTwo; //all the int's for the donations
        
        System.out.print("Enter the first company: "); //initializes all variables
        companyOne = kb.nextLine();
        System.out.print("Enter the second company: ");
        companyTwo = kb.nextLine();
        System.out.println("Enter how much each company donated for Christmas gifts: ");
        System.out.print(companyOne + " donated: ");
        donationOne = kb.nextInt();
        System.out.print(companyTwo + " donated: ");
        donationTwo = kb.nextInt();
        System.out.println("Enter how much each company donated for school support: ");
        System.out.print(companyOne + " donated: ");
        schoolOne = kb.nextInt();
        System.out.print(companyTwo + " donated: ");
        schoolTwo = kb.nextInt();
        System.out.println("Total Christmas donations: "+ (donationOne + donationTwo)); //adds all christmas donations
        System.out.println("Total School support donations: "+ (schoolOne+schoolTwo)); //adds all school support donations
        int totalOne = (donationOne+schoolOne);  //calculates total donations for first company
        int totalTwo = (donationTwo+schoolTwo);  //calculates total donations for second company
        
        if(totalOne>totalTwo){ //checks to see which is greater
            System.out.println("The company that donated the most is :" +companyOne);
        }
        else{
            System.out.println("The company that donated the most is: " +companyTwo);
        }
        System.out.println("Bye");
        
    }
    
}
