// arun joel sathenapalli
//1001664942
package hw2_names;
import java.util.Scanner;
/**
 *
 * @author moham
 */
public class HW2_Names {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      String name;
        int idx;
        String first_name;
        String first;
        String fst;
        String last_name;
        String last;
        String lst;
        String F;
        String F1;
        String L;
        String L1;
        String f;
        String l;
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Please enter your first and last name:");
       
        name = kb.nextLine();
        idx = name.lastIndexOf(" "); //The idx variable searches and stores the index of the space between the names.
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        first_name = name.substring(0,idx); //Stores first name.
        first = first_name.substring(0,1); //Stores the first name except for first letter.
        fst = first_name.substring(1,idx);
        f = first.toUpperCase(); //Converts the entre first_name except the first letter to lower case.
        last_name = name.substring(idx+1); //Last name.
        last = last_name.substring(0,1); //Stores the last_name except the first letter.
        lst = last_name.substring(1);
        l = last.toUpperCase(); //Converts the entire last_name except the last letter to lower case. 
      
        
        System.out.printf("|%-15s|%-15s|%s.%s|",l+lst,f+fst,l,f);
        
        System.out.printf("%n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
}
