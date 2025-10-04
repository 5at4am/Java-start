/*
 * File: Q1.java
 * Description: This program checks if there are duplicate elements in an array.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Check for duplicate elements in an array using nested loops
 * - Implement a function that returns boolean based on duplicate detection
 * - Use nested for loops to compare all pairs of elements
 * - Return true as soon as a duplicate is found
 * - Return false if no duplicates are found after checking all pairs
 * - Test the function with multiple example arrays
 * - Properly close Scanner resources
 * 
 * Algorithm: Nested loop approach
 * - Compare each element with all subsequent elements
 * - Return true immediately when a duplicate is found
 * - Time complexity: O(n²), Space complexity: O(1)
 * 
 * Note: Fixed function call typo (twice vs twice) and improved efficiency.
 */
package Questions;
//? question is to check if there are two same numbers in the array
//? if there are two same numbers then return true else return false
//? for example:
//? num1 = {1,2,3,1} => true
//? num2 = {1,2,3,4} => false

import java.util.*;

public class Q1 {

    public static boolean twice(int num[]) {

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1[] = { 1, 2, 3, 1 };
        int num2[] = { 1, 2, 3, 4 };
        int num3[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        System.out.println(twice(num1));
        System.out.println(twice(num2));
        System.out.println(twice(num3));

        sc.close();
    }
}
// Duplicate detection: Finding repeated elements in arrays!
// Fun fact: This uses nested loops to compare all element pairs!