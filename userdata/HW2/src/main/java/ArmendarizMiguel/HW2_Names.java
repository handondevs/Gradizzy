import java.util.Scanner;
public class HW2_Names {
/*Miguel Armendariz
Discription: Write a program that asks the user for their full name given in the format first last. 
The program will do the necessary processing and print the name in a table with 3 columns: Last, First, Initials.
    */
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.print("Please enter your first and last name:"); // ask for users name
    String name=in.nextLine();
    
    int firstspace=name.indexOf(" ");
    String firstname=name.substring(0,firstspace+1); //take the first name in the string
    String lastname=name.substring(firstspace); //takes the last name in the string
    String firstint=name.substring(0,1).toUpperCase(); //take the first initial and upper cases it
    String lastint=name.substring(firstspace,firstspace+2).toUpperCase(); //takes the last initial and upper cases it
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.printf("|%-15s|%-15s|%s.%-1s|\n",lastname,firstname,firstint,lastint);
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
 
    }

}
