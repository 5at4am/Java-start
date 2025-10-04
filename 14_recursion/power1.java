/*
 * File: Power1.java
 * Description: This program calculates power using optimized recursion (exponentiation by squaring).
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Implement optimized power calculation using recursion
 * - Use exponentiation by squaring technique
 * - Reduce time complexity from O(n) to O(log n)
 * - Handle both even and odd exponents differently
 * 
 * Algorithm (Exponentiation by squaring):
 * - For even exponent: base^n = (base^(n/2))^2
 * - For odd exponent: base^n = base * (base^(n/2))^2
 * - Base case: Any number to power 0 is 1
 * 
 * Time complexity: O(log n), Space complexity: O(log n) for recursion stack
 */
public class power1 {
    public static int pow(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        int halfPow = pow(base, exponent / 2);
        int half = halfPow * halfPow;

        if (exponent % 2 != 0) {
            return half * base;
        }
        return half;

    }

    public static void main(String[] args) {
        int base = 2;
        int exponent = 10;
        System.out.println("2^10 = " + pow(base, exponent));

    }

}
// Optimized power calculation: Exponentiation by squaring!
// Fun fact: This reduces complexity from O(n) to O(log n) multiplications!
