/*
 * File: Q1.java
 * Description: This program calculates the average of three numbers.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Declare and initialize multiple variables in a single line
 * - Perform arithmetic operations (addition and division)
 * - Calculate averages using integer division
 * - Display formatted output to the console
 * 
 * Note: This uses integer division, so decimal places will be truncated.
 */
public class Q1 {
     public static void main(String args[]) {
          int a = 4, b = 8, c = 2;
          int avg = (a + b + c) / 3;
          System.out.println("Average of three numbers is: " + avg);
     }
}
// Just your average, everyday Java program.
// Fun fact: The average of {4, 8, 2} is 4.67, but integer division truncates it to 4!