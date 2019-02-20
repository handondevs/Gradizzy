/* Fobah Ethy
Two companies donated money on two occasions. Write a program that: • asks for 2 names of companies 
• aks how much each of the given companies donated for Christmas. 
• aks how much each of the given companies donated for school support 
• prints the total donations for Christmas 
• prints the total donations for school support 
• prints which one of 2 companies donated more money in general. 

*/
import java.util.Scanner;
public class HW2_Donations {
  
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        String company1, company2;//  created to store strings
        int amount1, amount2,amount3,amount4, christmas,support; // created to store integers
       
      
        System.out.print("Enter the first company:");// announce current  step. user's input required
        company1= kb.nextLine();// allow to have user's input
        System.out.print("Enter the second company:");// announce current  step. user's input required
        company2= kb.nextLine();// allow to have user's input
        System.out.println("how much each company donated for christmas gift:");// announce current  step. user's input required
        System.out.printf("%s donated: ", company1); amount1= kb.nextInt();// allow to have user's input
        System.out.printf("%s donated: ", company2); amount2= kb.nextInt();   // allow to have user's input             
        System.out.println("how much each company donated for school support:");// announce current  step. user's input required
        System.out.printf("%s donated: ", company1); amount3= kb.nextInt();// allow to have user's input
        System.out.printf("%s donated: ", company2); amount4= kb.nextInt(); // allow to have user's input
        christmas= amount1 + amount2; // integer created to sum up amount of christmas donation 
        support= amount3 + amount4;// integer created to sum up amount of support donation
        System.out.printf("Total Christmas donations is:%d%n",christmas); // print this format for the sum of christmas donation 
        System.out.printf("Total school support donations is:%d%n",support); //// print this format for the sum of support donation
        int a1= amount1+ amount3; int a2= amount2+ amount4; // sum up each donations per company
        if (a1>a2) // condition statement if company a1 donation greater than company a2 donation
        {
        System.out.printf("The company that donates the most is: %s%n",company1); // print this format to declare that the company 1 won 
        }
        else// if the "if" statement is not correct we go to the one below 
        {
        System.out.printf("The company that donates the most is: %s%n",company2); // print this format to declare that the company 2won 
        }
        System.out.println("Bye");
        
        
        
      
    }
    
}
