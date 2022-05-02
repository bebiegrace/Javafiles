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
public class Subtraction extends Operation{
     void result(){
        Scanner Sub = new Scanner(System.in);
        
        System.out.print("Enter 1st Number: ");
        double num1 = Sub.nextDouble();
        
        System.out.print("Enter 2nd Number: ");
        double num2 = Sub.nextDouble();
        
        double sub = num1 - num2;
        System.out.println("The subtraction of the two number is " + sub+ ("."));
    }
}