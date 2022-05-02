
package inheritance;

import Multilevel.Engineer;
import Single.Manager;
import Hierarchical.*;
import Multiple.AllLivings;
import Hybrid.*;

public class Main {

    public static void main(String[] args) {
        
     System.out.println("         ***MY INHERITANCE***");
      System.out.println("------------------------------------");
     System.out.println("1. Welcome to Bebie's SINGLE Inheritance");
     System.out.println("=================================================");
        Manager m = new Manager(); //Create an Object of the new Manager..
        m.Salary(); //call the method of the Employee(SuperClass)..
        m.Cash(); //Call the method of the Manager(SubClass)
        
     System.out.println("=================================================");
     System.out.println("You're single not because you are not good enough for one, it's that you're too good for the wrong one.  -Chris Burkmenn");
     
    
     System.out.println("__________________________________________________________________________________________________________");
     System.out.println("__________________________________________________________________________________________________________");
     
     System.out.println("2. Welcome to Bebie's MULTILEVEL Inheritance");
     System.out.println("=================================================");
     
        Engineer e = new Engineer(); //Create an Object of the new Engineer..
        //We can call the three methods because: Engineer inhrits the doctor, and the Doctor inherites the Employee..
        e.Salary();  //call the method of the Employees (SuperClass)..
        e.SalaryE(); //call the method of the Engineer(SubClass)
        e.SalaryD(); //Call the method of the Doctor(SubClass/ Act as a superclass)as it inherited by the employee..
     System.out.println("=================================================");
        
     System.out.println("__________________________________________________________________________________________________________");
     System.out.println("__________________________________________________________________________________________________________");
     
     System.out.println("3. Welcome to Bebie's HIERARCHICAL Inheritance");
     System.out.println("=================================================");    
     //Create an object of the new subclass, as the parent class is already inherited..
        
        Auditor Ad = new Auditor();
        Architect Ar = new Architect();
        Accountant Ac = new Accountant();
        
        Ad.Salary();
        Ad.SalaryAD();
     System.out.println("--------------------------------------------"); 
        Ar.Salary();
        Ar.SalaryAR();
     System.out.println("--------------------------------------------"); 
        Ac.Salary();
        Ac.SalaryA();
     System.out.println("--------------------------------------------"); 
     
     System.out.println("__________________________________________________________________________________________________________");
     System.out.println("__________________________________________________________________________________________________________");
     System.out.println("4. Welcome to Bebie's MULTIPLE Inheritance");
     // create object of Language class
     System.out.println("-----------------------------"); 
        AllLivings all = new AllLivings();
        
        all.PrettyEmployee();
    // call the inherited method of Frontend class
        all.UglyAnimal(all.livings);
     System.out.println("__________________________________________________________________________________________________________");
     System.out.println("__________________________________________________________________________________________________________");
     System.out.println("5. Welcome to Bebie's HYBRID Inheritance"); 
     //Combination of hierarchical and single inheritance..
        Engineer G = new Engineer();
        Doctor D = new Doctor();    
       
        G.Salary();
        D.Salary1();
        D.Salary3();
         
     System.out.println("Thank you!! Come Again!");
    }
    
}