/*
Jonas Fierro 
    summary programm:
    the user will  be ask to enter the 2 companies names, how much they donated 
for christmass and school support, then the progam will print the total christmas
and school support of the 2 companies, then it will print the company that 
donated the most
*/
import java.util.Scanner;//allows program to recieve text from the user
public class HW2_Donations {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in); /*allows the text to be stored in 
        the variable name when you type in.*/
    
        // ask the user to enter the first company name
    System.out.print("Enter the first company: ");
    //reads entered text and stores it in company1
    String company1= in.nextLine();
    //ask the user to enter the second company name
    System.out.print("Enter the second company: ");
    //reads text and stores the name in company2
    String company2= in.nextLine();
    //ask the user to enter the donation of chrismas 
    System.out.println("Enter how much each comapny donated for Christmasa gifts: ");
    System.out.printf("%s donated: ", company1);//donation of company 1
    int comp1_CG = in.nextInt();//saves amount in comp1_CG
    System.out.printf("%s donated: ", company2);//donation of company 2
    int comp2_CG =in.nextInt();//saves amount in comp2_CG
    // ask the user to entert the amount for each company for school support
    System.out.println("Enter how much each company donatd for school support: ");
    System.out.printf("%s donated: ", company1);//donation of company1
    int comp1_SS= in.nextInt();//saves enter amount for company 1
    System.out.printf("%s donated: ", company2);//donation for comapny 2
    int comp2_SS= in.nextInt();//saves amount in comp2_SS
    int total_CG = comp1_CG + comp2_CG;//adds the total christmas gifts
    int total_SS = comp1_SS + comp2_SS;//adds the total school supports 
    System.out.println("Total Christmas donations: " +total_CG );//prints CG total
    System.out.println("Total school support donations: " +total_SS);//prints SS total
  int total_comp1 = comp1_CG + comp1_SS;//adds company 1 dontaions 
  int total_comp2 = comp2_CG + comp2_SS;//adds comapny 2 donations 
    
    //if else to see what company donation most 
    if(total_comp1>total_comp2){
   //// print if company 1 donation the most 
    System.out.printf("The company that donated the most is: %s ", company1 +"\n");
    System.out.println("BYE!");//shows when program ended 
    } 
    else{
        //shows if comapny 2 donated the most 
    System.out.printf("The company that donated the most is: %s ", company2 +"\n");
    System.out.println("BYE!");//shws when program ended 
    }
    }
}
