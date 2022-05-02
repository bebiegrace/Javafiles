
package sal;


public class Salary {

    public static boolean value;
    
    public String salaryType;
    
    public float getSalary(){
       if (salaryType == "withAbsences")
       {
        return 10400 - 3000;  
       }
       else if (salaryType == "withOvertime")
       {
           return 10400 + 300;
       }
       else
       {
           return 10400;
       }
    }
    public static int getIntValue()
    {
        return 14344;
    }
}
    

