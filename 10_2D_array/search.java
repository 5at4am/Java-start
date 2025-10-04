/*
 * File: Search.java
 * Description: This program searches for a key in a 2D array and prints its location.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Implement linear search in a 2D array
 * - Traverse a 2D array using nested loops
 * - Find and display the positions where the key occurs
 * - Create a reusable search function for 2D arrays
 * - Properly close Scanner resources
 * 
 * Search algorithm:
 * - Traverse each element in the 2D array
 * - Compare with the key value
 * - Print row and column if match is found
 * - Time complexity: O(m*n) where m and n are dimensions
 */
// This program searches for a key in a 2D array and prints its location.
import java.util.*;
public class search 
{
    public static void sorting(int arr[][],int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    System.out.println("your num is at row "+i+" column "+j);
                }

            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int key =6;
        sorting(arr, key);        
        sc.close();
    }
}
// I'm not a search engine, but I can find what you're looking for.
// 2D array search: Looking for needles in a multi-dimensional haystack!