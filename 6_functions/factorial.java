/*
 * File: Factorial.java
 * Description: This program calculates the factorial of a number using a function with a loop.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Create a function that calculates factorial using iteration
 * - Use a loop inside a function to perform calculations
 * - Take user input for the number to calculate factorial
 * - Return the calculated factorial value
 * - Display the result to the user
 * - Properly close Scanner resources
 * 
 * Factorial definition: n! = n × (n-1) × (n-2) × ... × 2 × 1
 * Special case: 0! = 1
 */
import java.util.*;

public class factorial {
    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        fact(n);
        System.out.println("your factorial of " + n + " is : " + fact(n));
        sc.close();
    }
}
// Factorial calculations: Multiplying numbers from 1 to n!
// Fun fact: Factorials grow very quickly - 10! is already 3,628,800!