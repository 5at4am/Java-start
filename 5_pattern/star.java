/*
 * File: Star.java
 * Description: This program prints a right triangle pattern of stars using nested for loops.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Use nested for loops to create patterns
 * - Print a right triangle pattern (increasing rows of stars)
 * - Control inner loop with outer loop counter (j <= i)
 * - Use tab characters for spacing between stars
 * - Move to the next line after each row
 * 
 * Pattern created: Right triangle with 4 rows
 * Row 1: 1 star
 * Row 2: 2 stars
 * Row 3: 3 stars
 * Row 4: 4 stars
 */
public class star {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
// Creating stars in a triangle - the foundation of pattern programming!
// Fun fact: This is a classic beginner pattern that teaches nested loop logic!
