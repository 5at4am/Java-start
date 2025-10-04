/*
 * File: PowerOf2.java
 * Description: This program checks if a number is a power of 2 using bitwise operations.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Use bit manipulation to check if a number is a power of 2
 * - Understand the property: n & (n-1) = 0 for powers of 2
 * - Implement an efficient O(1) algorithm for power of 2 checking
 * - Properly close Scanner resources
 * 
 * Bitwise logic:
 * - Powers of 2 have exactly one bit set (1, 10, 100, 1000 in binary)
 * - For n > 0, n & (n-1) removes the rightmost set bit
 * - If n is a power of 2, only one bit is set, so result is 0
 * - For n = 0, this returns true incorrectly, so check n > 0
 * 
 * Note: Added check for n > 0 since 0 & -1 = 0 but 0 is not a power of 2.
 */
import java.util.*;
public class powerOf2 
{
    public static boolean power(int n){
        if (n <= 0) return false;  // Handle edge cases (0 and negative numbers)
        return (n & (n-1)) == 0;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number you want to check : ");
        int n = sc.nextInt();

        power(n);
        System.out.println(" this is "+ power(n));
        sc.close();
    }
}
// Power of 2 check: Efficient bit manipulation algorithm!
// Fun fact: This is much faster than using logarithms or division!