
package hw_divisibilitu;

import java.util.Scanner;

public class HW_Divisibilitu {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Pleas Enter a number to cheak its divisibility");
        int number = input.nextInt();
        
        if(number%2==0 && number%3==0){
            System.out.println("This number is divisible by 2 and 3");
            
        }
      else  if (number%2==0 ){
            System.out.println("Number is divisible by 2");
        }
      else  if (number%3==0 ){
            System.out.println("Number is divisible by 3");}
      else if (number%2==0 ^ number%3==0){
            System.out.println("The number is only divisible by 2 or 3 but not both");
            
      }
        else {
                    System.out.println("Invalid number");
                    }
    }
    
}
