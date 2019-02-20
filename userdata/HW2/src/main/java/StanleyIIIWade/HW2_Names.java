
package hw2_names;
import java.util.Scanner;
public class HW2_Names {


    public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    String name, first, last;
    String border = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    System.out.print("Enter your first and last name: ");
    int idx;
    name = kb.nextLine();
    idx = name.indexOf(" ");
        first = name.substring(0,idx);
        last = name.substring(idx+1);
        char ina = name.charAt(0);
        char inb = name.charAt(idx+1);
        char inA = Character.toUpperCase(ina);
        char inB = Character.toUpperCase(inb);
// inb = name.substring(1);
       
        System.out.println(border);
        System.out.printf("|%15s|%15s|%s.%s|%n",last,first,inA,inB);
        System.out.println(border);
    }
    
}
