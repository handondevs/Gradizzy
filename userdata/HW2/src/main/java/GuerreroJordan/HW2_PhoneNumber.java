import java.util.Scanner;
/*
Jordan Guerrero
This program reads a string and formats it as a phone number
 */
public class HW2_PhoneNumber {

    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
        
        System.out.println("This program will format a string as a phone number.");
        System.out.print("Enter the number: ");
        String PhoneNum = ask.next();//store user input
        int PhoneCounter = PhoneNum.length();//stores number of characters
        
        //if statements
        if(PhoneCounter == 10 ){//checking if user input enough numbers
          System.out.print("Formatted number: ("+PhoneNum.substring(0,3)+")"+PhoneNum.substring(4,7)+"-"+PhoneNum.substring(7,10));
        
        }else{//if count is not 10 
            System.out.print("Not a valid number. Please enter another one: ");
            String PhoneNum2 = ask.next();//store user input again
            int PhoneCounter2 = PhoneNum2.length();//stores number of characters for new number
            
            if(PhoneCounter2==10){//check if number is vaid a second time
                System.out.print("Formatted number: ("+PhoneNum2.substring(0,3)+")"+PhoneNum2.substring(4,7)+"-"+PhoneNum2.substring(7,10));
            }else{
                System.out.print("You missed your second try! No more chances!");
            }
            
            
        }
        System.out.println("\nBye.");
                
                
    
    }
    
}
