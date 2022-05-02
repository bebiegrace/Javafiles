
package valuepassingbebie;
import Value.*;
import BebieCalc1.Input;
import BebieCalc1.Output;

public class ValuePassingBebie {

    public static void main(String[] args) {
        System.out.println("Enter a number");
            Input i = new Input();
            Output o = new Output();
            PassValueb v = new PassValueb();
            PassValuea p = new PassValuea();
       
       
            double bebie = i.getNum();
            double grace = i.getNum();
       
            p.num1 = bebie;
            p.num2 = grace;
       
            double result = v.difference(p);
            o.show(result);    
    }
}
