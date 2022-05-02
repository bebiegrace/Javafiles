
package Multiple;


// Language extends Frontend class
// Language implements Backend interface

    public class AllLivings extends Animals implements Employee {
    public String livings = "Earthlings";
         //implement method of inheritance
   
         @Override
    public void PrettyEmployee(){
      System.out.println(livings + " are very talented and hardworking"); 
    }
 }
