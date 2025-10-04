/*
 * File: Dimond.java
 * Description: This program prints a diamond pattern using nested for loops.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Create a diamond pattern with upper and lower triangles
 * - Use proper spacing to center the diamond shape
 * - Calculate star counts using mathematical formulas
 * - Take user input for diamond size
 * - Properly close Scanner resources
 * 
 * Pattern structure:
 * Upper half: Increasing stars with decreasing leading spaces
 * Lower half: Decreasing stars with increasing leading spaces
 * Formula for stars: (2*i - 1) for upper, (2*(n-i)+1) for lower
 */
import java.util.*;

public class dimond {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <= 2*(n-i)+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
// Diamond patterns: Creating geometric beauty with code!
// Fun fact: The mathematical relationship (2*i-1) creates the perfect diamond shape!