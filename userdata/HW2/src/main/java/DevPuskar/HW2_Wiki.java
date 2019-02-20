/*
Puskar Dev
This program reads a string( a webpage address ) from the user and checks if it is a valid wikipedia webpage.
*/
import java.util.Scanner;
public class HW2_Wiki {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.printf("Enter a web address: ");
        String address = in.nextLine();
        String valid_address = "https://en.wikipedia.org/wiki/"; // mandatory part of every Wiki webpage address
        int length_of_vd = valid_address.length();
        String s1 = address.substring(0,length_of_vd); // accesssing the basic address(i.e the mandatory part as mentioned above) of a given address
        
                
        if( s1.equals(valid_address))
        {
            if(address.equals(valid_address)) 
            {
                System.out.printf("Topic:\n"); // if given address is same as that of basic address then print nothing
                System.out.printf("Bye.\n");
            }
            else{
                String topic = address.substring(length_of_vd); // if basic address is same, then print the given topic
                System.out.printf("Topic: %s\n",topic);
                System.out.printf("Bye.\n");
            }
        }
        else{
            System.out.printf("Not a valid wikipedia webpage address.\n"); // if all condition fails, print as not a valid wikipedia webpage. 
            System.out.printf("Bye.\n");
        }
        
    }
    
}
