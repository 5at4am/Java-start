/*
 * File: Q4.java
 * Description: This program performs a calculation with different data types and prints the result.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Declare and initialize variables of different primitive data types
 * - Perform mixed-type arithmetic operations
 * - Use type promotion in expressions
 * - Understand character-to-integer conversion (char 'a' becomes its ASCII value)
 * - Work with the modulo operator
 * - Use special identifier names like ' (though not recommended in practice)
 * 
 * Data types used: byte, char, short, int, float, double
 * Operations: multiplication, modulo, subtraction, and addition
 * 
 * Note: The char 'a' is converted to its ASCII value (97) during calculation.
 */
public class Q4 {
    public static void main(String args[]) {
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 1.34f;
        double d = 99.9954;
        double result = (f * b) + (i % c) - (d * s);
        System.out.println("output in double is : " + result);

        // question 5 down here
        int $ = 24;
        System.out.println($);
    }
}
// Who knew you could name a variable $? Java is full of surprises.
// Pro tip: While $ is a valid identifier in Java, it's generally not recommended for variable names!