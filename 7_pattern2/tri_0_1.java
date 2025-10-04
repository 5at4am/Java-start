/*
 * File: Tri01.java
 * Description: This program prints a 0-1 triangle pattern based on the sum of row and column indices.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Create a binary pattern using conditional logic
 * - Generate alternating 0s and 1s based on (i+j) parity
 * - Create a triangle pattern with binary values
 * - Take user input for pattern size
 * - Properly close Scanner resources
 * 
 * Pattern logic:
 * If (i+j) is even, print 1
 * If (i+j) is odd, print 0
 * 
 * For n=5:
 * 1
 * 01
 * 101
 * 0101
 * 10101
 */
import java.util.*;
public class tri_0_1 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
// Alternating 0-1 triangle: Creating binary patterns with mathematical logic!
// Fun fact: The pattern alternates based on the sum of indices (i+j)!