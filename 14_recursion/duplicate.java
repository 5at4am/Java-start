/*
 * File: Duplicate.java
 * Description: This program removes duplicate characters from a string using recursion and a boolean map.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Use recursion to traverse a string character by character
 * - Remove duplicate characters using a boolean array as a map
 * - Build a result string with StringBuilder during recursion
 * - Handle character indexing with 'a' as base (assumes lowercase letters)
 * 
 * Algorithm:
 * - Base case: When index reaches string length, print the result
 * - If character is already seen (map[curr-'a'] is true), skip it
 * - If new character, mark it as seen and append to result
 * - Recursively process the next character
 * 
 * Time complexity: O(n), Space complexity: O(n) for recursion and boolean array
 */
public class duplicate {

    public static void dupl(String str, int idx, StringBuilder sb, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(sb.toString());
            return;
        }
        char curr = str.charAt(idx);
        if (map[curr - 'a'] == true) {
            dupl(str, idx + 1, sb, map);
        } else {
            map[curr - 'a'] = true;
            dupl(str, idx + 1, sb.append(curr), map);
        }
    }

    public static void main(String[] args) {
        String str = "satyamraj";
        dupl(str, 0, new StringBuilder(""), new boolean[26]);

    }

}
// Removing duplicates recursively: A character-by-character journey!
// Fun fact: This approach uses boolean array to track seen characters efficiently!
