/*
 * File: Swap.java
 * Description: This program swaps two numbers using bitwise XOR operations.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Swap two variables without using a temporary variable
 * - Use XOR properties: a^a = 0, a^0 = a, a^b = b^a
 * - Understand the mathematical properties of XOR in swapping
 * - Take user input for the numbers to be swapped
 * - Properly close Scanner resources
 * 
 * XOR swapping logic:
 * - a = a ^ b (store XOR result in a)
 * - b = a ^ b (which is (a^b) ^ b = a, so b gets original a's value)
 * - a = a ^ b (which is (a^b) ^ a = b, so a gets original b's value)
 * 
 * Properties used: XOR is commutative and a^a=0, a^0=a
 */
package Questions;

import java.util.*;

public class swap {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping the first number is : " + a);
        System.out.println("After swapping the second number is : " + b);

        sc.close();
    }
}
// XOR swap: Swapping without a temporary variable!
// Fun fact: This uses XOR's mathematical properties to perform swapping!
