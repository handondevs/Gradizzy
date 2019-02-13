/*
Rajan Acharya
This program calculates the average of three grades
*/
package studentA;
import java .util.Scanner;
public class HW1_Avg {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       // Asking user to input three grades.
       System.out.print("Enter grade 1: ");
       int grade1 = in.nextInt();
       System.out.print("Enter grade 2: ");
       int grade2 = in.nextInt();
       System.out.print("Enter grade 3: ");
       int grade3 = in.nextInt();
       double average = ((grade1+grade2+grade3)/3.0);// Calculating the average.
       System.out.println("The average is: " + average);
       System.out.println("Bye");
    }
    
}
