
/**
 *
 * Zach Rogers
 * This program will give the names of two companies and the amount they donate to two charities and then will calculate the total
 * donations and then will compare both to see which one donated the most.
 */
import java.util.Scanner;

public class HW2_Donations {

    public static void main(String[] args) {
        Scanner zr = new Scanner(System.in);
        String company1, company2;
        int cmpgifts1, cmpgifts2, cmpschool1, cmpschool2;

        double totalchristmas, totalschool;

        System.out.print("Enter the name of the first company: ");
        company1 = zr.nextLine();
        System.out.print("Enter the name of the second company: ");
        company2 = zr.nextLine();
        System.out.println("Enter the amount that each company donated for Christmas gifts: ");
        System.out.print("Company " + company1 + " donated: ");
        cmpgifts1 = zr.nextInt();
        System.out.print("Company " + company2 + " donated: ");
        cmpgifts2 = zr.nextInt();
        System.out.println("Enter the amount each company donated for school support: ");
        System.out.print("Company " + company1 + " donated: ");
        cmpschool1 = zr.nextInt();
        System.out.print("Company " + company2 + " donated: ");
        cmpschool2 = zr.nextInt();
        totalchristmas = cmpgifts1 + cmpgifts2;
        System.out.println("The total christmas donations are: " + totalchristmas);
        totalschool = cmpschool1 + cmpschool2;
        System.out.println("The total school support donations are: " + totalschool);

        if ((cmpgifts1 + cmpschool1) >= (cmpgifts2 + cmpschool2)) {
            System.out.println("The company that donated the most is: " + company1);
        } else {
            System.out.println("The system that donated the most is: " + company2);
        }

    }

}
