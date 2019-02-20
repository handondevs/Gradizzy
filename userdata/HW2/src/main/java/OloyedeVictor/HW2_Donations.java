/*Victor Oloyede
This program asks for 2 names of companies,
asks how much each of the given companies donated for Christmas,
asks how much each of the given companies donated for school support,
prints the total donations for Christmas,
prints the total donations for school support, then
prints which one of the two companies donated more money
*/
import java.util.Scanner;
public class HW2_Donations {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
      
       System.out.printf("Enter the first company: ");
       String company1 = in.next();
       System.out.printf("Enter the second company: ");
       String company2 = in.next();
       System.out.printf("Enter how much each company donated for Christmas gifts: %n");
       //create a new line to enter user text after string variable
       System.out.printf(company1+ " "+"donated: ");
       int gift1 = in.nextInt();
       System.out.printf(company2+ " "+"donated: ");
       int gift2 = in.nextInt();
       System.out.printf("Enter how much each company donated for school support: %n");
       //create a new line to enter user text after integer variable
       System.out.printf(company1+ " "+"donated: ");
       int school1 = in.nextInt();
       System.out.printf(company2+ " "+"donated: ");
       int school2 = in.nextInt();
       System.out.printf("Total Christmas donations: "+(gift1+gift2)+"%n");
       System.out.printf("Total school support donations: "+(school1+school2)+"%n");
       int comp1sum = gift1+school1;
       int comp2sum = gift2+school2;
       /*created new variables which are the results
       of adding the first two company's amounts
       */
       if ((comp1sum)>=(comp2sum))
           /*if the total of company1's donations is greater
           than the total of company2's then, the following will print
           */
       {
           System.out.println("The company that donated the most is: "+company1);
       }
       else if ((comp2sum)>=(comp1sum))
           /*
           this else if statement is the inverse of the if statement
           above which does the same for company 2
           */
       {
           System.out.println("The company that donated the most is: "+company2);
       }
      
       
       System.out.println("Bye");
       
       
       
       
       
       
    }
    
}
