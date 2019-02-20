/* 
Endy Romero
Write a program that reads a string and formats it as a phone number. First it 
should check that the string has exactly 10 symbols. If it does, the program 
will print the formatted version. If the string does not have exactly 10 
symbols, print Invalid and do not process it. 
*/

import java.util.Scanner;

public class HW2_PhoneNumber {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String phone, area, prefix, line; 
        int len;
        
        System.out.println("This program will format a string as a phone number.");
        System.out.print("Enter the number: ");
        
        phone = kb.nextLine();
        len = phone.length();
        
        if(len == 10){
            area = phone.substring(0,3);
            prefix = phone.substring(3,6);
            line = phone.substring(6);
            System.out.printf("Formatted number: (%s)%s-%s%n",area,prefix,line);        
            }
        else {
            System.out.print("Not a valid number. Please enter another one: ");
            phone = kb.nextLine();
            len = phone.length();
                if(len == 10){
                area = phone.substring(0,3);
                prefix = phone.substring(3,6);
                line = phone.substring(6);
                System.out.printf("Formatted number: (%s)%s-%s%n",area,prefix,line);
                }
                else {
                System.out.println("You missed your second try! No more chances!");
                }
            }
        
        System.out.println("Bye.");

        }

    }
    
