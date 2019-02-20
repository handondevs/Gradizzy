/*
by Marian Farah-Beck
This program asks the user for their full name and prints the name in a table with 3 columns.
*/
import java.util.Scanner;

public class HW2_Names {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String name, first, last, initial, initial2, bothInitials;
        String curvyline = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        int idx;
        //name.charAt(0);
        //name = name.toUpperCase(name.charAt(0));
        //name.substring(name.indexOf(" ")+1)
        //first = name.toUpperCase(0);
        //initial = name.length(0);
        System.out.print("Please enter your first and last name: ");
        name = kb.nextLine();
        idx = name.indexOf(" ");
        name = name.toUpperCase();
        first = name.substring(0,idx);
        last = name.substring(idx+1);
        //first = name.toUpperCase(0);
        //last = name.toUpperCase(0,1);
        initial = first.substring(0,1);
        initial2 = last.substring(0,1);
        bothInitials = initial + "." + initial2 + ".";
        System.out.printf("%-44s%n",curvyline);
        System.out.printf("|%-15s|%-15s|%4s|%n",last, first, bothInitials);
        System.out.printf("%-44s%n",curvyline);
        System.out.println("Bye");
    }
}
