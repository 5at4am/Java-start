/*
 * File: NumPyr.java
 * Description: This program prints a number pyramid where each row contains the row number repeated.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Create a number pyramid with center alignment using spaces
 * - Print the row number multiple times in each row
 * - Calculate leading spaces for proper alignment
 * - Take user input for pyramid size
 * - Properly close Scanner resources
 * 
 * Pattern structure:
 * For n=4:
 *    1
 *   2 2
 *  3 3 3
 * 4 4 4 4
 * 
 * Each row i contains the number i, repeated i times
 */
import java.util.*;

public class num_pyr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("eter the number ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + i );
            }
            System.out.println();
        }
        sc.close();
    }
}
// Number pyramid: Each row displays its row number in sequence!
// Fun fact: The row number becomes both the counter and the value to print!