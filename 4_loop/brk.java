/*
 * File: Brk.java
 * Description: This program demonstrates the use of the break statement in a for loop.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Use a for loop to iterate through a range of numbers
 * - Implement the break statement to exit the loop early
 * - Show how break affects loop execution flow
 * - Print messages with incrementing numbers until a condition is met
 * 
 * The break statement exits the loop completely when the condition is met.
 */
public class brk {
    public static void main(String[] args) {
        int a = 10;
        for (int i = 1; i < a; i++) {

            System.out.println("hello" + i);
            if (i == 3) {
                break;
            }
        }
    }
}
// Break statements: When you need to exit a loop early!
// Fun fact: Break completely exits the loop, while continue just skips the current iteration!
