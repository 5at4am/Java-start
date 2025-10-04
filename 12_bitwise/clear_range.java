/*
 * File: ClearRange.java
 * Description: This program clears bits in a given range [i, j] of a number using bitwise operations.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Clear (set to 0) all bits in a specific range [i, j]
 * - Use bitwise operations to create masks
 * - Understand bit manipulation for range operations
 * - Take user input for number and range
 * - Properly close Scanner resources
 * 
 * Algorithm:
 * 1. Create mask with 1s in positions [0, i-1]: (1<<i) - 1
 * 2. Create mask with 1s in positions [j+1, max]: (~0)<<(j+1)
 * 3. Combine both masks: a | b
 * 4. Apply mask to original number: n & mask
 * 
 * Example: Clear bits [2,4] in 0b11111111
 * Result: 0b11100011 (bits 2,3,4 set to 0)
 */
import java.util.*;
public class clear_range 
{
    public static int clearRange(int n, int i, int j){
        int a = (~0)<<(j+1);  // 1s from position j+1 to MSB
        int b= (1<<i)-1;      // 1s from position 0 to i-1
        int c = a|b;          // Combined mask: 0s only in range [i,j]
        return n & c;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the n : ");
        int n = sc.nextInt();
        System.out.print("enter the i : ");
        int i = sc.nextInt();
        System.out.print("enter the range j : ");
        int j = sc.nextInt();

        clearRange(n,i,j);
        System.out.println("your input range is : "+ clearRange(n,i,j));
        sc.close();
    }
}
// Clearing bit ranges: Selective bit manipulation in action!
// Fun fact: This technique is used in embedded systems and data compression!