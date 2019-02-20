
/*
Grace Hallett
This program askes user to enter name and then pulls out and formatts it 
including initials
 */

import java.util.Scanner;
public class HW2_Names {

    public static void main(String[] args) {
              Scanner in = new Scanner (System.in);
      String name,firstn,lastn,firsti,lasti;
      String flair = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
      //this sets a hardcoded string so that it wont have to be fully typed in code
      //its called fair because its only purpose is asthetic
      int fn,ln;
      // declaring variables
      System.out.println ("Please enter your first and last name:");
      name = in.nextLine ();
      fn = name.indexOf (" ");
      firstn = name.substring (0,fn);
      ln = name.indexOf (" ");
      lastn = name.substring (ln+1);
      //pulling individual names out of original string 
      firsti = name.substring (0,1);
      lasti = lastn.substring (0,1);
      //pulling initials out of substrings 
      /*
      System.out.println (firstn);
      System.out.println (lastn);
      System.out.println (firsti);   //Testing outputs to make sure they were correct
      System.out.println (lasti);    // no longer has importance in code, but were used for testing 
      */
      System.out.println (flair);
      System.out.printf ("|%-15s|%-15s|%1s.%1s.|%n",lastn,firstn,firsti,lasti);
      //formatting to make sure names are printed in correct order
      System.out.println (flair);
      System.out.println ("Bye");
     
    }
    
}
