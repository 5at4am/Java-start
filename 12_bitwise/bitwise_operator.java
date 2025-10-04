/*
 * File: BitwiseOperator.java
 * Description: This program demonstrates various bitwise operators and their operations.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Use AND (&), OR (|), XOR (^), NOT (~) operators
 * - Use left shift (<<) and right shift (>>) operators
 * - Understand binary representations of numbers
 * - Perform bit-level operations on integers
 * 
 * Bitwise operators:
 * - & : Bitwise AND (both bits are 1)
 * - | : Bitwise OR (at least one bit is 1)
 * - ^ : Bitwise XOR (bits are different)
 * - ~ : Bitwise NOT (flips all bits)
 * - << : Left shift (multiply by 2^n)
 * - >> : Right shift (divide by 2^n)
 */
public class bitwise_operator {
    public static void main(String args[]) {
        int a = 5;  // Binary: 101
        int b = 6;  // Binary: 110
        int and = a & b;        // AND: 101 & 110 = 100 = 4
        int or = a | b;         // OR:  101 | 110 = 111 = 7
        int xor = a ^ b;        // XOR: 101 ^ 110 = 011 = 3
        int not = ~a;           // NOT: ~101 = ...1010 = -6 (two's complement)
        int leftshift = a << 2; // Left shift: 101 << 2 = 10100 = 20 (5*4)
        int rightshift = a >> 2; // Right shift: 101 >> 2 = 001 = 1 (5/4, truncated)
        System.out.println("AND: " + and);
        System.out.println("OR: " + or);
        System.out.println("XOR: " + xor);
        System.out.println("NOT: " + not);
        System.out.println("Left shift : " + leftshift);
        System.out.println("Right shift : " + rightshift);

    }
}
// Bitwise operations: Manipulating numbers at the bit level!
// Fun fact: Left shift by n is equivalent to multiplying by 2^n!