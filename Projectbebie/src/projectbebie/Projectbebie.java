
package projectbebie;


public class Projectbebie {
    
    public static void main(String[] args)
      
        {
        Projectbebie pb = new Projectbebie();
        try{
            int result = pb.divideThis(1,0);
            System.out.println(result);
        }
        catch(Exception g)
        {
            System.out.println(g.getMessage());
        }
        
        }
    int divideThis(int a, int b)   
        {
        int result = 0;
        try{
            result = a/b;
           }
        catch(NumberFormatException e)
        {
             System.out.println("NumberFormatException");
        }
            
        catch (IllegalArgumentException e)
        {
            System.out.println("IllegalArgumentException");
        }
        catch(NullPointerException e){
            System.out.println("NullPointerException");
        }
//        catch(Exception e)
//        {
//            System.out.println(e.getCause());
//            System.out.println(e.getMessage());
//        }
              return 0;
     
        }
            
        
         int doThis()
         {
             for(int x=0; x<10; x++)
             {
               System.out.println(x);
               try
               {
                   Thread.sleep(500);
               }
               catch(Exception e)
               {}
             }
         
            return 0;
         }
}



//        try
//        {
//            result = a/b; ////happens only during run time
//            // check exception are problems that are alreadredy anticipated and need to be fix during programing...
//        }
//   
//        catch(NumberFormatException e){}
//            
//       
//        catch (IllegalArgumentException e)
//        {
//            System.out.println("IllegalArgumentException");
//        }
//        catch(NullPointerException e){
//            System.out.println("NullPointerException");
//        }
//        catch(Exception e){
//            System.out.println("NullPointerException");
//        }
//       
//        return result;
//    }
//}
//   public static void main(String[] args) {
//        Projectbebie pb = new Projectbebie();
//        int result = pb.divideThis(1,0);
//        System.out.println(result);
//    }
//    
//  private int numerator;
//  private int denominator;
//
//    Projectbebie() {
//        numerator = 1;
//        denominator = 0;
//
//    }
//
//    Projectbebie (int a, int b) {
//        numerator =a;
//        denominator = b;
//        if (denominator == 0){
//            throw new IllegalArgumentException (
//            "Denominator cannot be zero");
//        }
//    }
//
//    public void setNum(int a){
//        numerator = a;
//    }
//
//    public void setDen(int b){
//        denominator = b;
//
//        }
//
//    public int getNum(){
//        return numerator;
//    }
//
//    public int getDen(){
//        return denominator;
//    }
//
//    public String toString() {
//        return numerator + "/" + denominator;
//        }
//
//    public boolean equals( Projectbebie other){
//    if (numerator * other.getDen() == denominator * other.getNum()){
//            return true;
//         } 
//        else {
//            return false;
//        }
//    
//    
//    }
//    int divideThis(int a, int b)   
//    {
//        int result = 0;
//        
//        try
//        {
//            result = a/b;
//            
//        }
//       
//        catch (IllegalArgumentException e)
//        {
//            System.out.println("IllegalArgumentException");
//        }
//        catch(NullPointerException e){
//            System.out.println("NullPointerException");
//        }
//        catch(Exception e){
//            System.out.println("NullPointerException");
//        }
//       
//        return result;
//    }
//}
    
  
    
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//* The finally clause defineds a block of code that always executes---Finally is optional
//try{
//startFaucer();
//waterLawn();
//}cath(BrokenPipeException e){
//logProblem(e);
//}finally{
//stopFaucert();
//{


//if the dominator is 0 catch it and after caching it solve it and  as for another number     then procee dto the execution...

//happens and expectedly witout you ecepted it, it not really an erroe but it
//handle it like putting it in a try catch block and declare it by throwing the exception to the main method



//program could show a file and show everything ion that.






