/*
 * File: Insertionsort.java
 * Description: This program implements the insertion sort algorithm to sort an array.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Implement the insertion sort algorithm
 * - Use a key element to insert at correct position
 * - Shift elements to make space for the key
 * - Print sorted arrays using a helper function
 * - Properly close Scanner resources
 * 
 * Insertion Sort Algorithm:
 * - Start from the second element (i=1)
 * - Compare key with elements before it
 * - Shift larger elements to the right
 * - Insert key at correct position
 * - Time complexity: O(n²), Space complexity: O(1)
 * - Efficient for small or nearly sorted arrays
 */
import java.util.*;
public class insertionsort 
{
    public static void insertion(int num[]){
        for(int i=1;i<num.length;i++){
            int curr=num[i];
            int prev=i-1;
            while(prev>=0 && num[prev]>curr){
                num[prev+1]=num[prev];
                prev--;
                
            }
            num[prev+1]=curr;
        }
    }
    public static void arry_print(int num[]) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");

        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num[]={ 5,4,1,3,2};
        insertion(num);
        arry_print(num);
        sc.close();   
    }
}
// Insertion sort: Efficient for small or nearly sorted arrays!
// Fun fact: This algorithm works similarly to how we sort playing cards in our hand!