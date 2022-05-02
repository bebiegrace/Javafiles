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
public class Calculator_Mangmang {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
       
       int i=0;
        while (i==0){
        Scanner scan = new Scanner(System.in);
        System.out.println("~~~WELCOME TO MY SIMPLE CALCULATOR~~~ ");
        System.out.println("         1. Addition");
        System.out.println("         2. Subtraction");
        System.out.println("         3. Multiplication");
        System.out.println("         4. Division");
        System.out.println("         0. Exit");
        System.out.println("");
        System.out.print("Please choose your operation: ");
        
        int choice = scan.nextInt();
            if (choice == 1){
                Operation add = new Addition();
                add.result();
               
            }else if (choice == 2){
                Operation sub = new Subtraction();
                sub.result();
                
            }else if (choice == 3){
                Operation mul = new Multiplication();
                mul.result();
                
            }else if (choice == 4){
                Operation div = new Division();
                div.result();
                
            }else if (choice == 0){
                System.out.println("Thank you for using my simple calculator!");
                System.out.println("");
                break;
               
            } else {
                 Operation simple = new Operation();
                    simple.result();
                    break;
            }
           
        }
    }
}