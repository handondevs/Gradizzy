import java.util.Scanner;
public class HW2_Donations {

   /*
    Miguel Armendariz 
Discription: Write a program that: asks for 2 names of companies, asks how much each of the given companies donated for Christmas,
asks how much each of the given companies donated for school support, prints the total donations for Christmas
prints the total donations for school support, prints which one of 2 companies donated more money in general.
    */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        System.out.print("Enter the first company: "); //first companies name
        String company1=in.next();
        System.out.print("Enter the second company: "); // second companies name
        String company2=in.next();
        
        System.out.println("Enter how much each company donated for Christmas gifts: ");
        System.out.printf("%s donated: ",company1); int christamount=in.nextInt(); //gets the first christmas donation
        System.out.printf("%s donated: ",company2); int christamount2=in.nextInt(); //gets the second christmas donation
        
        System.out.println("Enter how much each company donated for school support: ");
        System.out.printf("%s donated: ", company1); int schamount=in.nextInt(); //gets the first school donation
        System.out.printf("%s donated: ",company2); int schamount2=in.nextInt(); //getst the second donaion
        
        int totalchristmas = (christamount+christamount2); // adds the christmas donations
        int totalschool=(schamount+schamount2); // adds the school support donations
        
        System.out.println("Total Christmas donations:"+totalchristmas); //outputs total christmas donations
        System.out.println("Total School support donations:"+totalschool); //outputs the total school support donation
        
        if(christamount>=christamount2 && schamount>=schamount2) // to get which company donated more in christmans 
         //and school donations
        {
        System.out.printf("The company that donated the most is: %s\n",company1); 
        }
        else
        {
       System.out.printf("The company that donated the most is: %s\n",company2);
        }
     System.out.println("Bye");
      
        
        
    }
    
}
