
package hw_bmi;
import java.util.Scanner;


public class HW_BMI {

  
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight");
        double Weight = input.nextDouble();
        System.out.println("Enter your height");
        double Height = input.nextDouble();
        double BMI = Weight/(Height*Height);
        if (BMI<18){
            System.out.println("and you are Underweight");
        }
        else if(BMI>=18 && BMI<25){
            System.out.println(" and you are Normal");
        }
        else if(BMI>=25 && BMI<30){
            System.out.println(" and you are Overweight");
        }
        else if(BMI>=30){
            System.out.println(" and you are Obese");
        }
    }
    
}
