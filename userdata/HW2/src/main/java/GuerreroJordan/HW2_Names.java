import java.util.Scanner;
/*
Jordan Guerrero 
This program should ask user for name and organize the name on a table
 */
public class HW2_Names {

    public static void main(String[] args) {
      Scanner ask = new Scanner(System.in);
      //First name
      System.out.print("Please enter your first and last name: ");
      String Name1 = ask.nextLine();//storing name in Name1
      String LetterCap1 = Name1.substring(0,1).toUpperCase();//Capitilizes first letter of First name
      int space = Name1.indexOf(" ");//seperation of first and last name
      String NameCap1 = LetterCap1+Name1.substring(1,space);//Combine Capital letter with name
      
      //Last name
      String LastName = Name1.substring(space);//Store last name
      String LetterCap2 = LastName.substring(1,2).toUpperCase();//Capitilize first letter of last name
      String NameCap2 = LetterCap2 + LastName.substring(2);//Combine Capital letter with last name



      //output section
      System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      System.out.printf("\n|%-15s|%-15s|%s.%s|",NameCap1,NameCap2,LetterCap1,LetterCap2);
      System.out.print("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
}
