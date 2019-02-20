/*
Sanjita Dhakal
ID:1001670562
Date:02/07/2019
*/

//Task1
package hw2_names;

import java.util.Scanner;
public class HW2_Names {

    
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String line,name,lastName;
        String initial1,initial2;
        int pos1;
        
        
        
        System.out.print("Please enter your first and last name:");
        line=kb.nextLine();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        
        pos1=line.indexOf(" ");
        lastName=line.substring(0,pos1);
        name=line.substring(pos1+1);
        name=name.substring(0,1).toUpperCase()+line.substring(pos1+2);
        lastName=lastName.substring(0,1).toUpperCase() + line.substring(1,pos1);
        
        initial1=line.substring(0,1).toUpperCase();
        initial2=line.substring(pos1+1,pos1+2).toUpperCase();
       
        System.out.println("|"+name+"              "+"|"+lastName+"              "+"|"+initial1+"."+initial2+"."+"|");   
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        
    }
    
}
