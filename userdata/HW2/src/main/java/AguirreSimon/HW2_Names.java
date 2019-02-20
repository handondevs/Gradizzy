import java.util.Scanner;

public class HW2_Names1 {
 
    //Simon Aguirre
    
    
    //God i hated making this program so much
    //At least it semi works i think
    //I basicly found substring made it a capital turned
    ///etc etc i know a script is gonna be runing this but what is the point?
    //Commenting is usless 
    
    public static void main(String[] args) {
      
   Scanner sc = new Scanner(System.in); 
   //Addtional Strings just in case i need to fix something or try something else
   String Extra,Extra1;
   //I tried this Boarder thing but it broke my program 
   String Boarder = "\n----------------------------------------------------------------------------------";
   String Fname= "", Lname = "", in = ".";
   System.out.print("Please enter your first and last name: ");
   
   //I was conflicted wither or not if i should use nextln and attempting only one string of name
   String Fname1 = sc.next();
   
   
   String Lname1= sc.next();
   
   
   
  Fname = Fname + Fname1.charAt(0);
  //Found first character which is 0 of name
  Fname = Fname.toUpperCase();
  //Changing the name of the letter to a upper case which is good practice
  Fname = Fname + Fname1.substring(1);
  //Finializing the substring
  Lname = Lname + Lname1.charAt(0);
  Lname = Lname.toUpperCase();
  //Intials where tricky so havng te char @0 made it eazy and i added a . for the S.A. thing
  in = in + Fname.charAt(0) + ".";
in = in + Lname.charAt(0) + ".";

//System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println(Boarder);
System.out.print(String.format("|%-15s", Fname));
//Ofc 15 spaces
System.out.print(String.format("|%-15s", Lname1));
//Again another 15 spaces
System.out.print(String.format("|%s|", in));
// Intials with dots and stuff
System.out.println(Boarder);
//System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


    }
    
}

    
    

