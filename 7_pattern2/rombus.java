/*
 * File: Rombus.java
 * Description: This program prints a rhombus pattern with parallel sides.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Create a rhombus pattern with fixed-width rows
 * - Use leading spaces to create the slanted effect
 * - Print consistent number of stars in each row
 * - Take user input for rhombus size
 * - Properly close Scanner resources
 * 
 * Pattern structure:
 * For n=4:
 *    ****
 *   ****
 *  ****
 * ****
 * 
 * Each row has the same number of stars (n) but different leading spaces
 */
import java.util.*;
public class rombus 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j =1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
// Rhombus pattern: Parallel sides created with consistent width!
// Fun fact: Each row has the same number of stars but different alignment!