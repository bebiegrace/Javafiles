/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation_sample;

/**
 *
 * @author 1styrGroupB
 */
public class Encapsulation_sample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       Person p1 = new Person();
       
       p1.setName("Leah");
       p1.setAge(20);
       
       
      Person p2=new Person();
      
      p2.setName("Mangmang");
      p2.setAge(19);
       
      System.out.println("My name is "+ p1.getName() +".I am "+ p1.getAge()+ " years old.");
      System.out.println("My name is "+ p2.getName() +".I am "+ p2.getAge()+ " years old.");
    }
    
}
