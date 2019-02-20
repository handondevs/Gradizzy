import java.util.Scanner;
/**
 *
 * @author Gabriella
 */
public class HW2_Wiki {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
   
        String wiki;
        String topic;
        int idx;
        
        
        
        System.out.println("This program will extract the topic from a valid Wikipedia webpage address.");
       
       
    
            wiki = in.nextLine();
            topic=in.nextLine();
        
       
            if ((wiki.equals("https://en.wikipedia.org/wiki/" ))) 
       { 
                 System.out.println("Enter a web address: " + wiki +topic );
                 idx = wiki.indexOf(topic);
                 wiki = topic.substring(idx+1);  
                 System.out.println ("Topic: " +wiki );
       }
       else 
       {
        System.out.println( wiki );
        System.out.println("Not a valid wikipedia address.");
        }
        
  
        System.out.println("Bye.");
        
        
    }
    
}
