/*
Jonas Fierro 
summary of program:
    the user iwll be asked to input a phone number or 10 symbols, and the
program will go through a if else statment if the user is entering the right phone number.
once the phonenumber meets the program standard it will print a formatted number
if the user enters wrong number that passes 10 symbols or is under 10 it will 
allow the user enter a second time but after that it will display "you missed 
your secnd try! no more chances!"
*/
import java.util.Scanner;//allows program to recieve text from the user
public class HW2_PhoneNumber {

    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
         /*allows the text to be stored in the
    variable name when you type in.*/
        
         //number: saves the user text enter 
         //idx: is hardcored close quotes 
         //idx1: saves the first 3 symbols 
         String number, idx, idx1;
         
         //tells the user about what the program is gonna do
    System.out.println("This program will format a string as a phone number.");
    
    //ask the user to enter value 
    System.out.print("Enter the number: ");
    
    //saves user value to string number 
    number = in.nextLine();
    
    //if else statement to see if the entered text meets the program rules 
   if(number.length()==10){
       //proccess to formate text 
       idx="";
       idx=idx+'(';
       idx1 = number.substring(0,3);
       idx=idx+idx1;
       idx=idx+')';
       idx1=number.substring(3,6);
       idx=idx+idx1;
       idx=idx+'-';
       idx1=number.substring(6);
       idx=idx+idx1; 
       
   System.out.println("Formatted number: "+idx);
   System.out.print("BYE!");
   }
   else if(number.length()<10 || number.length()>10) {
       //display when the text is lower or higher than 10 
   System.out.print("Not a vaild number. Please enter another one: ");
   number = in.nextLine();//initilazes text in number
    if(number.length()==10){
        
        //shows the proccess to formatted text in (***)***-****
    idx="";
       idx=idx+'(';
       idx1 = number.substring(0,3);
       idx=idx+idx1;
       idx=idx+')';
       idx1=number.substring(3,6);
       idx=idx+idx1;
       idx=idx+'-';
       idx1=number.substring(6);
       idx=idx+idx1; 
       
       //prints formatted string
   System.out.println("Formatted number: "+idx);
   System.out.print("BYE!");//shows when program ended
   }
    else if (number.length()<10 || number.length()>10){
        //shows that second time the text is enter it is still wrong
   System.out.print("You missed your second try! No more chances!\n");
   System.out.print("BYE!");//shows when program is ended 
   }
    else{
    System.out.print("BYE!");
    }

   }
   }
 
    }

