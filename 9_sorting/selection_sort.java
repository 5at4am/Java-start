/*
 * File: SelectionSort.java
 * Description: This program implements the selection sort algorithm to sort an array.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Implement the selection sort algorithm
 * - Find the minimum element in each pass
 * - Swap the minimum element to the correct position
 * - Print sorted arrays using a helper function
 * - Properly close Scanner resources
 * 
 * Selection Sort Algorithm:
 * - Find the minimum element in unsorted part
 * - Swap it with the first element of unsorted part
 * - Move boundary of sorted part one position forward
 * - Time complexity: O(n²), Space complexity: O(1)
 * - Makes minimum number of swaps among sorting algorithms
 */
import java.util.*;

public class selection_sort {
    public static void selection(int num[]) {
        int n = num.length;
        for (int i = 0; i < n - 1; i++) {
            int small = i;
            for (int j = i + 1; j < n; j++) {
                if (num[small] > num[j]) {
                    small = j;
                }
            }
            int temp = num[small];
            num[small] = num[i];
            num[i] = temp;
        }
    }

    public static void arry_print(int num[]) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");

        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num[] = { 5, 4, 1, 3, 2 };
        selection(num);
        arry_print(num);
        sc.close();
    }
}
// Selection sort: Find the smallest and put it in place!
// Fun fact: This algorithm makes the minimum number of swaps (n-1 swaps maximum)!