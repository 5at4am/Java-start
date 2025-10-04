/*
 * File: HalfPyramid.java
 * Description: This program prints a half pyramid pattern of numbers using nested for loops.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Take user input for the pyramid size using Scanner
 * - Use nested for loops to create number patterns
 * - Print numbers in ascending order in each row
 * - Control the number of elements in each row based on the row number
 * - Move to the next line after each row
 * - Properly close Scanner resources
 * 
 * Pattern created: Half pyramid where each row contains numbers from 1 to row number
 * Example for n=4:
 * 1
 * 12
 * 123
 * 1234
 */
import java.util.*;

public class half_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }

        sc.close();
    }
}
// Number pyramids: Building patterns with digits instead of stars!
// Fun fact: The row number determines how many elements appear in that row!
