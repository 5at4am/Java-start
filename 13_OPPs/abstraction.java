/*
 * File: Abstraction.java
 * Description: This program demonstrates abstraction using abstract classes and methods in Java.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Create abstract classes and methods
 * - Implement abstract methods in subclasses
 * - Use inheritance with abstract classes
 * - Understand the concept of abstraction in OOP
 * - Show constructor calling in inheritance hierarchy
 * 
 * Key concepts:
 * - Abstract class: Cannot be instantiated, can have both abstract and concrete methods
 * - Abstract method: Must be implemented by subclasses
 * - The 'animal' class defines common behaviors but forces subclasses to implement 'walk'
 * - Constructor calling: Parent constructor is called before child constructor
 */
public class abstraction {
    public static void main(String[] args) {
        horse h = new horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        mustank ho = new mustank();
        //animal->horse->mustank
        ho.eat();


        chicken c = new chicken();
        c.eat();
        c.walk();
        System.out.println(c.color);
    }
}

abstract class animal {
    String color;

    animal() {
    System.out.println("animal constructor called");
        color = "Brown";
    }

    void eat() {
        System.out.println("animal eat");
    }

    abstract void walk();

}

class horse extends animal {
    horse() {
        System.out.println("horse constructor called");
    }
    void colorchange() {
        color = "white";
    }

    void walk() {
        System.out.println("walk on 4 leg");
    }
}

class mustank extends horse {
    mustank() {
        System.out.println("mustank constructor called");
    }
}

class chicken extends animal {
    void colorchange() {
        color = "white";
    }

    void walk() {
        System.out.println("walk on 2 leg");
    }
}
// Abstraction: Hiding complex implementation behind simple interfaces!
// Fun fact: Abstract classes provide partial abstraction in Java!
