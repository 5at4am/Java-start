/*
 * File: Reverse.java
 * Description: This program reverses an array in place using the two-pointer technique.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Reverse an array using the two-pointer approach
 * - Swap elements from both ends moving toward the center
 * - Modify the array in place without using extra space
 * - Display the original and reversed arrays
 * - Properly close Scanner resources
 * 
 * Algorithm: Two-pointer technique
 * - Start pointer at index 0, end pointer at last index
 * - Swap elements at both pointers
 * - Move pointers toward each other until they meet
 * - Time complexity: O(n), Space complexity: O(1)
 */
import java.util.*;

public class reverse {
    public static void reverse_num(int num[]) {
        int start = 0;
        int end = num.length - 1;
        while (start < end) {
            // swap
            int temp = num[end];
            num[end] = num[start];
            num[start] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num[] = { 2, 4, 6, 8, 10 };
        System.out.print("original num = ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        // print
        reverse_num(num);
        System.out.print("\nreverse num = ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        sc.close();
    }
}
// Array reversal: Swapping elements with the two-pointer technique!
// Fun fact: This in-place reversal is more memory efficient than creating a new array!