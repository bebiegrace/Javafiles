package bebieoperator;
import java.util.Scanner;
public class BebieOperator {

    
    public static void main(String[] args) {
         int a, b;
        System.out.println("Enter two Numbers...");
        Scanner o = new Scanner(System.in);
        a=o.nextInt();
        b=o.nextInt();
        System.out.println("Addition- "+(a+b));
        System.out.println("Multiplication- "+(a*b));
        System.out.println("Divition- "+(a/b));
        System.out.println("Subraction- "+(a-b));
        System.out.println("Modulus- "+(a%b));
        System.out.println("Relational- "+(a&b));
        System.out.println("Not equal- "+(a!=b));
        System.out.println("First number is Greater than second number- "+(a>b));
        System.out.println("First number is Less than second number- "+(a<b));
        System.out.println("First number is Greater than or equal to second number- "+(a>=b));
        System.out.println("First number is Less than or equal to second number- "+(a<=b)); 
        System.out.println("First number is Equal to second number- "+(a==b));
 
        
        System.out.println("You did a great job!!! keep it up and  find more operators!!! Enjoy!!");


    }

}
