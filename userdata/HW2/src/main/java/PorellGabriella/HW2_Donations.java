import java.util.Scanner;
/**
 *
 * @author Gabriella
 */
public class HW2_Donations {

    
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      String name1 ; //created to allow user to input a company
      String name2 ;
      int christmas1 = 0; //in order to be able to add the numbers at the end,
                          // I created them as integers
      int christmas2 =0 ;
      int school1 =0;
      int school2 =0;
      
    
      System.out.println ("Enter the first company: " + " ");
      name1=in.nextLine() ;
      System.out.println ("Enter the second company: " + " ");
      name2= in.nextLine();
      
      
      System.out.println ("Enter how much each company donated for Christmas gifts: ");
      christmas1= in.nextInt();
      christmas2 = in.nextInt();
      System.out.println(name1 + " " + "donated: " + christmas1);
      System.out.println(name2 + "  " + "donated: " + christmas2);
      
      
      System.out.println ("Enter how much each company donated for school support: ");
      school1= in.nextInt();
      school2 = in.nextInt();
      System.out.println(name1 + " " + "donated: " + school1);
      System.out.println(name2 + "  " + "donated: " + school2);
      
      int av1= christmas1 + christmas2;
      int av2=school1 + school2;       
      System.out.println ("Total Christmas donations: " + " " + av1);
      System.out.println ("Total Christmas donations: " + " " + av2);
      
      
      System.out.print ("The company that donated the most is: ");
        if (av1>av2){
            System.out.println(name1);
        }
        else {
            System.out.println(name2);
        }
        
        
      System.out.println ("Bye.");
      
        
        
        
        
    }
    
}
