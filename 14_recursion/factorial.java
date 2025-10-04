/*
 * File: Factorial.java
 * Description: This program calculates the factorial of a number using recursion.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Implement a recursive function to calculate factorial
 * - Define base case (n == 0, return 1) to stop recursion
 * - Make recursive calls with modified parameters (n-1)
 * - Understand the recursive approach to problem solving
 * 
 * Recursion breakdown:
 * - Base case: if n == 0, return 1 (0! = 1)
 * - Recursive case: n! = n * (n-1)!
 * - For n=4: 4! = 4 * 3! = 4 * 3 * 2 * 1 * 1 = 24
 */
public class factorial {
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }

        //int fnm1 = fact(n - 1);
        int fn = n * fact(n-1);
        return fn;

    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(fact(n));

    }
}
// Recursive factorial: A function calling itself to solve smaller subproblems!
// Fun fact: Recursion elegantly expresses mathematical definitions like n! = n*(n-1)!
