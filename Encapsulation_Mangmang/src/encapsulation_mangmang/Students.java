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
public class Students {
    int idNum;
    String firstname;
    String lastname;
    int age;
    String address;
    
    public void setIDnum(int newIDnum){
        idNum = newIDnum;
    }
    
    public int getIDnum(){
        return idNum;
    }
    
    public void setFirstname(String newFirstname){
        firstname = newFirstname;
    }
    public String getFirstname(){
        return firstname;
    }
    
    public void setLastname(String newLastname){
        lastname= newLastname;
    }
    String getLastname(){
         return lastname;
    }
    
    public void setAge(int newAge){
        age = newAge;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAddress(String newAddress){
        address= newAddress;
    }
    public String getAddress(){
         return address;
    }
}


