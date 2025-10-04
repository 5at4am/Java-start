/*
 * File: Revinv.java
 * Description: This program prints a right-aligned triangle pattern of stars.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Create a right-aligned triangle pattern
 * - Use leading spaces to right-align the triangle
 * - Decrease the number of spaces while increasing stars
 * - Take user input for triangle size
 * - Properly close Scanner resources
 * 
 * Pattern structure:
 * For n=4:
 *    *
 *   **
 *  ***
 * ****
 * 
 * Leading spaces decrease with each row: (n-i)
 * Stars increase with each row: i
 */
import java.util.*;

public class revinv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the num : ");
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();

        }

        sc.close();
    }
    
}
// Right-aligned triangle: Spacing creates the alignment effect!
// Fun fact: This is similar to a half pyramid but right-aligned using spaces!
