/*
 * File: Elif.java
 * Description: This program demonstrates the use of if-else if-else statements to categorize age groups.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Use if-else if-else conditional statements
 * - Implement multiple condition checks in sequence
 * - Categorize a person into age groups based on their age
 * - Properly structure nested conditional logic
 * 
 * Age categories implemented:
 * - Age >= 18: Adult
 * - Age >= 13: Teenager
 * - All other cases: Kid
 */
public class elif {
    public static void main(String[] args) {
        int age = 13;
        if (age >= 18) {
            System.out.println("You are an adult");
            } else if (age >= 13) {
                System.out.println("You are a teenager");
                } else {
                    System.out.println("You are a kid");
                }
    }
}
// Age is just a number, but categories help us understand stages of life!
// Fun fact: The order of conditions in if-else if chains matters - always check from most specific to least!