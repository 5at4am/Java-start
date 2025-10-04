/*
 * File: Print100.java
 * Description: This program prints numbers from 0 to 100 followed by a greeting message using a while loop.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Initialize a counter variable
 * - Use a while loop to repeat actions
 * - Print formatted output combining numbers and text
 * - Increment the counter to avoid infinite loops
 * - Show different ways to increment a variable (commented examples)
 */
public class print_100
{
    public static void main(String args[])
    {
        int count = 0;
        while (count<=100) {
            System.out.println(count +"hello satyam");
            count++; // count = count+1 // count+=1

        }
        
    }
}
// Counting to 100 with a personal greeting - efficient or just fun?
// Fun fact: Increment operations can be done in multiple ways: count++, count += 1, or count = count + 1!