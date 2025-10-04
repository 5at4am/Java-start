/*
 * File: InvStar.java
 * Description: This program prints an inverted triangle pattern of stars using nested for loops.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Take user input for the triangle size using Scanner
 * - Use nested for loops to create an inverted pattern
 * - Print decreasing numbers of stars in each row
 * - Calculate the number of stars per row as (n - i + 1)
 * - Move to the next line after each row
 * - Properly close Scanner resources
 * 
 * Pattern created: Inverted triangle where each row has fewer stars
 * Example for n=5:
 * ****
 * ***
 * **
 * *
 * (Note: The loop runs from 1 to n-1, so last row is skipped)
 */
import java.util.*;

public class inv_star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ent the number");
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }

}
// Inverted stars: Creating patterns that shrink instead of grow!
// Fun fact: The formula (n - i + 1) controls the decreasing number of stars per row!