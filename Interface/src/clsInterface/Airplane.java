
package clsInterface;

public class Airplane implements Flyer {
 
   @Override
   public void takeoff(){
       System.out.println("Airplane taking off..");
   }
   @Override
    public void land(){
         System.out.println("Airplane landing..");
    }
   @Override
    public void fly(){
         System.out.println("Airplane flying..");
  }
}



