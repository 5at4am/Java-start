/*
 * File: DoWhile.java
 * Description: This program demonstrates the use of a do-while loop to print a message 10 times.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Use a do-while loop which executes at least once
 * - Implement loop logic where the condition is checked after execution
 * - Print a message repeatedly until a condition is met
 * - Understand the difference between while and do-while loops
 * 
 * Do-while loops guarantee at least one execution of the loop body,
 * unlike regular while loops which check the condition first.
 */
public class do_while {
    public static void main(String[] args) {
        int n = 1;
        do {
            System.out.println("hello");
            ++n;
        } while (n <= 10);
    }
}
// Do-while loops: When you want to execute at least once, no matter what!
// Fun fact: Do-while loops are useful for menu systems where you want to show the menu at least once!
