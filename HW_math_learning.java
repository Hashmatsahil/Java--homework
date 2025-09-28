
package hw_math_learning;

import java.util.Scanner;

public class HW_math_learning {
   
    public static void main(String[] args) {
       double random = Math.random();
       double random2 = Math.random();
        int num1 = (int)(random*10);
        int num2 = (int)(random2*10);
         int sub = num1-num2;
        
        Scanner input= new Scanner(System.in);
        System.out.println("What is "+num1+"-"+num2+"= ?");
        int User = input.nextInt();
        if ( User == sub ){
            System.out.println("Correct");
       
        }
        else {
        System.out.println("Uncorrect");
        }
    }
    
}
