/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author marcosbermudez
 * By: Marcos Bermudez
 * Problem: We were asked to take user input being their name and print it out looking 
 * like a table and also print out their initials
 */
public class HW2_Names {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner username = new Scanner(System.in);
        System.out.print("Please enter your first and last name: ");
        String fullname= username.nextLine();
        int idx = fullname.indexOf(" ");
        String firstname, lastname, firstinitial,secondinitial;
        firstname = fullname.substring(0,idx);
        lastname = fullname.substring(idx+1);
        firstname = firstname.substring(0,1).toUpperCase()+firstname.substring(1);
        lastname = lastname.substring(0,1).toUpperCase()+lastname.substring(1);
        firstinitial = firstname.substring(0,1);
        secondinitial = lastname.substring(0,1);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.printf("|%-15s|%-15s|%s.%s.|",firstname,lastname,firstinitial,secondinitial);
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
