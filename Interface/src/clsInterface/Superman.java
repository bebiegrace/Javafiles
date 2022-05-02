
package clsInterface;


public class Superman implements Flyer {
     @Override
   public void takeoff(){
        System.out.println("Superman is taking off..");
   }
   @Override
    public void land(){
         System.out.println("Superman is landing..");
    }
   @Override
    public void fly(){
         System.out.println("Superman is flying..");
    }
}