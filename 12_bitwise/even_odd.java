/*
 * File: EvenOdd.java
 * Description: This program determines if a number is even or odd using the bitwise AND operator.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Use bitwise AND operation to check if a number is odd
 * - Understand that odd numbers have their least significant bit as 1
 * - Implement efficient even/odd checking using bit manipulation
 * - Properly close Scanner resources
 * 
 * Bitwise logic:
 * - Even numbers always end in 0 in binary (LSB = 0)
 * - Odd numbers always end in 1 in binary (LSB = 1)
 * - n & 1 gives the value of the least significant bit
 * - More efficient than using modulo operator
 */
import java.util.*;

public class even_odd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = sc.nextInt();
        if ((n & 1) == 1) {
            System.out.println(n + " is odd");
        } else {
            System.out.println(n + " is even");
        }
        sc.close();
    }
}
// Bitwise even/odd check: Faster than modulo for checking parity!
// Fun fact: This method is more efficient than using n % 2!