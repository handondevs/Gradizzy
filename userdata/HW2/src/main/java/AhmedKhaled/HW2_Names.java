/*
Khaled Ahmed 
This program that asks the user for their full name given in the format (first last.)
*/
import java.util.Scanner;
public class HW2_Names {

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String name,first,last;
        int idx;
        String i1,i2;
        String hLine="~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        System.out.print("Please enter your first and last name: ");
        name=kb.nextLine();
        idx =name.indexOf(" ");
        first=name.substring(0,idx);
        last=name.substring(idx+1);
        i1=first.substring(0,1);//initial for the first name 
        i2=last.substring(0,1); //initial for the last name 
        i1 = i1.toUpperCase();
        i2 = i2.toUpperCase();
        String first1=first.substring(0,1).toUpperCase()+first.substring(1);
        String last1=last.substring(0,1).toUpperCase()+last.substring(1);
        System.out.println(hLine);
        System.out.printf("|%-15s|%-15s|%-1s.%-1s.|%n" ,last1,first1,i1,i2);//%n for next line 
        
        
        System.out.println(hLine);
        
            }
    
}
