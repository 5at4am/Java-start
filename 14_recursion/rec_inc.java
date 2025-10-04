/*
 * File: RecInc.java
 * Description: This program prints numbers from 1 to n using recursive approach.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Implement recursive counting up from 1 to n
 * - Print numbers in increasing order using recursion
 * - Understand the difference between printing before vs after recursive call
 * - Implement base case for recursion termination
 * 
 * Algorithm:
 * - Recursively call with n-1 (go to smaller problem first)
 * - Then print current number (on the way back)
 * - Base case: when n reaches 1, print and return
 * 
 * Time complexity: O(n), Space complexity: O(n) for recursion stack
 */
public class rec_inc {

    public static void inc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        inc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n = 10;
        inc(n);
    }
    
}
// Recursive counting up: From 1 to n, building the sequence on return!
// Fun fact: This prints in ascending order by printing after the recursive call!
