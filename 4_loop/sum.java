/*
 * File: Sum.java
 * Description: This program calculates the sum of numbers from 0 to n using a while loop.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Take integer input from the user using Scanner
 * - Use a while loop to iterate through a range of numbers
 * - Calculate cumulative sum incrementally
 * - Display the addition sequence as it calculates
 * - Properly close Scanner resources
 * 
 * Algorithm: Sums all integers from 0 to n (inclusive)
 */
import java.util.*;
public class sum {
    public static void main(String[] args) {



    Scanner sc = new Scanner(System.in);

        int num = 0;
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        int sum = 0;

        while (num<=n) {
            System.out.print(num+" + ");
            sum +=num;
            num++;
            
        }
        System.out.print("  =  "+sum);
        sc.close();
    }
}
// Adding up numbers: From 0 to n, one at a time!
// Fun fact: There's also a mathematical formula for this: sum = n*(n+1)/2!