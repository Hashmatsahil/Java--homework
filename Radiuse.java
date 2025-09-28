/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiuse;

import java.util.Scanner;

/**
 *
 * @author Sahil
 */
public class Radiuse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        
      double Radius = input.nextDouble();
       
      double Area = Radius*Radius * 3.14;
      
        System.out.println("The area of cricle is  " +Area);
        
        
                
      
    }
    
}
