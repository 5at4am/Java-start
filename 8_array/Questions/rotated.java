/*
 * File: Rotated.java
 * Description: This program searches for a target in a rotated sorted array.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Search for an element in a sorted rotated array efficiently
 * - Identify which half is sorted and determine if target is in that half
 * - Use modified binary search to maintain O(log n) time complexity
 * - Handle rotation by checking which half of the array is sorted
 * - Properly close Scanner resources
 * 
 * Algorithm (Modified Binary Search):
 * - At each step, one half is always sorted due to rotation
 * - Check which half is sorted (left if arr[start] <= arr[mid])
 * - If target is in the sorted half, search there; otherwise search the other half
 * 
 * Time complexity: O(log n)
 * Space complexity: O(1)
 */
package Questions;

// question 2;
//in short answer

import java.util.*;

public class rotated {
    public static int search(int num[], int target) {
        int start = 0;
        int end = num.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (num[mid] == target) {
                return mid;
            }

            if (num[start] <= num[mid]) { // left half is sorted
                if (num[start] <= target && target <= num[mid]) {
                    end = mid - 1;  // target is in the left sorted half

                } else {
                    start = mid + 1;  // target is in the right half
                }
            } else {  // right half is sorted
                if (num[mid] <= target && target <= num[end]) {
                    start = mid + 1;  // target is in the right sorted half

                } else {
                    end = mid - 1;  // target is in the left half
                }
            }

        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 3;
        System.out.println("your indext at : " + search(num, target));

        sc.close();
    }
}
// Searching in rotated sorted arrays: Modified binary search technique!
// Fun fact: At each step, at least one half is always sorted in a rotated array!