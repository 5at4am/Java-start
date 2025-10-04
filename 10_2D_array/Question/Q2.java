/*
 * File: Q2.java
 * Description: This program calculates the sum of the elements in a specific row of a 2D array.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Access elements of a specific row in a 2D array
 * - Calculate the sum of elements in a row
 * - Use a helper method to encapsulate the calculation logic
 * - Properly close Scanner resources
 * 
 * Algorithm:
 * - Iterate through all columns of the specified row
 * - Add each element to a running sum
 * - Return the final sum
 * 
 * Time complexity: O(n) where n is the number of columns
 * Space complexity: O(1) - only using a sum variable
 */
// This program calculates the sum of the elements in a specific row of a 2D array.
package Question;
import java.util.*;

public class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] num = {{1, 4, 9}, {11, 4, 3}, {2, 2, 3}};
        int sum = calculateSum(num, 1);
        System.out.println(sum);
        sc.close();
    }

    private static int calculateSum(int[][] num, int row) {
        int sum = 0;
        for (int j = 0; j < num[row].length; j++) {
            sum += num[row][j];
        }
        return sum;
    }
}
// It's all about that row, 'bout that row, no treble.
// Row sums: Adding up elements across a single row!