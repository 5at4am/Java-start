/*
 * File: Inter.java
 * Description: This program demonstrates interface implementation and method overriding in Java.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Create interfaces with abstract methods
 * - Implement interfaces in classes
 * - Override interface methods in implementing classes
 * - Understand the concept of polymorphism with interfaces
 * - Show the "Contract" nature of interfaces
 * 
 * Key concepts:
 * - Interface: Defines a contract (what methods must be implemented)
 * - Implements: Keyword to implement an interface
 * - All interface methods are implicitly abstract and public
 * - Implementing classes must provide concrete implementations
 * - Method overriding: Providing specific implementation in subclass
 */
public class inter {
    public static void main(String[] args) {
        
        // Method Overriding
        queen q = new queen();
        q.moves();
        q.kill();
        
        rook r = new rook();
        r.moves();
        r.kill();
        
        king k = new king();
        k.moves();
        k.kill();
    }
}

interface chessplayer {
    void moves();
    void kill();
}

class queen implements chessplayer {
    public void moves() {
        System.out.println("queen moves in all direction");
    }
    public void kill() {
        System.out.println("queen can kill in all direction");
    }
}

class rook implements chessplayer {
    public void moves() {
        System.out.println("rook moves in straight direction");
    }
    public void kill() {
        System.out.println("rook can kill in straight direction");
    }
}

class king implements chessplayer {
    public void moves() {
        System.out.println("king moves in all direction but only one step");
    }
    public void kill() {
        System.out.println("king can kill in all direction but only one step");
    }
}
// Interfaces: Defining contracts that classes must follow!
// Fun fact: A class can implement multiple interfaces but extend only one class!