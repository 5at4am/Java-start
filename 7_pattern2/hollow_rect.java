
/*
 * File: HollowRect.java
 * Description: This program prints a hollow rectangle pattern using nested loops.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Create a hollow rectangle with stars on borders and spaces inside
 * - Use conditional logic to determine when to print stars vs spaces
 * - Implement a function to draw the rectangle pattern
 * - Print stars only on the borders (first/last row or first/last column)
 * 
 * Logic: Print star when i=1 (first row), i=row (last row), 
 * j=1 (first column), or j=column (last column), otherwise print space.
 */
public class hollow_rect {

    public static void hol_rect(int row, int column) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                if (i == 1 || i == row || j == 1 || j == column) {
                    System.out.print(" * ");

                } else {
                    System.out.print("   ");

                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int row = 4;
        int column = 5;
        hol_rect(row, column);
        
    }
}
// Hollow rectangles: When you want the outline but not the fill!
// Fun fact: The conditional statement determines exactly which positions get stars!
