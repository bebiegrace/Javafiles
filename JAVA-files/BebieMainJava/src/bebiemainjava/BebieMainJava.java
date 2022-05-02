package bebiemainjava;
import BebieCalc1.*;
import BebieOps1.*;

public class BebieMainJava {

    public static void main(String[] args) {
        ClassCalc b = new ClassCalc();
        Input i = new Input();
        Output o = new Output();
        ClassOps p = new ClassOps();

         System.out.println("Enter first integer: ");
         double d = i.getNum();
         System.out.println("Enter second integer: ");
         double r = i.getNum();
         double result = b.add(d,r);
         System.out.println(result);

         System.out.println("Enter an integer to decrement: ");
         double n = i.getNum();
         double result1 = p.decrement(n);
         System.out.println(result1);

         System.out.println("Enter an integer to increment: ");
         double j= i.getNum();
         double result2 = p.increment(j);
         System.out.println(result1);
    }

}

