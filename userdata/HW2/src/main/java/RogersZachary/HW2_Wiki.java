
//Zach Rogers
import java.util.Scanner;

public class HW2_Wiki {

    public static void main(String[] args) {
        Scanner zr = new Scanner(System.in);
        int idx, idv;
        String text1, text2, text3;

        System.out.println("This program will extract the topic from a valid Wikipedia webpage address.");
        System.out.print("Enter a web address: ");
        text1 = zr.nextLine();
        System.out.println("The web address you entered is: " + text1);
        //int len = text1.length();
        idv = text1.indexOf("https://en.wikipedia.org/wiki/");
        idx = text1.indexOf(0, 30);
        text2 = text1.substring(0,30);
        text3 = text1.substring(30);

        if (text2.equals(idv)) {
            System.out.println("Not a valid wikipedia webpage address.");
        } else {
            System.out.println("Topic: " + text3);
        }
        System.out.println("Bye.");

    }

}
