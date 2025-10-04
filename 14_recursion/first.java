/*
 * File: First.java
 * Description: This program finds the first occurrence of a key in an array using recursion.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Implement recursive linear search to find first occurrence
 * - Use index-based approach to traverse the array
 * - Return the index of first match or -1 if not found
 * - Understand recursive problem decomposition
 * 
 * Algorithm:
 * - Base case: If we've reached the end of array, return -1 (not found)
 * - If current element matches key, return current index
 * - Otherwise, recursively search in the rest of the array
 * 
 * Time complexity: O(n) in worst case, Space complexity: O(n) due to recursion stack
 */
public class first {
    
    public static int first_occ(int arr[],int i,int key){
        
        if(i==arr.length-1){
            return -1;
        }
        if(key ==arr[i]){
            return i;
        }
        
        return first_occ(arr, i+1, key);

    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5,4,6};
        int key=4;
        System.out.println(first_occ(arr, 0, key));
    }
    
}
// Finding first occurrence: When you only need the first match!
// Fun fact: Recursion naturally processes elements from left to right!
