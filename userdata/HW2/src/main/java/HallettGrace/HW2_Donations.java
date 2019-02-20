/*
Grace Hallett
This program asks the user to enter data on two seperate donations from two companies
to compare them
 */
import java.util.Scanner;
public class HW2_Donations {
    public static void main(String[] args) {
      Scanner in = new Scanner (System.in);
      String comp1,comp2;
      int comp1g,comp2g,comp1s,comp2s,comp1t,comp2t;
      System.out.println ("Enter the first company:");
      comp1 = in.nextLine ();
      System.out.println ("Enter the second company:");
      comp2 = in.nextLine ();
      //asks user to enter companies
      System.out.println ("Enter how much each "
              + "company donated for Christmas gifts:");
      System.out.print (comp1 + " donated: ");
      comp1g = in.nextInt ();
      System.out.println (comp2 + " donated: ");
      comp2g = in.nextInt ();
      //asks user to enter data for first set of donations
      System.out.println ("Enter how much each company "
              + "donated for school support:");
      System.out.print (comp1 + " donated: ");
      comp1s = in.nextInt ();
      System.out.println (comp2 + " donated: ");
      comp2s = in.nextInt ();
      //asks user to enter data for second set of donations
      System.out.println ("Total Christmas donations:" + (comp1g + comp2g));
      System.out.println ("Total school support donations:" + (comp1s + comp2s));
      //adds all donation data to print totals for seperate donations
      comp1t = comp1g + comp1s;
      comp2t = comp2g + comp2s;
      //creates total donation amounts for each company
      if (comp1t>comp2t) {//compares values for each total 
          System.out.println ("The company that donated the most is: " + comp1); }
      //prints first company name only if total donation value is greater than second company
      else {
          System.out.println ("The company that donated the most is: " + comp2); }
      //prints second company name if total donation value for the first company is less than first company
      System.out.println ("Bye");
      
      
      
      
      
      
    }
    
}
