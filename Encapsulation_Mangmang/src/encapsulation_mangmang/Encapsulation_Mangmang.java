/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation_mangmang;

/**
 *
 * @author 1styrGroupB
 */
public class Encapsulation_Mangmang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Students s1 = new Students();
       
       s1.setIDnum(21103799);
       s1.setFirstname("Leah");
       s1.setLastname("Mangmang");
       s1.setAge(20);
       s1.setAddress("San Agustin, Sagbayan, Bohol");
       
       Students s2 = new Students();
       
       s2.setIDnum(21103822);
       s2.setFirstname("Christine");
       s2.setLastname("Martonia");
       s2.setAge(20);
       s2.setAddress("Barangay Pula, Canlaon City, Negros Oriental");
       
       
       Students s3 = new Students();
       
       s3.setIDnum(21103857);
       s3.setFirstname("Thrieza May");
       s3.setLastname("Lebosada");
       s3.setAge(20);
       s3.setAddress("Barangay Sorsogon, Malabuyok, Cebu City");
       
       
       Students s4 = new Students();
       
       s4.setIDnum(21103807);
       s4.setFirstname("Jamaila");
       s4.setLastname("Paquiabas");
       s4.setAge(19);
       s4.setAddress("Poblacion, Sagbayan, Bohol");
       
       Students s5 = new Students();
       
       s5.setIDnum(21103874);
       s5.setFirstname("Jesamae");
       s5.setLastname("Salado");
       s5.setAge(20);
       s5.setAddress("Malabuyok, Cebu, City");
       
      System.out.println("***STUDENTS INFORMATION***");
      System.out.println("Student 1:");
      System.out.println("     ID number: "+ s1.getIDnum());
      System.out.println("     Lastname: " + s1.getLastname());
      System.out.println("     Firstname: " + s1.getFirstname());
      System.out.println("     Age: " + s1.getAge());
      System.out.println("     Address: " + s1.getAddress());
      
      System.out.println("Student 2:");
      System.out.println("     ID number: "+ s2.getIDnum());
      System.out.println("     Lastname: " + s2.getLastname());
      System.out.println("     Firstname: " + s2.getFirstname());
      System.out.println("     Age: " + s2.getAge());
      System.out.println("     Address: " + s2.getAddress());
      
      System.out.println("Student 3:");
      System.out.println("     ID number: "+ s3.getIDnum());
      System.out.println("     Lastname: " + s3.getLastname());
      System.out.println("     Firstname: " + s3.getFirstname());
      System.out.println("     Age: " + s3.getAge());
      System.out.println("     Address: " + s3.getAddress());
      
      
      System.out.println("Student 4:");
      System.out.println("     ID number: "+ s4.getIDnum());
      System.out.println("     Lastname: " + s4.getLastname());
      System.out.println("     Firstname: " + s4.getFirstname());
      System.out.println("     Age: " + s4.getAge());
      System.out.println("     Address: " + s4.getAddress());
      
      System.out.println("Student 5:");
      System.out.println("     ID number: "+ s5.getIDnum());
      System.out.println("     Lastname: " + s5.getLastname());
      System.out.println("     Firstname: " + s5.getFirstname());
      System.out.println("     Age: " + s5.getAge());
      System.out.println("     Address: " + s5.getAddress());
    }
    
}
