import java.util.Scanner;
/**
 *
 * @author Gabriella
 */
public class Hw2_Names {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String name, first, last; 
      String fintial ;
      String lintial ;
      String hLine = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
      int idx;
      
      
        System.out.println("Please enter your first and last name: ");
        name = in.nextLine();
        idx = name.indexOf(" ");    
        first = name.substring(0,idx);
        last = name.substring(idx+1);
        fintial =first.substring(0,1);
        lintial=last.substring(0,1);
        
        
        System.out.println(hLine);
        System.out.printf("|%-15s|%-15s|%-15s|%n",last,first,fintial +"." + lintial+ ".");
        System.out.println(hLine);
        
    }
    
}

