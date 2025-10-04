/*
 * File: Resursive.java
 * Description: This program finds the largest element in an array using linear search.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Find the largest element in an array using linear traversal
 * - Initialize max to Integer.MIN_VALUE to handle negative numbers
 * - Compare each element with current max and update if necessary
 * - Implement an efficient O(n) solution for finding maximum
 * 
 * Algorithm:
 * - Initialize max to the smallest possible integer value
 * - Iterate through each element in the array
 * - If current element is greater than max, update max
 * - Return the maximum value found
 * 
 * Time complexity: O(n) - single pass through the array
 * Space complexity: O(1) - only using one variable
 * 
 * Note: Despite the file name suggesting recursion, this implementation uses iteration.
 * This is the most efficient approach for finding the maximum element.
 */
public class resursive {
    public static void main(String args[]) {
        int arr[] = { 2, 5, 1, 3, 0 };
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println(max);
    }
}
// Linear search for maximum: The most efficient O(n) approach!
// Note: Despite the file name, this uses iteration, not recursion!