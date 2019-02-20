/*
Puskar Dev
This program asks the user for their full name and prints to the screen on aspecified format with initials.
*/
import java.util.Scanner;
public class HW2_Names {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Please enter your first and last name: ");
        String name = in.nextLine();
        String line ="~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        int pos = name.indexOf(" ");
        String first_name = name.substring(0,1).toUpperCase()+name.substring(1,pos); // Making the first letter of the fist name capital.
        String last_name = name.substring(pos+1,pos+2).toUpperCase()+name.substring(pos+2); // Making the first letter of the last name capital.
        System.out.println(line);
        System.out.printf("|%-15s|%-15s|%c.%c.|%n",last_name,first_name,first_name.charAt(0),last_name.charAt(0));
        System.out.println(line);
    }
    
}
