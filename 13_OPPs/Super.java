/*
 * File: Super.java
 * Description: This program demonstrates the use of the super keyword in Java inheritance.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Use the super keyword to access parent class members
 * - Call parent class constructor from child class
 * - Access parent class variables from child class
 * - Understand constructor chaining in inheritance
 * 
 * Key concepts:
 * - super keyword: Refers to the parent class instance
 * - super.variable: Access parent class variable
 * - super(): Call parent class constructor (must be first statement in constructor)
 * - Constructor chaining: Parent constructor called before child constructor
 * - Inheritance: Child class inherits parent properties and methods
 */
public class Super {
    public static void main(String[] args) {

        horse h = new horse();
        System.out.println(h.color);


    }    
}

class animal{
    String color;
    animal() {
        System.out.println("Animal constructor called..");
    }
}

class horse extends animal{
    horse() {
        super.color ="brown";
    //    super();
        System.out.println("Horse constructor called..");
    }
}
// The super keyword: Accessing parent class members in inheritance!
// Fun fact: super() must be the first statement in a constructor if used!
