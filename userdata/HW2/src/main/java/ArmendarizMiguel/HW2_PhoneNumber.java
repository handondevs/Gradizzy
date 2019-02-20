import java.util.Scanner;
public class HW2_PhoneNumber {
/*
    Miguel Aremdariz
Discription: Write a program that reads a string and formats it as a phone number. First it should check that the string 
has exactly 10 symbols.If it does, the program will print the formatted version. If the string does not have exactly
10 symbols, print Invalid and do not process it. 
    */

    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      
      System.out.print("This program will format a string as a phone number\n"
              + "Enter a number: "); 
     String number=in.nextLine();
 
      
     if(number.length()==10) // sees if string is 10 characters in length
     {
        String firstthree=number.substring(0,3); //get the first three characters/number
     String secondthree=number.substring(3,6); //gets the second three characters/numbers
     String lastfour=number.substring(6,10); // gets the last four characters/numbers
     System.out.printf("Formatted number: (%s)%s-%s", firstthree, secondthree,lastfour);
     }
      else
     {
     System.out.print("Not a valid number. Please enter another one: "); 
     String numb=in.next();
     
    if(numb.length()==10)  //does the same as the first if statement but with a new int variable
     {
   String firstthree=numb.substring(0,3); 
   String secondthree=numb.substring(3,6);
   String lastfour=numb.substring(6,10);
   System.out.printf("Formatted number: (%s)%s-%s", firstthree, secondthree,lastfour);
     }
     else{
   System.out.print("You missed your second try! No more chances!");
     }
     }
   System.out.print("\nBye.");
   
    }
    
}
