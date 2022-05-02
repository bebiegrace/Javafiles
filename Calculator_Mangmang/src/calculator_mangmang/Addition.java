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
public class Addition extends Operation{

       void result(){
        Scanner sum = new Scanner(System.in);
        
        System.out.print("Enter 1st Number: ");
        double num1 = sum.nextDouble();
        
        System.out.print("Enter 2nd Number: ");
        double num2 = sum.nextDouble();
        
        double add = num1 + num2;
        System.out.println("The addition of the two number is " + add+ ("."));
    }
}
