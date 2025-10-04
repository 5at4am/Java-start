/*
 * File: Polymorphism.java
 * Description: This program demonstrates both method overloading and method overriding in Java.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Implement method overloading (compile-time polymorphism)
 * - Implement method overriding (runtime polymorphism)
 * - Understand the concept of polymorphism in OOP
 * - Show how the same method name can have different implementations
 * 
 * Key concepts:
 * Method Overloading (Compile-time polymorphism):
 * - Same method name with different parameters
 * - Resolved at compile time based on method signature
 * - Different return types are acceptable if parameters differ
 * 
 * Method Overriding (Runtime polymorphism):
 * - Same method signature in parent and child class
 * - Resolved at runtime based on object type
 * - Child class provides specific implementation
 */
public class polymorphism {
    public static void main(String[] args) {

        // Method overloading
        calculator calc = new calculator();
        System.out.println(calc.sum(10, 20));
        System.out.println(calc.sum(10.5f, 20.5f));
        System.out.println(calc.sum(10, 20, 30));

        // Method Overriding
        deer d = new deer();
        d.eat();
        
    }
}

// Method Overloading
class calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

// Method Overriding
class animal{
    void eat(){
        System.out.println("eat anything");
    }
}

class deer extends animal{
    void eat(){
        System.out.println("eat grass");
    }
}
// Polymorphism: One interface, multiple implementations!
// Fun fact: Method overloading occurs at compile time, overriding at runtime!