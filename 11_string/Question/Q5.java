/*
 * File: Q5.java
 * Description: This program checks if two strings are anagrams of each other.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Check if two strings are anagrams (contain same characters in same frequency)
 * - Convert strings to lowercase for case-insensitive comparison
 * - Convert strings to character arrays for sorting
 * - Use Arrays.sort() and Arrays.equals() for comparison
 * - Handle different length strings efficiently
 * - Properly close Scanner resources
 * 
 * Anagram checking algorithm:
 * - First check if lengths are equal (if not, they can't be anagrams)
 * - Convert both strings to lowercase
 * - Convert to character arrays and sort them
 * - Compare sorted arrays for equality
 * 
 * Time complexity: O(n log n) due to sorting
 * Space complexity: O(n) for character arrays
 */
package Question;

import java.util.*;
public class Q5 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str1 = "earth";
        String str2 = "heart";
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length()==str2.length()){
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            boolean result = Arrays.equals(str1charArray, str2charArray);

            if(result){
                System.out.println("Anagrams");
            }
            else{
                System.out.println("Not Anagrams");
            }
        }else{
            System.out.println("Not Anagrams");
        }
        sc.close();
    }
}
// Anagram checker: When two words use the same letters!
// Fun fact: Earth and heart are anagrams - perfect for this example!