/*
 * File: Constructor.java
 * Description: This program demonstrates constructor overloading in Java classes.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Create different types of constructors (parametrized and non-parametrized)
 * - Implement constructor overloading (multiple constructors with different parameters)
 * - Understand how constructors are called when objects are created
 * - Initialize object properties using constructors
 * 
 * Key concepts:
 * - Non-parametrized constructor: Creates object without parameters
 * - Parametrized constructor: Creates object with initial values
 * - Constructor overloading: Multiple constructors with different signatures
 * - this keyword: Refers to the current object instance
 * - Constructor chaining: How constructors can call other constructors
 */
package encaptulation;

public class constructor {

    public static void main(String[] args) {
        student s0 = new student();
        student s1 = new student("satyam", 106);
        System.out.println(s1.name);
        student s2 = new student("satyam");
        student s3 = new student(123);

        System.out.println(s0 + " " + s1 + " " + s2 + " " + s3);
    }

}

class student {
    String name;
    int rollno;

    // ↓ nothing is initialized in the student
    student() { // non parametrized constructor
        System.out.println("your constructor called : ");

    }

    // ↓ something is initialized in the student
    student(String name, int rollno) { // parametrized constructor
        this.name = name;
        System.out.println("Constructor called " + name);
        this.rollno = rollno;
        System.out.println("construct called " + rollno);
    }

    student(String name) { // parametrized constructor
        this.name = name;
    }

    student(int rollno) { // parametrized constructor
        this.rollno = rollno;
    }

}
// Constructor overloading: Different ways to create objects!
// Fun fact: Constructors have the same name as the class and no return type!