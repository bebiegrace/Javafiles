
package clsInterface;


public class Bird implements Flyer {
  
   @Override
   public void takeoff(){
        System.out.println("Bird is taking off..");
   }
   @Override
    public void land(){
         System.out.println("Bird is landing..");
    }
   @Override
    public void fly(){
         System.out.println("Bird is flying..");
    }
}
