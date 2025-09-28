
package hw_remainig_seconds;
import java.util.Scanner;

public class HW_Remainig_Seconds {

   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter your desired seconds");
       int Seconds = input.nextInt();
       int Remaning_Minutes = Seconds/60;
       int Remainig_Seconds = Seconds%60;
        System.out.println(Remaning_Minutes+" minutes and "+Remainig_Seconds+"seconds");
        
    }
    
}
