/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RWBOYSEN18
 */
import java.util.Scanner;
public class HW2_Donations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a;
        String b;
        int x;
        int y;
        int x1;
        int y1;
        int aTotal;
        int bTotal;
        int totalC;
        int totalS;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the first company: ");
        a = keyboard.next();
        System.out.print("Enter the second company: ");
        b = keyboard.next();
        System.out.println("Enter how much each company"
                + " donated for Christmas gifts: ");
        System.out.print(a +" "+"donated:");
        x = keyboard.nextInt();
        System.out.print(b+" "+"donated:");
        y = keyboard.nextInt();
        System.out.println("Enter how much each company donated "
                + "for school support:");
        System.out.print(a+" "+"donated:");
        x1 = keyboard.nextInt();
        System.out.print(b+" "+"donated:");
        y1 = keyboard.nextInt();
        aTotal = x + x1;
        bTotal = y + y1;
        totalC = x + y;
        totalS = x1 + y1;
        System.out.println("Total Christmas donations:"+" "+totalC);
        System.out.println("Total School support donations:"+" "+totalS);
        
        if (aTotal > bTotal)
        {
            System.out.println("The company that donated the most is:"+ " "
                    + a);
        }
        if (aTotal < bTotal)
        {
            System.out.println("The company that donated the most is:"+ " "
                    + b);
        }
        System.out.println("bye.");
        
    }
    
}
