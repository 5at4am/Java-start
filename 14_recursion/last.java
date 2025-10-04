/*
 * File: Last.java
 * Description: This program finds the last occurrence of a key in an array using recursion.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Implement recursive search to find the last occurrence
 * - Use recursion to traverse to the end first, then check on the way back
 * - Understand how recursion processes elements from right to left for this case
 * - Return the rightmost index of the key or -1 if not found
 * 
 * Algorithm:
 * - Recursively search the rest of the array first (i+1)
 * - When returning from recursion, check if key was found in later positions
 * - If not found later but current position has the key, return current index
 * - This ensures we get the rightmost occurrence
 * 
 * Time complexity: O(n), Space complexity: O(n) for recursion stack
 */
public class last {

    public static int lastoc(int arr[], int i, int key) {

        if (i == arr.length) {
            return -1;
        }
        int isfound = lastoc(arr, i + 1, key);

        if (isfound == -1 && arr[i] == key) {
            return i;
        }
        return isfound;
    }

    // public static int first_occ(int arr[], int i, int key) {
    // i = arr.length - 1;

    // if (i == 1) {
    // return 0;
    // }
    // if (key == arr[i]) {
    // return i;
    // }
    // if (key != arr[i]) {
    // return -1;
    // }

    // return first_occ(arr, i - 1, key);

    // }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 1, 1, 1 };
        int key = 1;
        System.out.println(lastoc(arr, 0, key));
    }

}
// Finding the last occurrence: When you want the rightmost match!
// Fun fact: This recursive approach naturally finds the last occurrence by checking the end first!
