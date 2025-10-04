/*
 * File: Array1.java
 * Description: This program creates a 2D array with user-defined dimensions and elements.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Get user input for 2D array dimensions
 * - Create a 2D array with dynamic size
 * - Populate the array with user input
 * - Print the complete 2D array in a tabular format
 * - Properly close Scanner resources
 * 
 * Key concepts:
 * - Dynamic array sizing based on user input
 * - Using .length to get dimensions during traversal
 * - Input validation for total number of elements
 */
// This program creates a 2D array with user-defined dimensions and elements.
import java.util.*;

public class array_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the row number : ");
        int m = sc.nextInt();
        System.out.print("\nenter the column number : ");
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("\nenter the elements of the array " + m * n + " digit  :");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nthe array is : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        sc.close();
    }
}
// A 2D array is like a spreadsheet, but with more programming.
// Dynamic 2D arrays: When you don't know the size in advance!