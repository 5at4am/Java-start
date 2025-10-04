/*
 * File: Pyramid.java
 * Description: This program prints a centered pyramid pattern of stars using nested for loops.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Use multiple nested for loops to create a pyramid pattern
 * - Print leading spaces to center the pyramid
 * - Print stars in increasing count for each row
 * - Control spacing and alignment to form the pyramid shape
 * - Combine multiple loops to achieve complex patterns
 * 
 * Pattern structure:
 * - Loop 1: Print spaces (n-i spaces for row i)
 * - Loop 2: Print stars (i stars for row i)
 * - Loop 3: Print additional stars (i-1 stars for row i)
 * - This creates a symmetrical pyramid shape
 */
public class pyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            for (int l = 1; l <= i - 1; l++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
// Symmetrical star pyramids: The art of alignment in programming!
// Fun fact: The key to centered patterns is calculating the right number of leading spaces!