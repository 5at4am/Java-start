/*
 * File: Twice.java
 * Description: This program checks if there are duplicate elements in an array.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Check for duplicate elements in an array using nested loops
 * - Implement a function that returns a boolean value
 * - Use nested for loops to compare all pairs of elements
 * - Return true as soon as a duplicate is found
 * - Return false if no duplicates are found after checking all pairs
 * - Properly close Scanner resources
 * 
 * Algorithm: Nested loop approach
 * - Compare each element with all subsequent elements
 * - Return true immediately when a duplicate is found
 * - Time complexity: O(n²), Space complexity: O(1)
 * 
 * Note: For better performance with large arrays, consider using a HashSet
 * which would give O(n) time complexity.
 */
import java.util.*;
//? question is to check if there are two same numbers in the array
//? if there are two same numbers then return true else return false
public class twice 
{
    public static boolean two(int arr[],int n){
        for(int i= 0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if (arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num1[] = { 1, 2, 3, 1 };
        int n = num1.length;
        System.out.println(two(num1,n));
        sc.close();
    }
}
// Duplicate detection: Finding repeated elements in arrays!
// Fun fact: This is a classic example of the pigeonhole principle in action!