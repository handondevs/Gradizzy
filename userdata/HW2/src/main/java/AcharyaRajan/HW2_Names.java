/*
 
Rajan Acharya
This program ask the user for their first and last name and print in table.
 */
import java.util.Scanner;
public class HW2_Names {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter your first and last name: ");
    String name = in.nextLine();
    String line = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    int space = name.indexOf(" ");
   String first = name.substring(0,space);
   String second = name.substring(space+1);
   String first1 = first.substring(0,1).toUpperCase();
   String Second1 = second.substring(0,1).toUpperCase();
   String third1 = first.substring(1,first.length());
   String fourth1 = second.substring(1,second.length());
   System.out.println(line);
   System.out.printf("|%-15s|%-15s|%s.%s.|\n",Second1+fourth1,first1+third1,first1,Second1);
   System.out.println(line);
   
    
    }
    
}
