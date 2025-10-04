/*
 * File: RecDec.java
 * Description: This program prints numbers from n to 1 using recursive approach.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Implement recursive counting down from n to 1
 * - Print numbers in decreasing order using recursion
 * - Understand how to control output before and after recursive call
 * - Implement base case for recursion termination
 * 
 * Algorithm:
 * - Print current number
 * - Recursively call with n-1
 * - Base case: when n reaches 1, print and return
 * 
 * Time complexity: O(n), Space complexity: O(n) for recursion stack
 */
public class rec_dec {

    public static void decrease(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        decrease(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        decrease(n);

    }

}
// Recursive countdown: From n to 1, one call at a time!
// Fun fact: This shows how recursion naturally handles countdown sequences!
