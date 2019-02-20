/*
Dipika Giri
This program reads a string and formats it. 
*/

import java.util.Scanner;

public class HW2_PhoneNumber {

    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String areacode, ans, middlenumber, lastdigits, ans2 ;
        
        
        System.out.print("Enter the number: ");
        ans = kb.nextLine();
        //max number to 10 character
        areacode = ans.substring(0,3);
        middlenumber = ans.substring(3,6);
        lastdigits = ans.substring(6);
        
        if (ans.length()==10) {
            System.out.println("Formatted number: " + "(" + areacode + ")"+ middlenumber+ "-" + lastdigits);
           
        }
        else {
            System.out.print("Not a valid number. Please enter another one: "); 
            ans2 = kb.nextLine();
        String areacode2, middlenumber2, lastdigits2;
        areacode2 = ans2.substring(0,3);
        middlenumber2 = ans2.substring(3,6);
        lastdigits2 = ans2.substring(6);
        
        if (ans2.length()==10) {
            System.out.println("Formatted number: " + "(" + areacode2 + ")"+ middlenumber2 + "-" + lastdigits2);
        }
        else {
            System.out.println("You missed your second try! No more chances!");
            
        }
        }
        System.out.println("Bye.");
        
    }
        
} 
        
      
        
        
                
    
