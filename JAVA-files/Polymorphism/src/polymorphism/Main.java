
package polymorphism;
import AnimalsConstructor.*;
import Familybebie.*;

public class Main {
    public static void main(String[] args) {
        
       System.out.println("CONSTRUCTORS");
       System.out.println("_______________________");

        Chicken c = new Chicken();  
        Chicken c1 = new Chicken("Manok na pula"); 
        c.sound();
        c.walk();
        
      System.out.println("======================================================");
        
      System.out.println("Bebie Grace Balbuena(Family Age and DanceStyle)");
             System.out.println("------------------------------------");
             System.out.println("Family Age!");
                          
             Lolo l = new Lolo();
             Papa p = new Papa();
             Dhodhong d = new Dhodhong();
             
             printAge(l);
             printAge(p);
             printAge(d);
             
             System.out.println("------------------------------------");
             System.out.println("Family DanceStyle!");
             
            
             printDanceStyle(l);
             printDanceStyle(p);
             printDanceStyle(d);
             System.out.println("Thank you for visiting us! Have a nice day!!");     
  
             
    }
    
    public static void printDanceStyle(Lolo l)  
    {
        System.out.println(l.getDanceStyle());
    }
    
    public static void printAge(Lolo l)  
            
    {
              
    if(l instanceof Dhodhong){
        System.out.println("<20 Years");
        }
    else if(l instanceof Papa) {    
        System.out.println(">20 Years and <35");  
    }
    else if(l instanceof Lolo) {    
        System.out.println(">60 Years");
        
        } 
    }
}

