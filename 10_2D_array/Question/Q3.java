/*
 * File: Q3.java
 * Description: This program transposes a 2D array (rows become columns and vice versa).
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Create a transposed version of a 2D array
 * - Transform rows to columns and columns to rows
 * - Use the relationship: transposed[j][i] = original[i][j]
 * - Print 2D arrays using a helper method
 * - Properly close Scanner resources
 * 
 * Transpose algorithm:
 * - Create a new matrix with dimensions [original_columns][original_rows]
 * - For each element at [i][j] in original, place it at [j][i] in transpose
 * - Original: m×n → Transposed: n×m
 * 
 * Time complexity: O(m*n) to copy all elements
 * Space complexity: O(m*n) for the transposed matrix
 */
// This program transposes a 2D array.
package Question;

import java.util.*;

public class Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int row = 2, col = 3;
        int num[][] = { { 1, 3, 5 }, { 2, 4, 6 } };
        printMatrix(num);

        int trans[][] = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                trans[j][i] = num[i][j];
            }
        }
        printMatrix(trans);

        sc.close();
    }
    public static void printMatrix(int[][] matrix){
        System.out.println("The Matrix is: ");
        for(int i = 0;i<matrix.length; i++){
        for(int j = 0;j<matrix[0].length; j++){
        System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
        }
        }
}
// Welcome to the Matrix.
// Matrix transpose: Swapping rows with columns!