import java.util.Scanner;
/*
    printf
 */

public class HW2_Names {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String name, first, last;
        String hline = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        int idx;
        
        System.out.print("Please enter your first and last name: ");
        name = kb.nextLine();
        idx = name.indexOf(" ");
        first = name.substring(0,idx);
        last = name.substring(idx+1);
    
        System.out.println(hline);
        System.out.printf("|%-14s |%-13s | " + first.charAt(0) + "." + last.charAt(0) + ".|", first, last,10/0.0);
        System.out.println("\n" + hline);
        
        
        
        
    }
    
}
