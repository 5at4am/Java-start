/*
 * File: NNatural.java
 * Description: This program calculates the sum of first n natural numbers using recursion.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Calculate sum of natural numbers recursively
 * - Use proper variable naming to avoid conflicts
 * - Implement mathematical formula: sum(n) = n + sum(n-1)
 * - Understand the base case for recursion
 * 
 * Algorithm:
 * - Base case: sum of 0 natural numbers is 0
 * - Recursive case: sum(n) = n + sum(n-1)
 * - Example: sum(3) = 3 + 2 + 1 + 0 = 6
 * 
 * Note: Fixed naming conflict where 'sum' was used as both function name and variable.
 */
public class n_natural {
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        int subResult = sum(n - 1);  // Fixed: renamed variable to avoid conflict
        int total = n + subResult;
        return total;

    }

    public static void main(String args[]) {
        int n = 1;
        System.out.println(sum(n));

    }
}
// Sum of natural numbers: 1 + 2 + 3 + ... + n recursively!
// Fun fact: This implements the formula n*(n+1)/2 using recursion!