/*
 * File: Spiral.java
 * Description: This program prints the elements of a 2D array in spiral order.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Implement spiral traversal of a 2D array
 * - Use boundary pointers (top, right, bottom, left) to control traversal
 * - Print elements in top->right->bottom->left order repeatedly
 * - Handle edge cases when rows or columns meet in the middle
 * - Create a dynamic matrix with user-defined dimensions
 * - Properly close Scanner resources
 * 
 * Spiral Traversal Algorithm:
 * 1. Print top row from left to right (SR constant, SC to EC)
 * 2. Print right column from top+1 to bottom (SC to EC constant, SR+1 to ER)
 * 3. Print bottom row from right-1 to left (ER constant, EC-1 to SC)
 * 4. Print left column from bottom-1 to top+1 (SC constant, ER-1 to SR+1)
 * 5. Adjust boundaries: increment SR & SC, decrement ER & EC
 * 6. Repeat until boundaries cross
 */
import java.util.*;

public class spiral {
    public static void siral(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;

        int SR = 0, ER = n - 1, SC = 0, EC = m - 1;

        while (SR <= ER && SC <= EC) {
            // top
            for (int j = SC; j <= EC; j++) {
                System.out.print(mat[SR][j] + " ");
            }
            // right
            for (int i = SR + 1; i <= ER; i++) {
                if (SR == ER) {
                    break;
                }
                System.out.print(mat[i][EC] + " ");
            }
            // bottom
            for (int j = EC - 1; j >= SC; j--) {
                if (EC == SC) {
                    break;
                }
                System.out.print(mat[ER][j] + " ");
            }
            // left
            for (int i = ER - 1; i >= SR + 1; i--) {
                System.out.print(mat[i][SC] + " ");
            }
            SC++;
            EC--;
            SR++;
            ER--;

        }
        //System.out.println();

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the row number : ");
        int m = sc.nextInt();
        System.out.print("\nenter the column number : ");
        int n = sc.nextInt();
        int mat[][] = new int[m][n];
        System.out.println("\nenter the elements of the matrix " + m * n + " digit  :");

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nthe matrix is : ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("your spiral number is in here ");

        siral(mat);

        sc.close();
    }
}
// Spiral traversal: Following the path of a nautilus shell in code!
// Fun fact: Spiral matrices are common in coding interviews and game development!
