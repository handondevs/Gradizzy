package HW1_Sathenapalli;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author abhin
 */
public class HW1_Animals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
    
        
        Scanner in=new Scanner (System.in);
        int idx,idx2,idx3;
    System.out.println("Enter three animal names separated with spaces:");
    String animals =in.nextLine();
    idx=(animals.indexOf (" "));
    String animal1=animals.substring(0,idx);
    idx2=animals.indexOf(" ",idx+1);
    String animal2=animals.substring(idx+1,idx2);
    idx3=animals.indexOf(" ",idx+1);
    String animal3=animals.substring(idx3+1);
    System.out.println(animal1);
    System.out.println(animal2);
    System.out.println(animal3);
    System.out.println("The tiny "+animal2+" asked the "+animal3+" to go check on the restless "+animal1+".");
    System.out.println("Bye!");
    
    }
    
    
    
    
}
