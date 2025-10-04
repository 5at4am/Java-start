/*
 * File: Lexicography.java
 * Description: This program finds the lexicographically largest string in an array.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Use compareTo() method for lexicographical string comparison
 * - Find the lexicographically largest string in an array
 * - Understand how lexicographical ordering works (dictionary order)
 * - Properly close Scanner resources
 * 
 * Lexicographical comparison:
 * - compareTo() returns negative if first string is lexicographically smaller
 * - compareTo() returns positive if first string is lexicographically larger
 * - compareTo() returns 0 if strings are equal
 * - Comparison is based on Unicode values of characters
 */
import java.util.*;

public class lexicography {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str[] = { "Mango", "apple", "banana", "orange" };
        String largest = str[0];
        for (int i = 0; i < str.length; i++) {
            if (largest.compareTo(str[i]) < 0) {
                largest = str[i];
            }
        }
        System.out.println("lergest is : " + largest);
        sc.close();
    }
}
// Lexicographical comparison: When you need dictionary order for strings!
// Fun fact: Uppercase letters come before lowercase in Unicode (A-Z, a-z)!