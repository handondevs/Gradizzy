import java.util.Scanner;
/*This program asks the user to enter their name and then
outputs their name in a table as well as their initials.

*/
public class HW2_Names {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        String name, first, last;
             char initial, f_initial, l_initial;
        String Line = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        int idx;
        
        System.out.print("Enter your first and last name: ");
        name = in.nextLine();
        idx = name.indexOf(" ");
        first = name.substring(0,idx);
        last = name.substring(idx+1);
        f_initial = first.charAt(0);
        l_initial = last.charAt(0);
       System.out.println(Line);
    System.out.printf("|%-15s|%-15s|%s.%s. |%n",last,first,l_initial,f_initial);
       System.out.println(Line);
    }
    
}
