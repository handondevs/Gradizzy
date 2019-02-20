/*
 * This program will take a first name and a last name
 * printing the name in order of last then first, properly capitalized
 * and print initials at the end
 */

/**
 * UTA ID: 1001584020
 * @author Justin
 */
import java.util.Scanner;

public class HW2_Names {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // initializing variables and creating a scanner called
        String lastName = "";
        String firstName = "";
        String initials = "", firstInt,secondInt;
        Scanner input = new Scanner(System.in);
        
        // here the program asks the user for a first and last name, seperated by a space
        System.out.println("Please enter your first and last name: ");
        String names = input.nextLine();
        int len = names.length(); // taking the length of their full name
        
        // this for loop goes until it sees a space, then separates it from first
        // to last name
        for(int firstN = 0; firstN < len; firstN++)
        {
            if(names.substring(firstN).contains(" "))
            {
                firstName = "|" + names.substring(0, firstN);
                lastName = "|" + names.substring(firstN + 1, len);
            } 
        }
        firstInt = firstName.substring(1,2);
        secondInt = lastName.substring(1,2);
        initials = "|" + firstInt + "." + secondInt + ".";
        // i added the | because i counldn't find a way to put it into the printf
        
        // The finished product, printing the proper output 
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.printf("%s%15s%15s|\n",lastName,firstName,initials);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
}
