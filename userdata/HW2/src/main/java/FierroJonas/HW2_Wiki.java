/*
Jonas Fierro 
summary of program:
    This program will read string from the user. And the program will see if the
user typed in the a vaild wikipedia address. If address agrees to the the program
it will display the topic of that address. if the user inputs the wrong address
it will display "Not a valid wikipedia address." 
*/
import java.util.Scanner; //allows program to recieve text from the user
public class HW2_Wiki {
    public static void main (String[] args ){
    Scanner in = new Scanner(System.in); /*allows the text to be stored in the
    variable name when you type in.*/
    
   //webPage: stores address from user 
   //addressAccepted: hardcored statment to compare what user types in webPage
   //topic: holds text after wiki/ 
   String webPage, addresAccepted, topic;
   
   //displays what the program does
    System.out.println("This program will extract the topic from a valid Wikipedia"
            + " webpage address.");
    //ask the user to input address
    System.out.print("Enter a web address: ");
    
    //saves the texts entered by the user
   webPage = in.nextLine(); 
    
   //hardcoded wiki address
    addresAccepted = "https://en.wikipedia.org/wiki/";
    
    //if else statement to see if the user entered the right address
    if (webPage.toLowerCase().startsWith(addresAccepted)){
        
        //pulles the topic part of the text 
        topic=webPage.substring(addresAccepted.length());
        
        //displays the topic 
        System.out.println("Topic: " + topic);
    }
    else{
        //displays when address is not correct 
    System.out.println("Not a valid wikipedia webpage address.");
    }
    //shows when program ended
    System.out.println("BYE");
    }
}
