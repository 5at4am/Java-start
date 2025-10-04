/*
 * File: Q1.java
 * Description: This program counts the occurrences of a given key in a 2D array.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Traverse a 2D array using nested loops
 * - Count occurrences of a specific value
 * - Iterate through all elements in a 2D array
 * - Return the count of matches found
 * - Properly close Scanner resources
 * 
 * Algorithm:
 * - Iterate through each row and column of the 2D array
 * - Compare each element with the target key
 * - Increment counter when a match is found
 * - Return the total count
 * 
 * Time complexity: O(m*n) where m and n are array dimensions
 * Space complexity: O(1) - only using a counter variable
 */
// This program counts the occurrences of a given key in a 2D array.
package Question;

import java.util.*;
public class Q1 
{
    public static int find(int arr[][],int key){
        int num =0;
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    num++;
                }
            }
        }
        return num;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[][]={{4,7,8},{8,8,7}};
        int key=7;
        System.out.println(find(arr,key));
        sc.close();
    }
}
// I've got the key, I've got the secret.
// Counting occurrences: When you need to know "how many times"!