/* Victor Oloyede
This program asks the user for their full name,
then puts it in a specific format, left aligned
*/
import java.util.Scanner;
public class HW2_Names {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Please enter your first and last name: ");
        String firstname = in.next();
        String lastname = in.next();
        String line = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        char one = Character.toUpperCase(firstname.charAt(0));
        char two = Character.toUpperCase(lastname.charAt(0));
        /*created two new variables that are the
        first two strings with their initials capitalized
        */
        
        // used "-" to make the text left aligned, then allocated 15 spaces
        System.out.println(line);
        System.out.printf("|%-15s|%-15s|%s.%-2s|%n", two+lastname.substring(1), one+firstname.substring(1), one, two);
        System.out.println(line);
    }
    
}
