
package overmethod;
import Overriding.*;
import Overloading.*;
import static Overloading.Animals.Wings;

public class Main {

    
    public static void main(String[] args) {
     System.out.println("*****METHOD OVERRIDING*****");  
     System.out.println("================================");
     
       Animal a = new Animal();
       Dog dg = new Dog();
       Bird bd = new Bird();
       Cat ct = new Cat();
   
       a.Name();
     System.out.println("______________________"); 
       dg.Name();
       bd.Name();
       ct.Name();
       
     System.out.println("------------------------------------");
    
     System.out.println("*****METHOD OVERLOADING*****");  
     System.out.println("================================");
        
       Wings(6);
       Wings("Birds");
       
     System.out.println("------------------------------------"); 
     System.out.println("Thank you for visiting us, have a nice day!!");
     System.out.println("______________________");  
    }
}

   

   