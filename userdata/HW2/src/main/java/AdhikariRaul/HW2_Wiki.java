/*
 Raul Adhikari
this program asks the user for a wiki page and if it meets the criteria it prints out the subject of the webpage.
 */
 import java.util.Scanner;
public class HW2_Wiki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String subject;
        System.out.println("This program will extract the topic from a valid Wikipedia webpage address.");
        System.out.print("Enter a web address: ");
       
        String w = kb.nextLine();
        String wiki = ("https://en.wikipedia.org/wiki/.");
      
   
        
          if ( w.indexOf("https://en.wikipedia.org/wiki/."))
          {
            System.out.println("Computer Science");
              
          } 
          else  
          { 
              System.out.print("Not a valid wikipedia webpage address");
          }
          System.out.println("Bye");
          
          
    }
    
    
}

