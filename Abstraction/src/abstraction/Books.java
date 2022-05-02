/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraction;

/**
 *
 * @author 1styrGroupB
 */
abstract class Books{
    String Publisher;
    int Price;
    
    abstract void author();
    abstract void BookName();
    abstract void yearPublished();
    
    public void setPublisher(String pubHouse){
        Publisher = pubHouse;
    }
    public String getPublisher(){
        return Publisher;
    }
    
    public void setPrice(int BookPrice){
        Price = BookPrice;
    }
    public int getPrice(){
        return Price;
    }
}