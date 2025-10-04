/*
 * File: Sorted.java
 * Description: This program checks if an array is sorted in ascending order using recursion.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Implement recursive array sorting check
 * - Compare adjacent elements to verify order
 * - Use index-based approach to traverse the array
 * - Return boolean result based on comparison
 * 
 * Algorithm:
 * - Base case: If we reach the last element, array is sorted
 * - If current element is greater than next, array is not sorted
 * - Otherwise, recursively check the rest of the array
 * 
 * Time complexity: O(n), Space complexity: O(n) for recursion stack
 */
public class sorted{

    public static boolean issorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }

        return issorted(arr,i+1);
    }
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6};
        System.out.println(issorted(arr,0));
    }
}
// Recursive sorted check: Verifying ascending order element by element!
// Fun fact: This compares adjacent elements to ensure correct ordering!