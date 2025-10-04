/*
 * File: Q1.java
 * Description: This program determines if a user-entered number is positive or negative.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Take integer input from the user using Scanner
 * - Implement basic if-else conditional logic
 * - Check if a number is negative using comparison operators
 * - Display appropriate message based on the condition
 * - Properly close Scanner resources
 * 
 * Logic implemented:
 * - If number < 0: number is negative
 * - Otherwise: number is positive
 */
package questions;

import java.util.*;

public class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number : ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("number is negative");
        } else {
            System.out.println("number is positive");
        }

        sc.close();

    }
}
// Positive thinking starts with positive numbers! (Just kidding, both are useful!)
// Fun fact: Zero is neither positive nor negative in mathematics!