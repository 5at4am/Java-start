/*
 * File: Getset.java
 * Description: This program demonstrates getter and setter methods for encapsulation in Java.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Create getter and setter methods for class properties
 * - Understand the concept of encapsulation in OOP
 * - Control access to class fields through methods
 * - Use access modifiers appropriately (public, private, etc.)
 * 
 * Key concepts:
 * - Getter methods: Return the value of private fields (getcolor())
 * - Setter methods: Set the value of private fields (settip())
 * - Encapsulation: Controlling access to class data
 * - this keyword: Refers to the current object instance
 * 
 * Note: The example has mixed access levels - color is public but accessed via getter,
 * while tip is public but has a setter method. In proper encapsulation, fields should be private.
 */
package encaptulation;
public class getset {

    public static void main(String[] args) {

        pen p1 = new pen();
        p1.color = "Red";
        p1.tip = 10;

        System.out.println(p1.getcolor());
        System.out.println(p1.tip);

    }

}

class pen {
    public String color;

    String getcolor() {
        return this.color;
    }

    public int tip;

    void settip(int tip) {
        this.tip = tip;

    }

}
// Getter and setter methods: Controlling access to object properties!
// Fun fact: Proper encapsulation typically uses private fields with public getters/setters!