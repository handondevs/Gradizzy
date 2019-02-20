/*
Grace Hallett
This program checks an address to see if its a valid wikipedia address 
if it is, the program pulls the topic and displays it
 */
import java.util.Scanner;
public class HW2_Wiki {
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    String address, check, topic, wiki = "https://en.wikipedia.org/wiki/";
    //hardcoding a string to later compare to imputted address
    System.out.println ("This program will extract the topic"
            + " from a valid Wikipedia webpage address.");
    System.out.println ("Enter a web address:");
    address = in.nextLine ();
    check = address.substring (0,30);
    //the check looks at the first 30 characters in the string and puts it into a substring
    // since the beginning of the wikipedia address is always the same, the length of this
    //substring is always valid
    topic = address.substring (29+1);
    // this pulls the topic from the wikipedia address if it is valid
    if (check.equals(wiki)) {//this checks if the 'check' is the same as the hardcoded string
        System.out.println ("Topic: " + topic);} //prints the topic if valid
    else {
    System.out.println ("Not a vaild wikipedia webpage address."); }//prints if the adddress isnt valid
    System.out.println ("Bye");
    
    
    }
    
}
