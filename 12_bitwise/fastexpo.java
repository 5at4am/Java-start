/*
 * File: FastExpo.java
 * Description: This program calculates a^n using fast exponentiation algorithm with bit manipulation.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Implement fast exponentiation using binary representation of exponent
 * - Use bit manipulation for efficient power calculation
 * - Reduce time complexity from O(n) to O(log n)
 * - Understand how binary representation relates to exponentiation
 * - Properly close Scanner resources
 * 
 * Algorithm (Binary Exponentiation):
 * - If current bit of n is 1, multiply result with current base
 * - Square the base for next iteration
 * - Right shift n to process next bit
 * 
 * Time complexity: O(log n)
 * This is much faster than naive approach (O(n) multiplications)
 */
import java.util.*;
public class fastexpo 
{
    public static int expo(int n, int a ){
        int ans = 1;
        while(n>0){
            if((n&1)!=0){
                ans = ans*a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter the number : ");
        int a = sc.nextInt();

        System.out.print(" enter the power of the number : ");
        int n  = sc.nextInt();

        expo(n, a);
        System.out.println("your answer is : "+ expo(n, a));
        sc.close();
    }
}
// Fast exponentiation: Computing powers efficiently with bit manipulation!
// Fun fact: This algorithm reduces O(n) operations to O(log n)!