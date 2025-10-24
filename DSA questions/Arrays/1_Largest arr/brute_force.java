/*
 * File: BruteForce.java
 * Description: This program finds the largest element in an array by sorting it first.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Find the largest element in an array using sorting approach
 * - Use Arrays.sort() to arrange elements in ascending order
 * - Access the largest element which becomes the last element after sorting
 * - Print the sorted array to visualize the result
 * 
 * Algorithm:
 * - Sort the array in ascending order using Arrays.sort()
 * - The largest element will be at index arr.length-1
 * - Print the sorted array and the largest element
 * 
 * Time complexity: O(n log n) due to sorting
 * Space complexity: O(1) if sort is in-place, O(n) depending on implementation
 * 
 * Note: This is not the most efficient approach (O(n) linear search would be faster),
 * but demonstrates an alternative method using sorting.
 */
import java.util.*;

public class brute_force {
    public static void main(String args[]) {
        int arr[] = { 2, 5, 1, 3, 0 };
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Largest num is : " + arr[arr.length - 1]);
    }
}


/*
  Time complexity = O(n*log*n)

  space complexity = O(n)
 */
// Sorting to find maximum: When you want the whole array ordered!
// Note: Linear search would be more efficient for just finding max (O(n) vs O(nlogn))!