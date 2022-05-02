
package sal;

import Value.PassValuea;
public class Valuebe {
    public double sum(PassValuea val)
    {
        System.out.println(getStatus(1));
        double a = val.num1;
        double b = val.num2;
        return a+b;
    }
      public String getStatus(int x)
    {
        if(x==0)
        {
            return "Your friend is not instantiated";
        }
        else
        {
            return "Your friend is instanciated.";
        }
    
    }
}
