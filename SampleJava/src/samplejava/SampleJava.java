/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplejava;

/**
 *
 * @author 1styrGroupB
 */
public class SampleJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student p1= new Student();
        p1.name= "Leah";
        p1.age=19;
        p1.school();
        
        Student p2= new Student();
        p2.name="John";
        p2.age=21;
        p2.school();
    }
    
}
