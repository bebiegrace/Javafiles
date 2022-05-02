
package pkginterface;
import static java.lang.System.out;
import clsInterface.*;

public class Interfacebebie {

    public static void main(String[] args) {
        
    Airplane ap = new Airplane();  
    Bird b = new Bird();
    Superman s = new Superman();
    
    Zaeplane z = new Zaeplane();
    Hlicopter h = new Hlicopter();
    
    System.out.println("----------------------------------");
    System.out.println("Airplane Implementing Flyer");
    System.out.println("==================================");
    ap.takeoff();
    ap.land();
    ap.fly();
    System.out.println("----------------------------------");
    System.out.println("Bird Implementing Flyer");
    System.out.println("==================================");
    b.takeoff();
    b.land();
    b.fly();
    System.out.println("----------------------------------");
    System.out.println("Superman Implementing Flyer");
    System.out.println("==================================");
    s.takeoff();
    s.land();
    s.fly(); 
    System.out.println("___________________________________");
    System.out.println("Zaeplane is inheriting from Airplane...");
    System.out.println("==================================");  
    z.takeoff();
    z.land();
    z.fly();
    System.out.println("----------------------------------");
    z.Zaefly();
    System.out.println("___________________________________");
    System.out.println("Hlicopter is inheriting from Airplane...");
    System.out.println("==================================");  
    h.takeoff();
    h.land();
    h.fly();
    System.out.println("----------------------------------");
    h.cop();
    
    }   
}

// implements means you are using the elements of a Java Interface in your class. 
//extends means that you are creating a subclass of the base class you are extending. 

//Comparison Features	Extends	Implements
//Associated with	
//It is associated with Inheritance	
//It is associated with Abstraction
// when to use 