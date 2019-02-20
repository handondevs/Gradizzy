
import java.util.Scanner;

public class HW2_Donations {
    /*
    Dakota Allen
    This program asks for the donations of two comapnies and interacts with them
    */
    public static void main(String[] args) {
        Scanner co = new Scanner(System.in);
        Scanner co2 = new Scanner(System.in);
        Scanner codon = new Scanner(System.in);
        Scanner co2don = new Scanner(System.in);
        Scanner coschdon = new Scanner(System.in);
        Scanner co2schdon = new Scanner(System.in);
        //This is a lot. Unsure if I even have to do all of this but oh well
        
        System.out.print("Enter the first company: ");
        String firstco = co.nextLine();
        
        System.out.print("Enter the second company: ");
        String secco = co2.nextLine();
        //Those two asks for the company names
        
        System.out.println("Enter how much each company donated for Christmas gifts: ");
        System.out.print(firstco + " donated: ");
        int firstcodon = codon.nextInt();
        
        System.out.print(secco + " donated: ");
        int seccodon = co2don.nextInt();
        //Asks for how much each company donated as Christmas gifts
        
        System.out.println("Enter how much each company donated for school support: ");
        System.out.print(firstco + " donated: ");
        int firstcoschdon = coschdon.nextInt();
        
        System.out.print(secco + " donated: ");
        int seccoschdon = co2schdon.nextInt();
        //Asks how much each school donated as school support
        
        
        int totalcodon = firstcodon + seccodon;
        //Adds the Christmas donations of each compnay
        
        int totalcoschdon = firstcoschdon + seccoschdon;
        //Adds the school support donation of each company
        
        System.out.println("Total Christmas donations: " + totalcodon);
        System.out.println("Total school support donations: " + totalcoschdon);
        
        int totalfirstcodon = firstcodon + firstcoschdon;
        //Adds the total donations of the first company
        
        int totalseccodon = seccodon + seccoschdon;
        //Adds the total donations of the second company
        
        if (totalfirstcodon > totalseccodon){
            //Checks to see if the first company donated more and will run the next line if it did
        System.out.println("The company that donated the most is: " + firstco);
        }
        else {
            //Print this if the first company did not donate more or if it was even
        System.out.println("The company that donated the most is: " + secco);
        }
        
        System.out.println("Bye");
        
    }
    
}
