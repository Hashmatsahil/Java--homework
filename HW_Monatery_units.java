
package hw_monatery_units;

import java.util.Scanner;

public class HW_Monatery_units {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("Enter an amount in dollars and cents");
        double amount = input.nextDouble();
        int Remaning_cents = (int)(amount*100);
        int dollars = Remaning_cents/100;
        Remaning_cents %=100;
        int quarter = Remaning_cents /25;
        Remaning_cents%=25;
        int dimes = Remaning_cents / 10;
        Remaning_cents%=10;
        int nickels = Remaning_cents/5;
        Remaning_cents%=5;
        int pennies = Remaning_cents;
        
        System.out.println("Your amount ("+amount+")consites of:");
        System.out.println("Dollars:  "+dollars);
        System.out.println("Quarters: "+quarter);
        System.out.println("Dimes:    "+dimes);
        System.out.println("Nickels:  "+nickels);
        System.out.println("Pennies:  "+pennies);
        
    }
    
}
