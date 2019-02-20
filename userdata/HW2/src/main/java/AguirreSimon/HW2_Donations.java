import java.util.Scanner;

public class HW2_Donations {

    
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
      //Seg 1
        int hello;
        String KillingTime; 
        
        System.out.println("Enter the first company:");
         String Firstcompa = Input.nextLine();
        
        
        System.out.println("Enter the second company:");
         String Secoundcompa = Input.nextLine();
        
        //Seg2
        
        System.out.println("Enter how much each company "
                + "donated for Christmas gifts:");
        
        
        
        System.out.println(Firstcompa + " donated:");
        int compaV1seg1 = Input.nextInt();
        
        System.out.println(Secoundcompa + " donated:");
        int compaV2seg1 = Input.nextInt();
        
        ///Seg 3
        
         System.out.println("Enter how much each company"
                 + " donated for school support:");
        
         
         
         
        
        
        System.out.println(Firstcompa + " donated:");
        int compaV1seg2 = Input.nextInt();
        
        System.out.println(Secoundcompa + " donated:");
        int compaV2seg2 = Input.nextInt();
        
        //Total
        
        int compaTotalseg1 = compaV2seg1 + compaV1seg1;
        
        //total seg3/school
        int compaTotalseg2 = compaV1seg2 + compaV2seg2;
       ////----------------------------------------
        int compaTotalFinal1 = compaV1seg1 + compaV2seg1;
        
        int compaTotalFinal2 = compaV1seg2 + compaV2seg2;
        
        
        System.out.println("Total Christmas donations: " +
                compaTotalseg1 );
        
                
        System.out.println("Total school support donations: "
                + compaTotalseg2 );
        
        //If Statment
        
        if (compaTotalseg2 >= (compaTotalseg1)){
            
            System.out.println("The company that donated the most is: " 
                    + Secoundcompa);
        }
            else {
            
            System.out.println("The company that donated the most is: " 
                    + Firstcompa);
            
        }        
    }
    
}
