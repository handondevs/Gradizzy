/*
Dipika Giri
This program will print the name in tables iwth 3 columns
 */
import java.util.Scanner;

public class HW2_Names {

    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String border = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        String name, first,last, initial,initial1,Finitial, Linitial;
        int space;
        
        System.out.print("Please enter your first and last name: ");
        name = kb.nextLine();
        space = name.indexOf(" ");
        
        first = name.substring(1, space);
        last = name.substring(space+2);
        
        Finitial = name.substring(0,1);
        Finitial = Finitial.toUpperCase();  //capitalize first letter of each word
        Linitial = name.substring(space+1, space+2);
        Linitial = Linitial.toUpperCase();  //capitalize first letter of each word
        
        initial = name.substring(0,1) + "." + name.substring(space+1, space+2);
        initial1 = initial.toUpperCase(); //capitalizes the initials
        
        System.out.println(border);
        System.out.printf("|%-1s%-25s|%-1s%-25s|%4s|%n ",Linitial,last,Finitial,first,initial1);
        System.out.println(border);
        
        
                
        
        
        
    }
    
}
