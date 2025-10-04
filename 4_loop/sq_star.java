/*
 * File: SqStar.java
 * Description: This program prints a 4x4 square pattern of stars using nested for loops.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Use nested for loops to create patterns
 * - Print a square pattern of stars
 * - Control rows and columns using loop counters
 * - Move to the next line after each row using println()
 * 
 * Pattern created: 4 rows x 4 columns of stars with spaces
 * 
 * Alternative commented code shows another approach to the same pattern.
 */
public class sq_star {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
            System.out.print("* ");
            }
            System.out.println();
        }

        // for (int i = 1; i <=4; i++) {
        //     for (int j = 1; j <= 4; j++) {
        //     System.out.print("* ");
        // }
        // System.out.println("* ");
        // }


    }
}
// Creating patterns with stars - the artistic side of programming!
// Fun fact: Nested loops are powerful for creating 2D patterns and matrices!
