/*
 * File: Bubblesort.java
 * Description: This program implements the bubble sort algorithm to sort an array.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Implement the bubble sort algorithm
 * - Use nested loops to compare adjacent elements
 * - Swap elements when they are in wrong order
 * - Print sorted arrays using a helper function
 * - Properly close Scanner resources
 * 
 * Bubble Sort Algorithm:
 * - Compare adjacent elements and swap if needed
 * - After each pass, the largest element bubbles to the end
 * - Time complexity: O(n²), Space complexity: O(1)
 * - The outer loop runs (n-2) times, inner loop reduces with each pass
 * 
 * Note: Fixed outer loop condition from "i < n-2" to "i < n-1" for complete sorting.
 */
import java.util.*;

public class bubblesort {
    public static void buble(int num[]) {
        int n = num.length;
        for (int i = 0; i < n - 1; i++) {  // Fixed: was n-2, should be n-1 for complete sorting
            for (int j = 0; j <= n - 2 - i; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            } 
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
        
        buble(num);
        arry_print(num);

        sc.close();
    }
}
// Bubble sort: The simplest sorting algorithm, easy to understand!
// Fun fact: The largest elements "bubble" to the end in each pass!