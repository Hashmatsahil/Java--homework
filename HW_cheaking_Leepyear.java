
package hw_cheaking_leepyear;
import java.util.Scanner;

public class HW_cheaking_Leepyear {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a year to cheak if its leap year or not");
        
        int Year = input.nextInt();
       
        if ((Year%4==0 )&&(Year%100!=0)||(Year%400==0)){
        System.out.println("its a leap year");}
        else {
            System.out.println("its not a leap year");
        }
    
            }
    
}
