/*
by Marian Farah-Beck
This program reads a string from the user. If it is a valid wikipedia webpage, it extracts and prints the topic.
*/
import java.util.Scanner;

public class HW2_Wiki {

    public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    String webpage, text, topic;
    int idx;
    //text = text.split(webpage);
    System.out.println("This program will extract the topic from a valid Wikipedia webpage address. ");
    System.out.print("Enter a web address: ");
    webpage = kb.nextLine();
    text = "https://en.wikipedia.org/wiki/";
    idx = webpage.indexOf(text);
    topic = webpage.substring(idx+30);
    System.out.println("Topic: "+ topic);
    System.out.println("Bye.");
    //If (webpage.hasNextLine())
    If(webpage = webpage.hasNextLine(text))
    {
    System.out.println("Topic: " + topic);
    }
    else if (webpage = webpage.hasNextLine())
    {
    System.out.print("Not a valid wikipedia webpage address.");
    }
    //System.out.println("Topic: ");
    //System.out.println(topic);
    System.out.println("Bye.");
    } 
}
