/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RWBOYSEN18
 */
import java.util.Scanner; 
public class HW2_Names {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        String first;
        String last;
        String Line = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        int x; 
        char firstI;
        char SecondI;
        
        System.out.print("Please enter your first and last name: ");
        name = keyboard.nextLine();
        x = name.indexOf(" ");
        first = name.substring(0,x);
        last = name.substring(x+1);
        firstI = name.charAt(0);
        SecondI = name.charAt(x+1);
        System.out.println(Line);
        System.out.printf("|%-15s|%-15s|%-15s %n",last,first,firstI +"."+SecondI+"."+"|");
        System.out.println(Line);
        System.out.println("bye");
        
    }
    
}
