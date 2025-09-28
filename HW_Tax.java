
package hw_tax;
import java.util.Scanner;


public class HW_Tax {

    
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("Enter purchase amount");
        double PA = input.nextDouble();
        System.out.println("Enter the tax rate in %");
        double TR = input.nextDouble();
        double tax = PA*(TR/100);
        System.out.println("sale tax is: "+tax);
        
             
    }
    
}
