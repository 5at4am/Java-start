/*
 * File: Ternary.java
 * Description: This program demonstrates the use of ternary operators in Java for conditional assignments.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Use the ternary (conditional) operator for concise conditional assignments
 * - Compare values and assign the larger one using ternary operator
 * - Determine if a number is even or odd using the ternary operator
 * - Use SuppressWarnings annotation when variables are not used
 * 
 * Ternary operator syntax: condition ? value_if_true : value_if_false
 */
public class ternary {
    public static void main(String[] args) {
        
        @SuppressWarnings("unused")
        int larger = (5>3)?5:3;
        System.out.println(larger);

        int number = 1243244;

        String type = ((number%2)==0)?"even":"odd";
        System.out.println(type);
        
    }

}
// Ternary operators: When you want to be concise but readable!
// Fun fact: Ternary operators are the only operators in Java that take three operands!