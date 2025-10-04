/*
 * File: Inter1.java
 * Description: This program demonstrates multiple interface implementation in Java.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Implement multiple interfaces in a single class
 * - Show that a class can have behaviors from multiple sources
 * - Understand the flexibility of interface implementation
 * - Demonstrate real-world example of multiple behaviors
 * 
 * Key concepts:
 * - A class can implement multiple interfaces (unlike inheritance which is limited to one parent)
 * - Multiple inheritance of type (interface) vs. single inheritance of implementation (class)
 * - The implementing class must provide implementations for all methods from all interfaces
 * - This allows for more flexible design and composition
 */
public class inter1 {
    public static void main(String[] args) {
        bear b = new bear();
        b.eatplant();
        b.eatmeat();
        
    }
}

interface herbibore{
    void eatplant();
}
interface carnivore{
    void eatmeat();
}

class bear implements herbibore,carnivore{
    public void eatplant(){
        System.out.println("bear eat plants");
    }
    public void eatmeat(){
        System.out.println("bear eat meat");
    }
}
// Multiple interface implementation: When one behavior isn't enough!
// Fun fact: This shows how bears are omnivores - eating both plants and meat!
