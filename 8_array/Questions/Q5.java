/*
 * File: Q5.java
 * Description: This program finds all unique triplets in an array that sum to zero.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Find all unique triplets that sum to zero using brute force approach
 * - Use nested loops to check all possible combinations
 * - Store results in lists for output
 * - Remove duplicates from the result set
 * - Properly close Scanner resources
 * 
 * Algorithm (Brute force):
 * - Use three nested loops to check all possible triplets
 * - For each triplet, check if sum equals zero
 * - Store valid triplets in a result list
 * - Sort and remove duplicate triplets
 * 
 * Time complexity: O(n³)
 * Space complexity: O(n) for storing results
 * 
 * Note: This is an inefficient approach; a two-pointer approach after sorting would be better (O(n²))
 */
package Questions;

import java.util.*;

public class Q5 {
    public List<List<Integer>> threesum(int num[]) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                for (int k = j + 1; k < num.length; k++) {
                    if (num[i] + num[j] + num[k] == 0) {
                        List<Integer> triplet = new ArrayList<Integer>();
                        triplet.add(num[i]);
                        triplet.add(num[j]);
                        triplet.add(num[k]);
                        Collections.sort(triplet);
                        result.add(triplet);
                    }

                }
            }
        }
        // Remove duplicates by converting to LinkedHashSet and back
        result = new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>>(result));
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num[] = { -1, 0, 1, 2, -4 };
        Q5 q5 = new Q5(); // Create an instance of Q5
        List<List<Integer>> result = q5.threesum(num); // Call the method

        System.out.println("Unique triplets that sum up to zero: " + result);
        // System.out.println(threesum(num));
        sc.close();
    }
}
// Three sum problem: Finding triplets that sum to zero!
// Note: This uses O(n³) brute force; O(n²) solution exists with two pointers!