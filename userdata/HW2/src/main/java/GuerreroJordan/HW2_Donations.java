import java.util.Scanner;
/*
Jordan Guerrero
This program calculates how much two companies donate and who donated the most 
 */
public class HW2_Donations {

    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
        
        System.out.print("Enter the first company: ");
        String Comp1 = ask.nextLine();//company 1 name
        System.out.print("Enter the second company: ");
        String Comp2 = ask.nextLine();//Company 2 name
        System.out.println("Enter how much each company donated for Christmas gifts:");
        System.out.print(Comp1 +" donated: ");
        int ChriDono1 = ask.nextInt();//Christmas donation for Company 1 
        System.out.print(Comp2 +" donated: ");
        int ChriDono2 = ask.nextInt();//Christmas donation for Company 2 
        System.out.println("Enter how much each company donated for school support: ");
        System.out.print(Comp1 +" donated: ");
        int SchDono1 = ask.nextInt();//School donation for Company 1 
        System.out.print(Comp2 +" donated: ");
        int SchDono2 = ask.nextInt();//School donation for Company 2 
        
        //calculations
        int ChriDonoT = (ChriDono1 + ChriDono2);//total Christmas donations
        int SchDonoT = (SchDono1 + SchDono2);//total School donations
        int Comp1T = (ChriDono1 + SchDono1);//total donation of Company 1 
        int Comp2T = (ChriDono2 + SchDono2);//total donation of Company 2 
        
        //output
        System.out.print("Total Christmas donations: "+ChriDonoT);
        System.out.println("\nTotal School donations: "+SchDonoT);
        if(Comp1T>Comp2T){
        System.out.println("The company that donated the most is: "+Comp1);
        }else{
        System.out.println("The company that donated the most is: "+Comp2);    
        }
        System.out.println("Bye");
    }
    
}
