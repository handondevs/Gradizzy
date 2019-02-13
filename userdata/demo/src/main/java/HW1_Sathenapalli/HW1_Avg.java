package HW1_Sathenapalli;//Arun joel Sthenapalli
//1001664942

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arunj
 */
import java.util.Scanner;
public class HW1_Avg {   
public static void main(String[] args){
Scanner kb= new Scanner(System.in);
int grade1,grade2,grade3;

System.out.println("enter grade1 : ");
grade1 = kb.nextInt();
System.out.println("enter grade2: ");
grade2 = kb.nextInt();
System.out.println("enter grade3: ");
grade3 = kb.nextInt();
double f= (grade1+grade2+grade3)/3;
System.out.println("the average is: "+ f  );
System.out.println("bye");
 }
}



