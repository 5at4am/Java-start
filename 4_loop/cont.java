/*
 * File: Cont.java
 * Description: This program demonstrates the use of the continue statement in a for loop.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Use a for loop to iterate through a range of numbers
 * - Implement the continue statement to skip specific iterations
 * - Show how continue affects loop execution flow
 * - Print numbers from 0 to 5, except 3 (which is skipped)
 * 
 * The continue statement skips the current iteration and proceeds to the next one.
 */
public class cont {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(" " + i);
        }
    }
}
// Continue statements: When you want to skip certain iterations!
// Fun fact: Continue is different from break - it skips the rest of current iteration but continues the loop!
