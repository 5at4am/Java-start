/*
 * File: Power.java
 * Description: This program calculates the power of a number using recursion.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Implement exponentiation using recursion
 * - Define base case (any number to power 0 equals 1)
 * - Make recursive calls with decremented exponent
 * - Understand how exponentiation can be expressed recursively
 * 
 * Mathematical definition implemented:
 * - base^0 = 1 (base case)
 * - base^n = base * base^(n-1) (recursive case)
 * - For base=9, exponent=2: 9^2 = 9 * 9^1 = 9 * 9 * 9^0 = 9 * 9 * 1 = 81
 */
public class power {
    public static int pow(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        int ans = base* pow(base, exponent-1);

        return ans;
    }

    public static void main(String[] args) {
        int base = 9;
        int exponent = 2;
        System.out.println(pow(base, exponent));
    }
    
}
// Recursive exponentiation: Breaking down powers into multiplications!
// Fun fact: This follows the mathematical rule: a^n = a * a^(n-1)!
