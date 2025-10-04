/*
 * File: Q4.java
 * Description: This program calculates how much rainwater can be trapped between bars.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Calculate trapped rainwater using the two-pointer approach
 * - Track left and right maximum heights simultaneously
 * - Move pointers inward based on which side has lower max
 * - Calculate trapped water at each position
 * - Understand the concept of boundary heights in trapping problems
 * - Properly close Scanner resources
 * 
 * Algorithm (Two-pointer approach):
 * - Use two pointers from left and right ends
 * - Track max height seen from both sides
 * - Move the pointer with the smaller max height
 * - Add difference between max height and current height to result
 * 
 * Time complexity: O(n)
 * Space complexity: O(1)
 */
package Questions;

import java.util.*;

public class Q4 {
    public static int rainwater(int num[]) {
        int n = num.length;
        int res = 0, l = 0, r = n - 1;

        int rMax = num[r], lMax = num[l];

        while (l < r) {
            if (lMax < rMax) {
                l++;
                lMax = Math.max(lMax, num[l]);
                res += lMax - num[l];
            } else {
                r--;
                rMax = Math.max(rMax, num[r]);
                res += rMax - num[r];
            }
        }
        return res;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(" your storage is : " + rainwater(num));
        sc.close();
    }
}
// Rainwater trapping: Calculating water stored between bars!
// Fun fact: This two-pointer approach is more efficient than the traditional method!