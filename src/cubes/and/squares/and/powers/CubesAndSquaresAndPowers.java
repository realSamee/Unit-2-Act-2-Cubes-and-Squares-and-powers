/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubes.and.squares.and.powers;

/**
 *
 * @author saliy5109
 */
import java.util.Scanner;

public class CubesAndSquaresAndPowers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int op = 0;
        
        while (op != 4)  {
            System.out.println("1… Find the value of a number squared (NOTE: 22 = 2 x 2)"
                    + "\n2… Find the value of a number cubed (NOTE: 23 = 2 x 2 x 2)"
                    + "\n3… Find the value of a number, to any power"
                    + "\n4… Exit");
            op = scan.nextInt();
            
            double num = 0;
            double power = 0;
            
            if (op == 4) {
                System.out.println("Exiting program");
            } else {
                if (op == 1) {
                    power = 2;
                } else if (op == 2) {
                    power  = 3;
                }
                
                System.out.println("Enter the number:");
                num = scan.nextDouble();
                
                if (power == 0) {
                    System.out.println("Enter the power:");
                    power = scan.nextDouble();
                }
                
                System.out.println("The result is " + Math.pow(num, power));
            }
        }
    }
    
}
