/*
 * File: Largest.java
 * Description: This program finds the largest and smallest elements in an array using separate functions.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Create functions to find maximum and minimum values in an array
 * - Use Integer.MIN_VALUE and Integer.MAX_VALUE as initial values
 * - Iterate through an array using a for loop
 * - Compare array elements to find extreme values
 * - Return the found values from functions
 * - Use hardcoded array values for demonstration
 * - Properly close Scanner resources (even if not used in computation)
 * 
 * The get_largest function iterates through the array comparing each element
 * with the current largest value, updating when a larger value is found.
 * Similarly, get_smallest does the same for minimum values.
 */
import java.util.*;

public class largest {
    public static int get_largest(int num[]) {
        int largest = Integer.MIN_VALUE; // -infinity

        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }
        }
        return largest;
    }

    public static int get_smallest(int num[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < smallest) {
                smallest = num[i];

            }
        }
        return smallest;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num[] = { 1, 2, 5, 6, 3 };
        get_largest(num);
        System.out.println("largest digit is : " + get_largest(num));
        get_smallest(num);
        System.out.println("smallest digit is: " + get_smallest(num));

        sc.close();
    }
}
// Finding extremes in arrays: Essential for data analysis!
// Fun fact: Using Integer.MIN_VALUE and MAX_VALUE ensures comparison works correctly!