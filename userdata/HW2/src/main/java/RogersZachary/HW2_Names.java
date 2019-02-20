
//Zach Rogers
//This program asks for your name and pints it in a organized table pattern       
import java.util.Scanner;

public class HW2_Names {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String name, first, last, initial, initial2;
        int idx;
        int zr;
        String hLine = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";

        System.out.print("Enter your first and last name: ");
        name = kb.nextLine();
        idx = name.indexOf(" ");

        first = name.substring(0, idx);
        last = name.substring(idx + 1);
        initial = name.substring(0, 1);
        initial2 = name.substring(idx + 1, idx + 2);

        System.out.println(hLine);
        System.out.printf("|%-15s|%-15s|%s.%-1s.|%n", last, first, initial, initial2);
        System.out.println(hLine);
    }

}
