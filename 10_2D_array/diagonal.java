/*
 * File: Diagonal.java
 * Description: This program calculates the sum of the diagonals of a 2D array.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Calculate the sum of both primary and secondary diagonals in a square matrix
 * - Implement an optimized algorithm to avoid double-counting the center element
 * - Understand primary diagonal: elements where row index equals column index
 * - Understand secondary diagonal: elements where row+col = length-1
 * - Compare brute force and optimized approaches
 * - Properly close Scanner resources
 * 
 * Key concepts:
 * - Primary diagonal: arr[i][i] for all i
 * - Secondary diagonal: arr[i][n-1-i] for all i
 * - For odd-sized matrices, center element is counted only once
 */
// This program calculates the sum of the diagonals of a 2D array.
import java.util.*;
public class diagonal 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int n = arr.length;
        int sum = 0;

        //brute force method        time comple = O(n^2)

        // for(int i = 0; i < n; i++){
        //     for(int j=0;j<n;j++){
        //         if(i==j ){
        //             sum +=arr[i][j];
        //         }
        //         else if (i+j == arr.length-1){
        //             sum += arr[i][j];
        //         }
        //     }
        // }

        
        //optemize code

         for(int i = 0; i < n; i++){
             sum += arr[i][i];

             if(i !=arr.length-1-i)                     // i+j==num.length-1
                sum+=arr[i][arr.length-1-i];            // j== num.length-1-i
                
         }
         
        
        System.out.println(sum);

        sc.close();
    }
}
// It's not a diagonal, it's a feature.
// Diagonal sums: When you want the cross-section of your matrix!