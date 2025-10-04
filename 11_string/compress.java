
/*
 * File: Compress.java
 * Description: This program implements string compression by counting consecutive characters.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Implement run-length encoding compression for strings
 * - Count consecutive identical characters
 * - Use StringBuilder for efficient string manipulation
 * - Append character counts only when greater than 1
 * - Handle special characters and spaces in compression
 * - Properly close Scanner resources
 * 
 * Compression algorithm:
 * - Iterate through string, count consecutive characters
 * - Append character + count to result (if count > 1)
 * - Example: "aaabbccc" -> "a3b2c3"
 * - Time complexity: O(n), Space complexity: O(n)
 */
import java.util.*;

public class compress {
    public static StringBuilder comp(String str) {
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            char ch = str.charAt(i);

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(ch);
            if (count > 1) {
                sb.append(count);
            }
        }
        return sb;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = "aaabbcccd&&  22";
        System.out.println(comp(str));
        sc.close();
    }
}

// import java.util.Scanner;

// public class compress {
//     public static StringBuilder compress(String str) {
//         StringBuilder sb = new StringBuilder();

//         for (int i = 0; i < str.length(); i++) {
//             int count = 1;
//             char ch = str.charAt(i);

//             while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
//                 count++;
//                 i++;
//             }
//             sb.append(ch);
//             if (count > 1) {
//                 sb.append(count);
//             }
//         }
//         return sb;
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         String str = "aaabbcccdd";
//         System.out.println(compress(str));
//         sc.close();
//     }
// }
// String compression: Making long strings shorter with counts!
// Fun fact: This is a simple form of run-length encoding used in data compression!
