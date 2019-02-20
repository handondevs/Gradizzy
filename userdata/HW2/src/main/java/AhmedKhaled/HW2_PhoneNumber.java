/*
Khaled Ahmed 
This program will print the formatted version [(xxx)yyy-zzzz] for a uesr Phone number 
a program that reads a string and formats it as a phone number. First it should check that the string has exactly 10 symbols.
If it does, the program will print the formatted version.
If the string does not have exactly 10 symbols, print Invalid and do not process it.
*/
import java.util.Scanner;
public class HW2_PhoneNumber { 
    public static void main(String[] args) {
       Scanner kb=new Scanner(System.in);
       System.out.println("This program will format a string as a phone number.");
       System.out.print("Enter the number:");
       String number=kb.nextLine();//user enter hisPhone number first time 
      
       int numberl=number.length();// number lenght
       if (numberl==10){
           String fp=number.substring(0,3);//first part number for the first chance
           String fm=number.substring(3,6);//mid part number for the first chance
           String fl=number.substring(6,10);//last part number for the first chance
            System.out.printf("Formatted number: (%s)%s-%s",fp,fm,fl);
           
       }
    
       else{
           System.out.print("Not a valid number. Please enter another one: ");
           String number2=kb.nextLine();//user enter hisPhone number Second time (if first time missing) 
       int number2l=number2.length();// number lenghtfor the second chance
       if (number2l==10){
           String fp2=number2.substring(0,3);//first part number for the second chance
           String fm2=number2.substring(3,6);//mid part for the second chance
           String fl2=number2.substring(6,10);//last part for the second chance
            System.out.printf("Formatted number: (%s)%s-%s%n",fp2,fm2,fl2);
        }    
        else{
            System.out.println("You missed your second try! No more chances!");
       }      
       
       }
   
         System.out.println("Bye.");  
    }
}
