
package bebiesum;


public class BebieProject {

   
    public static void main(String[] args) {
       int num=0;
       int sum = 0;
       for (int x = 0; x< 3; x++)
       {
           num = Integer.parseInt(args[x]);
           sum+=num;
       }
       System.out.println("The sum is: "+sum);
    }
    
}
