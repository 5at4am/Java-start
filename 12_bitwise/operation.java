/*
 * File: Operation.java
 * Description: This program demonstrates various bit manipulation operations on integers.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Get the value of the i-th bit in a number
 * - Set the i-th bit to 1
 * - Clear the i-th bit to 0
 * - Clear last i bits
 * - Use masks for bit manipulation
 * - Properly close Scanner resources
 * 
 * Bit manipulation operations:
 * - Get bit: Use mask (1 << i) and AND operation
 * - Set bit: Use mask (1 << i) and OR operation
 * - Clear bit: Use mask ~(1 << i) and AND operation
 * - Clear last i bits: Use mask (~0) << i and AND operation
 * 
 * These operations are fundamental in low-level programming and optimization.
 */
import java.util.*;

public class operation {
    public static int get_bits(int n, int i) {
        int mask = 1 << i;
        if ((n & mask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int set_bits(int n, int i) {
        int mask = 1 << i;
        return n | mask;
    }

    public static int clear_bit(int n, int i) {
        int mask = ~(1 << i);
        return n & mask;

    }

    public static int update_bit(int n, int i) {
        int val = 0;
        int mask = 1 << i;
        int newbit = get_bits(n, i);

        if (newbit == 1) {
            val = 1;
        }
        return n & ~mask + val << i;

    }

    public static int ClearlastBit(int n, int i) {
        int mask = (~0) << i;
        return n & mask;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.print("Enter the i number : ");
        int i = sc.nextInt();

        get_bits(n, i);
        System.out.println("Your ith bit is in the number : " + get_bits(n, i));

        set_bits(n, i);
        System.out.println("Your ith bit is set in the number : " + set_bits(n, i));

        clear_bit(n, i);
        System.out.println("You ith bit is cleared in the number : " + clear_bit(n, i));

        ClearlastBit(n, i);
        System.out.println("your last ith bit is cleared with number : " + ClearlastBit(n, i));
        sc.close();
    }
}
// Bit manipulation: The art of working with individual bits!
// Fun fact: These operations are the foundation of many algorithms and optimizations!