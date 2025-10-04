/*
 * File: Unary.java
 * Description: This program demonstrates unary operators in Java (++, --) and their pre/post increment/decrement behavior.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Use unary increment/decrement operators
 * - Understand the difference between pre and post increment/decrement
 * - See how operator placement affects the value assignment
 * 
 * Key concepts demonstrated:
 * Post-increment (a++): Returns current value, then increments
 * Pre-increment (++a): Increments first, then returns value
 * Post-decrement (a--): Returns current value, then decrements
 * Pre-decrement (--a): Decrements first, then returns value
 */
//package operators;
public class unary {
    public static void main(String[] args) {
        int a = 10;
        int b = a++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int c = 10;
        int d = ++c;
        System.out.println("c = " + c);
        System.out.println("d = "+d);
        int e = 10;
        int f = --e;
        System.out.println("e = " + e);
        System.out.println("f = "+f);
        int g = 10;
        int h = g--;
        System.out.println("g = "+g);
        System.out.println("h = "+h);

    }
}
// Understanding pre vs post increment is crucial for avoiding bugs!
// Fun fact: The difference between pre and post operators can be tricky - pay attention to order of operations!
