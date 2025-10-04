/*
 * File: Q2.java
 * Description: This program performs search in a rotated sorted array.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Search for an element in a rotated sorted array
 * - First find the pivot point (minimum element)
 * - Perform binary search in the appropriate segment
 * - Handle both rotated and non-rotated cases
 * - Implement efficient search with O(log n) time complexity
 * - Properly close Scanner resources
 * 
 * Algorithm:
 * 1. Find the minimum element index (pivot point where rotation occurred)
 * 2. Determine which segment contains the target based on value ranges
 * 3. Perform binary search in the correct segment
 * 
 * Time complexity: O(log n)
 * Space complexity: O(1)
 * 
 * Note: Fixed overloaded method naming conflict and corrected search logic.
 */
package Questions;

import java.util.*;

public class Q2 {
    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        
        // If there's no pivot, array is not rotated, search the whole array
        if (pivot == 0) {
            return binarySearch(nums, 0, nums.length - 1, target);
        }
        
        // If target is greater than or equal to first element, search left part
        if (target >= nums[0]) {
            return binarySearch(nums, 0, pivot - 1, target);
        } else {
            return binarySearch(nums, pivot, nums.length - 1, target);
        }
    }

    public static int binarySearch(int[] nums, int left, int right, int target) {
        int l = left;
        int r = right;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] < target) {
                l = mid + 1; // Move to the right half
            } else {
                r = mid - 1; // Move to the left half
            }
        }
        return -1; // Target not found
    }

    public static int findPivot(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        // Handle case when the array is not rotated
        if (nums[left] <= nums[right]) {
            return 0; // The array is not rotated
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Check if mid is the pivot point
            if (mid < nums.length - 1 && nums[mid] > nums[mid + 1]) {
                return mid + 1; // Found pivot
            }
            
            // Check if mid-1 is the pivot point
            if (mid > 0 && nums[mid - 1] > nums[mid]) {
                return mid; // Found pivot
            }
            
            // Decide which half to search
            if (nums[left] <= nums[mid]) {
                left = mid + 1; // Pivot is in the right half
            } else {
                right = mid - 1; // Pivot is in the left half
            }
        }
        return 0; // Default case
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num[] = { 4, 5, 6, 7, 0, 1, 2 }; // Example rotated sorted array
        int target = 0; // Target to search for

        int result = search(num, target);

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found.");
        }

        sc.close();
    }
}
// Searching in rotated sorted arrays: Finding elements efficiently!
// Fun fact: This combines pivot finding with binary search for O(log n) performance!
