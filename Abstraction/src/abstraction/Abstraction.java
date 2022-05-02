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
public class Abstraction {
    public static void main(String[] args) {
        Books favAuthor = new Book1();
        Books favBook = new Book1();
        Books Publish = new Book1();
        
        
        System.out.println("Favourite Author (1): \n");
        favAuthor.author();
        
        favBook.BookName();
        Publish.yearPublished();
        favBook.setPublisher("Majesty Press");
        System.out.print("Publisher: ");
        
        System.out.println(favBook.getPublisher());
        favBook.setPrice(430);
        
        System.out.print("Price: ");
        System.out.println("₱"+favBook.getPrice());
        
        
        
        
        Books favAuthor2 = new Book2();
        Books favBook2 = new Book2();
        Books Publish2 = new Book2();
        
        System.out.println("\nFavourite Author(2): \n");
        favAuthor2.author();
        favBook2.BookName();
        Publish2.yearPublished();
        favBook.setPublisher("Anvil Publishing Incorporated");
        System.out.print("Publisher: ");
        System.out.println(favBook.getPublisher());
        favBook.setPrice(199);
        System.out.print("Price: ");
        System.out.println("₱"+favBook.getPrice());
        
    }
    
}