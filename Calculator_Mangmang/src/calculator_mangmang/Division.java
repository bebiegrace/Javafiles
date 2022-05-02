/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator_mangmang;
import java.util.Scanner;
/**
 *
 * @author 1styrGroupB
 */
public class Division extends Operation{
   void result(){
        Scanner quotient = new Scanner(System.in);
        
        System.out.print("Enter 1st Number: ");
        double num1 = quotient.nextDouble();
        
        System.out.print("Enter 2nd Number: ");
        double num2 = quotient.nextDouble();
        
        double divide = num1 / num2;
        System.out.println("The division of the two number is " + divide+ ("."));
    }
}