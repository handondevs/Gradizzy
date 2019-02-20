/*
 * This program takes two companies and asks the user what their donations are
 * for christmas and school, prints the total for christmas and school
 * then tells the user who dontated the most
 */

/**
 * UTA ID: 1001584020
 * @author Justin
 */
import java.util.Scanner;

public class HW2_Donations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // defining variables with appropriate names, plus a scanner
        String compOne = "", compTwo = "";
        int chrisOne = 0, chrisTwo = 0, skoolOne = 0, skoolTwo = 0;
        int totChrist, totSkool, totOne, totTwo;
        Scanner input = new Scanner(System.in);
        
        // most of the following code is just asking for user input
        System.out.println("Enter the first company: ");
        compOne = input.nextLine();
        System.out.println("Enter the second company: ");
        compTwo = input.nextLine();
        System.out.println("Enter how much each company donated for Christmas gifts:");
        System.out.println(compOne + " donated: ");
        chrisOne = input.nextInt();
        System.out.println(compTwo + " donated: ");
        chrisTwo = input.nextInt();
        System.out.println("Enter how much each company donated for school support:");
        System.out.println(compOne + " donated: ");
        skoolOne = input.nextInt();
        System.out.println(compTwo + " donated: ");
        skoolTwo = input.nextInt();
        // calculating the total donations in christmas and school
        totChrist = chrisOne + chrisTwo;
        System.out.println("Total Christmas Donations: " + totChrist);
        totSkool = skoolOne + skoolTwo;
        System.out.println("Total school support donations: " + totSkool);
        // determining which company gave the msot donations
        totOne = chrisOne + skoolOne;
        totTwo = chrisTwo + skoolTwo;
        if(totOne > totTwo)
        {
            System.out.println("The company that donated the most is: " + compOne);
        }
        else if(totOne < totTwo)
        {
            System.out.println("The company that donated the most is: " + compTwo);
        }
        else // this is just in case they both are equal
        {
            System.out.println("Both Companies donated the same amount!");
        }
        System.out.println("Good Bye"); // being rude is the key to loneliness
    }
    
}
