/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraction_mangmang;

/**
 *
 * @author 1styrGroupB
 */
public class Abstraction_Mangmang {
    public static void main(String args[]){
        

        Abstraction school = new USC();
        Abstraction Location = new UC();
        Abstraction year = new CNU();
       
        school.school();
        school.setMotto("           Scientia, Virtus, Devotio");
        System.out.println("School Motto: ");
        System.out.println(school.getMotto());
        school.location();
        
        school.setPresident("           Dionisio M. Miranda");
        System.out.println("School President: ");
        
        System.out.println(school.getPresident());
        school.year();
        
        
        Location.school();
        Location.setMotto("            Education towards global competitiveness");
        System.out.println("School Motto: ");
        System.out.println(Location.getMotto());
        Location.location();
        
        Location.setPresident("           Atty. Augusto W. Go");
         System.out.println("School President: ");
         
        System.out.println(Location.getPresident());
        Location.year();
        

        year.school();
        year.setMotto("            Quality with Integrity");
        System.out.println("School Motto: ");
        System.out.println(year.getMotto());
        year.location();
        
        year.setPresident("           Joselito B. Gutierrez");
         System.out.println("School President: ");
         
        System.out.println(year.getPresident());
        year.year();
    }
}
