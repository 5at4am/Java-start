/*
 * File: Array.java
 * Description: This program creates a 3x3 2D array and fills it with user input.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Declare and initialize a 2D array
 * - Take user input to populate the 2D array
 * - Traverse and print a 2D array using nested loops
 * - Get the dimensions of the 2D array using .length property
 * - Properly close Scanner resources
 * 
 * 2D Array Concepts:
 * - Declaration: int[][] array = new int[rows][columns]
 * - Accessing: array[row][column]
 * - Length: array.length (number of rows), array[0].length (number of columns)
 */
// This program creates a 3x3 2D array and fills it with user input.
import java.util.*;

public class array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        int n = arr.length, m = arr[0].length;

        System.out.println("write the number after each space : ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
// This array is more organized than my life.
// 2D arrays: When 1D arrays just aren't enough structure!