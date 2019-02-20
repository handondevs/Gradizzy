import java.util.Scanner;

public class HW2_Donations {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String company_1, company_2;
        int christmasgifts_1, christmasgifts_2;
        int school_1, school_2;
        int m, n;
         System.out.print("Enter the first company: ");
       company_1=in.next();
       System.out.print("Enter the second company: ");   
       company_2=in.next();
        System.out.println("Enter how much each company donated for Christmas gifts: ");
       System.out.print(company_1+" donated: ");
       christmasgifts_1=in.nextInt();
       System.out.print(company_2+" donated: ");
       christmasgifts_2=in.nextInt();
       System.out.println("Enter how much each company donated for school support: ");
       System.out.print(company_1+" donated: ");
       school_1=in.nextInt();
       System.out.print(company_2+" donated: ");
       school_2=in.nextInt();
      System.out.println("Total Christmas donations: "+
              (christmasgifts_1+christmasgifts_2));
      System.out.println("Total school support donations: "+(school_1+school_2));
       m = christmasgifts_1+school_1;
       n=christmasgifts_2+school_2;
       System.out.println("The company that donated the most is: "
               + ""+(m>n?company_1:company_2));   
       System.out.print("Have a good day ");
       
      
        
    }
    
}
