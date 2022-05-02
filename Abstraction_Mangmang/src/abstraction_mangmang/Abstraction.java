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
abstract class Abstraction {
//        String school;
//        String location;
//        int year;
//    
//        abstract void school();
//        abstract void location();
//        abstract void year();
    String motto;
    String president;
    
    abstract void school();
    abstract void location();
    abstract void year();
    
    public void setMotto(String Motto){
        motto = Motto;
    }
    public String getMotto(){
        return motto;
    }
    
    public void setPresident(String President){
        president = President;
    }
    public String getPresident(){
        return president;
        
    }
    }
    

