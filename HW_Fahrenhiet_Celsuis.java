
package hw_fahrenhiet_celsuis;
import java.util.Scanner;

/**
converting temperature fahrenheit to celsius
 */
public class HW_Fahrenhiet_Celsuis {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature by fahrenheit");
        double Fahrenheit = input.nextDouble();
        double Celsius = (Fahrenheit - 32)* 5/9;
      
        System.out.println(Fahrenheit +" F  = "+Celsius+" C ");
    }
    
}
