package studentA;

/*
Rajan Acharya
This program will ask user to enter three animal and print the name of three animal in separate line and also print the standard sentence.
 */
import java.util.Scanner;

public class HW1_Animals {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(" Enter three animal names separated by a space: ");// Taking input from the user.
        String names = in.nextLine();
        System.out.println("The three animals are: ");
        int idx = names.indexOf(" ");//Finding the first space.
        String a = names.substring(0, idx);// Getting first word.
        names = names.substring(idx+1);// Updating the String.
        idx = names.indexOf(" ");// Updating the space.
        String b = names.substring(0,idx);// Getting Second word.
        String c = names.substring(1+names.indexOf(" "),names.length());// Getting third word.
        System.out.println(a);
        // Printing the animals name.

        System.out.println(b);

        System.out.println(c);

        System.out.println("The tiny " + b + " asked the " + c + " to go check on the restless " + a +

".");
        System.out.println("Bye");
   
        
        
    }
    
}
