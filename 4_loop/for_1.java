/*
 * File: For1.java
 * Description: This program demonstrates a for loop by printing a request for name input 10 times.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Use a for loop with initialization, condition, and increment
 * - Print a message multiple times using loop control
 * - Properly close Scanner resources even if not directly used in this example
 * - Understand the structure of for loops: for(initialization; condition; increment)
 */
import java.util.*;

public class for_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter your name");
        }

        sc.close();

    }
}
// For loops: When you know exactly how many times to repeat something!
// Fun fact: The three parts of a for loop (init, condition, increment) can be modified for different behaviors!
