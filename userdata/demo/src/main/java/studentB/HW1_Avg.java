package studentB;

/**
 *
 * Timothy Balela
 */

import java.util.Scanner;

public class HW1_Avg {

    public static void main(String[] args) {
        // Instantiate Variables
        int OneGrade = 0;
        int SecondGrade = 0;
        int ThirdGrade = 0;
        double Avg = 0.0;
        Scanner kb = new Scanner(System.in);
        
        //Give action to user
        System.out.println("Enter grade 1: ");
        //Save user output
        OneGrade = kb.nextInt();
        
        //Give action to user
        System.out.println("Enter grade 2: ");
        //Save user output
        SecondGrade = kb.nextInt();
        
        //Give action to user
        System.out.println("Enter grade 3: ");
        //Save user output
        ThirdGrade = kb.nextInt();
        
        //Add all grades together
        Avg = OneGrade + SecondGrade + ThirdGrade;
        
        //Gets the average of all 3 grades
        Avg = Avg/3;
        
        //Prints out average
        System.out.println("The average is: " + Avg);
        
        // Show program has ended
        System.out.println("Bye");
    }
    
}
