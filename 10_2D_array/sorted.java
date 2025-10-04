/*
 * File: Sorted.java
 * Description: This program searches for a key in a sorted 2D array using a staircase search algorithm.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Implement staircase search in a sorted 2D array
 * - Search efficiently in a matrix sorted row-wise and column-wise
 * - Start from the top-right corner and move accordingly
 * - Achieve O(n+m) time complexity instead of O(n*m) brute force
 * - Properly close Scanner resources
 * 
 * Staircase Search Algorithm:
 * - Start at top-right corner (row=0, col=n-1)
 * - If element equals key: found
 * - If element > key: move left (col--)
 * - If element < key: move down (row++)
 * - Continue until element found or boundaries crossed
 * 
 * Time complexity: O(n+m) where n is rows and m is columns
 * Space complexity: O(1)
 */
// This program searches for a key in a sorted 2D array using a staircase search.
import java.util.*;

public class sorted {
    public static boolean stare(int mat[][], int key) {
        int row = 0, col = mat[0].length - 1;
        while (row < mat.length && col >= 0) {
            if (mat[row][col] == key) {
                System.out.println("found key at (" + row + "," + col + ")");
                return true;
            } else if (key < mat[row][col]) {
                col--;
            } else if (key > mat[row][col]) {
                row++;
            } else {
                System.out.println("key not found");
            }
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int mat[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        int key = 33;
        stare(mat, key);
        sc.close();
    }
}
// I'm not staring, I'm just searching.
// Staircase search: Efficient search in sorted 2D arrays!