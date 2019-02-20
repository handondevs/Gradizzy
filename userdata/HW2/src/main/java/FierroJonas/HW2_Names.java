import java.util.Scanner;//allows the program to use scanner, to read the text
public class HW2_Names {

    /*
    Name: Jonas Fierro
    summary of program: 
        this program will ask the user to enter there name and it will formate
    it, and then there intial 
     */
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);//lets in. to read text form the user
        
        String userName; // saves the user whole name in this vairable 
        String nameFirst;//is a substring to save the furst part of userName
        String nameLast;//saves the last part og userName 
        int idx;//helps seprate the text 
        
     //ask the user to enter there whole name with space 
        System.out.print("Please enter your first and last name: ");
           userName= in.nextLine();//acceptes the texts to save userName 
           idx = userName.indexOf(" ");//saves the space in idx 
           
           //process of spreating and formatting the name 
      nameFirst = userName.substring(0,idx);//takes the first pat and stores it to nameFirst
      nameLast = userName.substring(idx+1);//takes second part and stores it to nameLast 
     //serprates the first letter of nameFirst uF:uppercaseFirstname
      String uF=nameFirst.substring(0,1);
      //separtes the first letter of nameLast uL: uppercaseLastname
      String uL=nameLast.substring(0,1);
      //serpates the remaining of nameFirst to lf:lowercse First name
      String lF=nameFirst.substring(0+1);
      //serpates the remaining of nameLast to lL:lowercase lastname 
      String lL=nameLast.substring(0+1);
      uF=uF.toUpperCase();//statement upper case the first inital of first name 
      uL=uL.toUpperCase();//statement upper case the first intial  of last name 
      lL=lL.toLowerCase();//statement lowercase the varabile stored for lastname 
      lF=lF.toLowerCase();//statement lowercase the varables stored for firsst anem 
      //combines the name together 
       nameFirst=uF+lF;
       nameLast=uL+lL;
       
       //print the name formatted and initals
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.printf("|%-15s |%-15s|%s.%s.|\n", nameLast, nameFirst, uF, uL);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
     
        
    }
    
    
}
