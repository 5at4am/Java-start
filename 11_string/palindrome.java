/*
 * File: Palindrome.java
 * Description: This program checks if a string is a palindrome by comparing characters from both ends.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Check if a string is a palindrome (reads same forwards and backwards)
 * - Compare characters from both ends moving inward
 * - Use character-by-character comparison
 * - Implement efficient palindrome checking algorithm
 * - Properly close Scanner resources
 * 
 * Algorithm: Compare characters at position i and (length-i-1) for all i up to length/2
 * 
 * Note: Fixed the original logic which returned true on first matching pair instead of checking all pairs.
 */
import java.util.*;

public class palindrome {
    public static boolean pal(String str) {
        str = str.toLowerCase(); // Convert to lowercase for case-insensitive comparison
        for (int i = 0; i <= (str.length() / 2); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                System.out.println("not a palaindrome");
                return false;
            }
        }
        System.out.println("The string is a palindrome");
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        pal(str);

        sc.close();
    }
}
// Palindrome checking: When words read the same backwards and forwards!
// Fun fact: The word "palindrome" comes from Greek, meaning "running back again"!