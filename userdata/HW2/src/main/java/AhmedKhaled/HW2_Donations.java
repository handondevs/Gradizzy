/*
Khaled Ahmed
The program print Two companies donated money on two occasions.
and than print The company that donated the most.
*/
import java.util.Scanner;
public class HW2_Donations {
    public static void main(String[] args) {
    Scanner kb=new Scanner(System.in);
    String c1,c2, company1,company2;
    
    System.out.print("Enter the first company name: ");
    c1=kb.nextLine();   //first company name
    company1=c1.substring(0,1).toUpperCase()+c1.substring(1);    
    System.out.print("Enter the second company name: ");
    c2=kb.nextLine();    //second company name
    company2=c2.substring(0,1).toUpperCase()+c2.substring(1);         
    System.out.println("Enter how much each company donated for Christmas gifts: ");
    System.out.print(company1+" donated: ");
    int CHD1=kb.nextInt(); //  company1 donation amount for Chrismas gifts
    System.out.print(company2+" donated: ");
    int CHD2=kb.nextInt(); //  company2 donation amount for Chrismas gifts
    System.out.println("Enter how much each company donated for school support: ");
    System.out.print(company1+" donated: ");
    int SCHD1=kb.nextInt(); //  company1 donation amount for School support
    System.out.print(company2+" donated: ");
    int SCHD2=kb.nextInt(); //  company2 donation amount for School support
    System.out.printf("Total Christmas donations: %d %n", CHD1+CHD2);
    
    System.out.printf("Total school support donations: %d %n",SCHD1+SCHD2);
   
    int Tcompany1=CHD1+SCHD1;//Total company1 donation
    int Tcompany2=CHD2+SCHD2;//Total company2 donation
    if(Tcompany1>Tcompany2){
        System.out.println("The company that donated the most is: "+company1);
    }
    else{
        System.out.println("The company that donated the most is: "+company2);
     }   
    System.out.println("Bye");
    }
     
}
