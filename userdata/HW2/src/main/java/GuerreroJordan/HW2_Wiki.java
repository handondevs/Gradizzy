import java.util.Scanner;
/*
Jordan Guerrero
This program should calculate if the user is imputing correct wiki links
 */
public class HW2_Wiki {
 
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
        System.out.println("This program will extract the topic from a valid Wikipedia webpage address.");
        System.out.print("Enter a web address: ");
        String response = ask.next();//user input
        String valid = ("https://en.wikipedia.org/wiki/");
     
        //if statements
        if(response.substring(0,30).equals(valid)){//true if input contains string valid
           int topic = response.indexOf("i/");
           System.out.print("Topic: "+ response.substring(topic+2));
        }else{
            System.out.print("Not a valid wikipedia webpage address.");
        }
        System.out.println("\nBye.");
    }
    
}
