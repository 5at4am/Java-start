/*
 * File: Addint.java
 * Description: This program demonstrates adding 1 to a number using bitwise operations.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Add 1 to a number using bitwise NOT and unary minus operators
 * - Understand the relationship: -~x = x + 1
 * - Explore alternative arithmetic operations using bitwise manipulation
 * - Properly close Scanner resources
 * 
 * Bitwise logic:
 * - ~x performs bitwise NOT (flips all bits)
 * - -~x negates the result of NOT operation
 * - This effectively adds 1 to the original number (x + 1)
 * - For x = 7: -~7 = 8 (which is 7 + 1)
 */
package Questions;

import java.util.*;
public class addint 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x = 7;
        System.out.println(x+" + "+1+" = " + -~x);
        sc.close();
    }
}
// Adding 1 with bitwise operations: When -~x equals x+1!
// Fun fact: -~x is an alternative way to add 1 using bitwise operations!