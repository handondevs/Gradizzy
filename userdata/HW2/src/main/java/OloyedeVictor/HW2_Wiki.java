/* Victor Oloyede
This program asks the user to enter a wikipedia address;
if the user enters a valid address the program will print the
subject of the article. If the user enters an invalid address
the program will enter "not a valid wikipedia webpage address"
*/
import java.util.Scanner;
public class HW2_Wiki {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("This program will extract the topic from a valid Wikipedia webpage address.");
        System.out.printf("Enter a web address: ");
        String wiki = in.next();
        String address = "https://en.wikipedia.org/wiki/";
        
        //include the address in quotes so as to not make a comment
        
        if (wiki.contains(address))
        {
            System.out.println(wiki.substring(wiki.lastIndexOf("/")+1));
        }
        /*include substing of the "wiki" variable
        then added 1 to include all text after it
        */
        else
        {
            System.out.println("Not a valid wikipedia address. ");
        }
        System.out.println("Bye.");/* Bye after if-else statements so it does
        not have to be rewritten
        */
    }
    
    
}
