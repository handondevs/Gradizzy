import java.util.Scanner;

/*
Miguel Armendariz 
Discription: Write a program that reads a string from the user. If it is a valid wikipedia webpage,
it extracts and prints the topic for that page.
 */
public class HW2_Wiki {

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       System.out.print("This program will extract the topic from a valid Wikipedia webpage address.\n" +
"Enter a web address: "); String webaddress=in.next(); //ask the user for a valid Wiki address

String validaddress="https://en.wikipedia.org/wiki/"; // the string is used to see if the user input has the valid address
int len=validaddress.length(); // finds the length of the string to be used in the method substirng

if(webaddress.substring(0,len).equals(validaddress)) // is to see if the web address is valid
{
    String topic=webaddress.substring(len); // is the topic word
    System.out.printf("Topic: %s",topic); // outputs the topic word
}
else{
System.out.print("Not a valid wikipedia webpage address.");
}
System.out.println("\nBye");
    }
    
}
