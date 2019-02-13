package studentB;


import java.util.Scanner;

/**
 *
 * Timothy Balela
 */
public class HW1_Animals {
    public static void main(String[] args) {
        // Instantiate Variables
        Scanner kb = new Scanner(System.in);
        String Animal1 = " ";
        String Animal2 = " ";
        String Animal3 = " ";
        
        // Print Text
        System.out.println("Enter three animal names separated by a space:");
        System.out.println("The three animals are:");
        
        // Animal User input
        Animal1 = kb.nextLine();
        Animal2 = kb.nextLine();
        Animal3 = kb.nextLine();
        
        // Print Format
        System.out.printf("The tiny %1s asked the %1s to go check on the restless %s.\n",Animal1,Animal2,Animal3);
        
        // Print out Bye
        System.out.println("Bye");
    }
    
}
