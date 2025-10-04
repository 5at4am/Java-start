/*
 * File: CountSetBit.java
 * Description: This program counts the number of set bits (1s) in the binary representation of a number.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Count the number of 1 bits in a number's binary representation
 * - Use bitwise AND with 1 to check the least significant bit
 * - Use right shift to move to the next bit
 * - Understand binary number representations
 * - Properly close Scanner resources
 * 
 * Algorithm:
 * 1. Check the least significant bit with (n & 1)
 * 2. If it's 1, increment the count
 * 3. Right shift n by 1 to check the next bit
 * 4. Repeat until n becomes 0
 * 
 * Time complexity: O(log n) - number of bits in n
 */
import java.util.*;
public class CountSetBit 
{
    public static int count(int n){
        int count = 0; 
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        count(n);
        System.out.println("your count is : "+ count(n));
        sc.close();
    }
}
// Counting set bits: How many 1s in a binary number?
// Fun fact: This is also known as the Hamming weight of a number!