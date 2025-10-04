/*
 * File: Butterfly.java
 * Description: This program prints a butterfly pattern using nested for loops.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Use nested loops to create complex symmetrical patterns
 * - Print left and right wings with proper spacing
 * - Create both upper and lower halves of the butterfly
 * - Calculate spacing based on row number for symmetry
 * - Take user input for pattern size
 * - Properly close Scanner resources
 * 
 * Pattern structure:
 * Upper half: Stars increase, spaces decrease
 * Lower half: Stars decrease, spaces increase
 * Creates a symmetrical butterfly shape
 */
import java.util.*;

public class butterfly {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        // first half of the code
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");    // left upper wings
            }
            for (int k = 1; k <= 2*(n-i); k++) {
                System.out.print("   ");    // space between them
            }
            for(int l =1;l<=i;l++){
                System.out.print(" * ");    // right upper wings
            }
            System.out.println();
        }

        // second half wing code
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" * ");    // left lower wings
            }
            for (int k = 1; k <= 2*i; k++) {
                System.out.print("   ");    // space between them
            }
            for(int l =1;l<=n-i;l++){
                System.out.print(" * ");    // right lower
            }
            System.out.println();
        }
        

        sc.close();

    }
}
// Butterfly patterns: The art of symmetrical programming!
// Fun fact: This complex pattern uses mathematical relationships to maintain symmetry!