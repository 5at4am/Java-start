/*
 * File: SumInput.java
 * Description: This program calculates the sum of two numbers entered by the user.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Take integer input from the user using Scanner
 * - Perform addition operation
 * - Display formatted output
 * - Properly close Scanner resources to prevent resource leaks
 */
import java.util.*;
public class sum_input {
     public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.print("enter number a: ");
     int a= sc.nextInt();
     System.out.print("enter number b: ");
     int b=sc.nextInt();
     int sum = a+b;
     System.out.println("sum of a and b is: "+sum);
     sc.close();
}
}
// Some say the whole is greater than the sum of its parts.
// Fun fact: Addition is commutative: a + b = b + a. Math is beautiful!