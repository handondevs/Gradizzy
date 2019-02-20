/*
Rajan Acharya
This program asked the name of two company ask how much they donated for the christmas and school and calculate who donated the most.
*/
import java.util.Scanner;
public class HW2_Donations {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the first company : ");
    String comp1 = in.nextLine();
    System.out.print("Enter the second company : ");
    String comp2 = in.nextLine();
    System.out.println("Enter how much each company donated for christmas gifts : ");
    System.out.print(comp1 + " donated : ");
    int donation1 = in.nextInt();
    System.out.print(comp2 + " donated : ");
    int donation2 = in.nextInt();
    System.out.println("Enter how much each company donated for school support : ");
    System.out.print(comp1 + " donated : ");
    int money1 = in.nextInt();
    System.out.print(comp2 + " donated : ");
    int money2 = in.nextInt();
    int Cdonations = (donation1+donation2);
    int Sdonations = (money1+money2);
    System.out.println("Total christmas donations : " + Cdonations);
    System.out.println("Total school support donations : " + Sdonations);
    int totalC1 = (donation1+money1);
    int totalC2 = (donation2+money2);
    if(totalC1 > totalC2)
    {
        System.out.println("The company that donated the most is : " + comp1);
    }
    else
    {
        System.out.println("The comapny that donated the mostis : " + comp2);
    }
    System.out.println("Bye");
    
    
    
    
    }
    
}
