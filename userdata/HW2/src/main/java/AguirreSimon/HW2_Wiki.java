import java.util.Scanner;

public class HW2_Wiki {  
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        //import new scanner easy as can be
        String Webpage = "https://en.wikipedia.org/wiki/";
        //I put webpage = to the input page looking for
        //rather than put index cause it will cause errors and is more longer
        
        String Wiki,anything;
        //basic int/var
        System.out.println("This program will extract the topic from a"
                + " valid Wikipedia webpage address.");
        System.out.println("Enter a web address:");
        //Of course capturing the input from the user
        String InputWeb = Input.nextLine();
        
        //i attempted to put equals but oddly enough it does not work
        if (InputWeb.startsWith (Webpage)) {
            //This compares the webpage variable i input earlyer
             String PageDesc = InputWeb.substring(Webpage.length());  
             //i made the inputweb find the / after and record anything 
             //hoever many characters long
             System.out.println("Topic: " + PageDesc);
             //prints out the result
        } else {

                  System.out.println("Not a valid wikipedia webpage address.");
           // else statment just in case
           
           
                      }
        System.out.println("Bye.");
        }
    }
    

