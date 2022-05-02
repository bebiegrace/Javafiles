
package pkgabstract;

import Babstract.*;


public class Abstract {

   
    public static void main(String[] args) {
       Utility u = new UtilitySon(); //POLYMORPHISM
       double result = u.subtract(1,2);
       double result2 = u.add(1,2);
       System.out.println(result);
    }
    
}
