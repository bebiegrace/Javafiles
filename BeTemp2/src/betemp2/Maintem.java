
package betemp2;
import sal.*;
public class Maintem {

  
    public static void main(String[] args) {
       
     
        System.out.println("===================================");
       
        System.out.println(Salary.getIntValue());
        System.out.println(Salary.value);
        
        Salary s = new Salary();
        s.value = 654321;
        System.out.println(s.value);
        
        System.out.println(Salary.value);
        Salary s2 = new Salary();
        System.out.println(s2.value);
        s2.value = 1000;
        System.out.println(s.value);
        Valuebe vb = new Valuebe();
        System.out.println(vb.getStatus(1));
        System.out.println(getStatus(1));
        
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
