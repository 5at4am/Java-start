/*
 * File: Q1.java
 * Description: This program counts vowels in a string and demonstrates string operations.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Count vowels in a given string by iterating through characters
 * - Use charAt() method to access individual characters
 * - Compare characters to vowels using logical operators
 * - Demonstrate String.equals() method for content comparison
 * - Show String.replace() method for character replacement
 * - Properly close Scanner resources
 * 
 * Multiple exercises in one file:
 * - Exercise 1: Count vowels in a string
 * - Exercise 2: Compare strings using .equals()
 * - Exercise 3: Replace characters in a string
 */
package Question;

import java.util.*;

public class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = " satyam raj is a mesmarizing person";
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("Number of vowels in the string is: " + count);
        sc.close();

        System.out.println();
        System.out.println();

        // Question 2;

        String str = "Hello, World!";
        String Str1 = "Hello";
        String Str2 = "Hello, World!";
        System.out.println(str.equals(Str1) + " " + str.equals(Str2));
        System.out.println();

        // Question 3;

        String na = "Apna Collage".replace("l", "_");
        System.out.println(na);
    }
}
// Vowel counting and string operations: Multiple exercises in one!
// Fun fact: This program demonstrates several string manipulation techniques!