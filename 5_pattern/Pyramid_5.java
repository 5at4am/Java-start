/*
 * File: Pyramid5.java
 * Description: This program prints a centered pyramid pattern of stars with user-defined height.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Take user input for pyramid size using Scanner
 * - Use nested for loops to create a symmetrical pyramid
 * - Print leading spaces to center the pyramid (n - i spaces)
 * - Print odd number of stars per row (2*i - 1) to form the pyramid shape
 * - Understand the mathematical relationship between row number and star count
 * - Properly close Scanner resources
 * 
 * Pattern structure:
 * - For row i: Print (n-i) spaces followed by (2*i-1) stars
 * - This creates a perfectly symmetrical pyramid
 */
import java.util.*;

public class Pyramid_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        //int n = 10; // Number of rows in the pyramid

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" "); // Use space for better alignment
            }

            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) { //*shortcut rule
                System.out.print("*"); // Print stars without tabs
            }

            // Move to the next line after each row
            System.out.println();
        }
        sc.close();
    }
}
// Mathematical pyramid patterns: Where algebra meets art!
// Fun fact: Each row has (2*i-1) stars, forming an arithmetic sequence: 1, 3, 5, 7, ...