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
public class Multiplication extends Operation{
    void result(){
        Scanner multiply = new Scanner(System.in);
        
        System.out.print("Enter 1st Number: ");
        double num1 = multiply.nextDouble();
        
        System.out.print("Enter 2nd Number: ");
        double num2 = multiply.nextDouble();
        
        double product = num1 * num2;
        System.out.println("The multiplication of the two number is " + product+ ("."));
    }
}