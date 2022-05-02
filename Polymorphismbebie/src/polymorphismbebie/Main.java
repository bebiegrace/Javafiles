

package polymorphismbebie;

import Employees.*;

public class Main {

  public static void main(String[] args) {

    MyEmployees me = new MyEmployees();  
    MyEmployees emp = new Employee();
    MyEmployees eng = new Engineer();    
    MyEmployees ma = new Manager(); 

    me.dosomething();
    emp.dosomething();
    eng.dosomething();
    ma.dosomething();
 
//just a check it out...

     System.out.println("Check out the procedure by looking if it's instanceof the following:");

     System.out.println("==============================================================================");

     System.out.println("Checking out the instanceof the procedure of MyEmployees:");

        if ( me instanceof Employee){
            System.out.println(" MyEmployee instanceof Employee");

            } else if (me instanceof Engineer){
            System.out.println(" MyEmployee instanceof Engineer");

            }
              else if (me instanceof Manager){
            System.out.println("MyEmployee instanceof Manager");

           }else{
            System.out.println("Not instanceof!!");

            }
     System.out.println("++++++++++++++++++++++++++++");

           System.out.println("Checking out the instanceof the procedure of Employee:");

            
        if ( emp instanceof Engineer){
            System.out.println("Employee instanceof Engineer");

            } else if (emp instanceof Manager){
            System.out.println("Employee instanceof Manager");

            }
              else if (emp instanceof MyEmployees){
            System.out.println("Employee instanceof MyEmployee");

           }else{
            System.out.println("Not instanceof!!");

            }

     System.out.println("++++++++++++++++++++++++++++");

           System.out.println("Checking out the instanceof the procedure of Engineer:");

            
        if ( eng instanceof Employee){
            System.out.println("Engineer instanceof Employee");

            } else if (eng instanceof Manager){
            System.out.println("Engineer instanceof Manager");

            }
              else if (eng instanceof MyEmployees){
            System.out.println("Engineer instanceof MyEmployees");

           }else{
            System.out.println("Not instanceof!!!");
        }

     System.out.println("++++++++++++++++++++++++++++");
           System.out.println("Checking out the instanceof the procedure of Manager:");

            
        if ( ma instanceof Employee){
            System.out.println("Manager instanceof Employee");

            } else if (ma instanceof Engineer){
            System.out.println("Manager instanceof Engineer");

            }
              else if (ma instanceof MyEmployees){
            System.out.println("Engineer instanceof MyEmployees");

           }else{
            System.out.println("Not instanceof!!!");
        }

    }

}









   

