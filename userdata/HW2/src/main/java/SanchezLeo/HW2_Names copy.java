
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Leo Sanchez
 * CSE 1310-004
 * @author leosanchez
 */
public class HW2_Names {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String name, first, last;
        String hLine = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        int idx;
        
        System.out.print("Enter your first and last name: ");
        name = kb.nextLine();
        idx = name.indexOf(" ");
        first = name.substring(0,idx);
        last = name.substring(idx+1);
        String initials = first.substring(0,1) + "." + last.substring(0,1) + ".";
        System.out.println(hLine);
        System.out.printf("|%-15s|%-15s|%s|%n",last,first,initials);
        System.out.println(hLine);
        
       
    }
    
}
