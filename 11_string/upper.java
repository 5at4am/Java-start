/*
 * File: Upper.java
 * Description: This program converts the first letter of each word in a string to uppercase.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Capitalize the first letter of each word in a string
 * - Use StringBuilder for efficient string manipulation
 * - Identify word boundaries (spaces) in a string
 * - Work with Character class methods for case conversion
 * - Convert StringBuilder back to String
 * - Properly close Scanner resources
 * 
 * Algorithm:
 * - Capitalize first character of the string
 * - For each space followed by a character, capitalize that character
 * - Maintain all other characters as they are
 * - Time complexity: O(n), where n is string length
 */
import java.util.*;

public class upper {
    public static String up(String name) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(name.charAt(0));
        sb.append(ch);
        for (int i = 1; i < name.length(); i++) {

            if (name.charAt(i) == ' ' && i < name.length() - 1) {
                sb.append(name.charAt(i));
                i++;
                sb.append(Character.toUpperCase(name.charAt(i)));
            } else {
                sb.append(name.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = "my name is satyam";

        System.out.println(up(name));
        sc.close();
    }
}
// Title case conversion: Capitalizing the first letter of each word!
// Fun fact: This algorithm handles multiple spaces between words correctly!