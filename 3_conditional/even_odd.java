/*
 * File: EvenOdd.java
 * Description: This program determines if a user-entered number is even or odd.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Take integer input from the user using Scanner
 * - Use the modulo operator (%) to check divisibility
 * - Implement if-else conditional logic
 * - Display appropriate output based on the condition
 * - Properly close Scanner resources to prevent resource leaks
 * 
 * Logic implemented:
 * - If number % 2 == 0: number is even
 * - Otherwise: number is odd
 */
import java.util.*;
public class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("number is even");
            } else {
                System.out.println("number is odd");
            }
        sc.close();
    }
    
}
// Even numbers are divisible by 2, odd numbers are not - simple math!
// Fun fact: The modulo operator (%) is very useful for checking divisibility!
