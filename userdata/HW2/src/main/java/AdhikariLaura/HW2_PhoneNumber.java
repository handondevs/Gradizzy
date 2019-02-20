
/*
 Laura Adhikari
Format a phone number
 */


import java.util.Scanner;

public class HW2_PhoneNumber {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        
        System.out.println("This program will format a string as a phone number.");
        System.out.print("Enter the number: ");
        String userData = input.nextLine();      
        String format = userData;       //declaring variables
        int length = userData.length();
       
        
        if (length==10){
            
            //setting the format for the input string if it satisfies the if condition
            format = "(" +format.substring(0,3) +")"+format.substring(3,6) + "-"+format.substring(6,10); //format of the 10 digits number using substrings
            System.out.println("Formatted number: "+ format );
        }
        
        else {
            System.out.print("Not a valid number. Please enter another one: " );
            String data= input.nextLine();
            int len1 = data.length();
            
            if (len1==10){
            String format1 = data;
            format1 = "(" +format1.substring(0,3) +")"+format1.substring(3,6) + "-"+format1.substring(6,10);
             System.out.println("Formatted number: " + format1);
            }
            else {

                    System.out.println("You missed your second try! No more chances!");
                    }
            
            }
        System.out.println("Bye.");
            
        }
        
    }
    

