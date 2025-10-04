/*
 * File: Inbuild.java
 * Description: This program demonstrates Java's built-in sorting methods using Arrays class.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Use Arrays.sort() for ascending order sorting
 * - Sort only a portion of an array using index parameters
 * - Sort in descending order using Collections.reverseOrder()
 * - Work with both primitive int arrays and Integer wrapper arrays
 * - Implement overloaded functions to handle different data types
 * 
 * Built-in sorting features:
 * - Arrays.sort(array): Sort entire array in ascending order
 * - Arrays.sort(array, fromIndex, toIndex): Sort portion of array
 * - Arrays.sort(array, Collections.reverseOrder()): Sort in descending order
 * - Arrays.sort(array, fromIndex, toIndex, Collections.reverseOrder()): Partial descending sort
 */
//import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class inbuild
{
    public static void arry_print(Integer num[]) {
        for (int i = 0; i < num.length; i++) { 
                      System.out.print(num[i] + " ");

        }
    }
    public static void arry_print(int num[]) {
        for (int i = 0; i < num.length; i++) { 
                      System.out.print(num[i] + " ");

        }
    }
    public static void main(String args[])
    {

        // Scanner sc = new Scanner(System.in);
        int num[]={5,4,1,3,2};
        Arrays.sort(num);
        System.out.println();
        arry_print(num);
        Arrays.sort(num,0,3);
        System.out.println();
        
        Integer arr[]={5,4,1,3,2};
        Arrays.sort(arr, Collections.reverseOrder());
        arry_print(arr);
        System.out.println();
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        arry_print(arr);
        // sc.close();
    }
}
// Built-in sort: When you want efficiency without implementing algorithms!
// Fun fact: Arrays.sort() uses optimized algorithms like Dual-Pivot Quicksort!