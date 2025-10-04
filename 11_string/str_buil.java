/*
 * File: StrBuil.java
 * Description: This program demonstrates StringBuilder usage by creating the alphabet string.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Use StringBuilder for efficient string concatenation
 * - Compare StringBuilder performance with regular string concatenation
 * - Build strings character by character efficiently
 * - Access StringBuilder length
 * - Understand when to use StringBuilder vs String
 * - Properly close Scanner resources
 * 
 * StringBuilder advantages:
 * - Mutable (unlike String which is immutable)
 * - More efficient for multiple concatenations
 * - Better performance than String for O(n²) operations
 * 
 * Time complexity: O(n) for StringBuilder vs O(n²) for String concatenation
 */
import java.util.*;

public class str_buil {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        // O(26) 
        // O(n^2) for regular string concatenation
        System.out.println(sb);
        System.out.println(sb.length());
        sc.close();
    }
}
// StringBuilder: Efficient string building for multiple operations!
// Fun fact: StringBuilder is mutable while String is immutable!