/*
Sanjita Dhakal
ID:1001670562
Date:02/07/2019
*/

//Task2

package hw2_wiki;

import java.util.Scanner;
public class HW2_Wiki {

    
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String webAddress, name, hello, input, name2,name3;
         int idx;
        
        System.out.println("This program will extract the topic from a valid Wikipedia webpage address.");
        System.out.print("Enter a web address:");
        webAddress=kb.nextLine();
        
        input="https://en.wikipedia.org";
        
        idx=input.indexOf('g');
        name=webAddress.substring(0,idx+7)+webAddress.substring(idx+7);
      
        
        
        if(webAddress.equals(name)) {
         
            hello=webAddress.substring(idx+7);
        
            System.out.println("Topic:"+hello);
        
        }
        if(!(webAddress.equals(name))) {
        
        System.out.println("Not a valid wikipedia webpage address.");
                
        
        }
       
        System.out.println("Bye.");
        
    }
}
