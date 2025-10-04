/*
 * File: Substring.java
 * Description: This program demonstrates substring extraction using both custom implementation and built-in method.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Implement custom substring extraction algorithm
 * - Use built-in substring() method
 * - Understand substring extraction logic and indices
 * - Compare custom vs built-in implementations
 * - Properly close Scanner resources
 * 
 * Substring concepts:
 * - Extract substring from index 'si' to 'ei-1' (exclusive end)
 * - substring(si, ei) returns characters from index si to ei-1
 * - Custom implementation shows the algorithm behind the built-in method
 * 
 * Note: Custom implementation is inefficient due to string concatenation in loop.
 * Use built-in substring() method for better performance.
 */
import java.util.*;

public class substring {
    public static String stustr(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }  
        return substr;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String str = "Hello world";
        int si = 0, ei = 4;
        System.out.println(stustr(str, si, ei));
        System.out.println(str.substring(3, 7));

        // System.out.println("Enter the string");
        // String str = sc.nextLine();
        // System.out.println("Enter the starting index");
        // int start = sc.nextInt();
        // System.out.println("Enter the ending index");
        // int end = sc.nextInt();
        // String sub = str.substring(start, end);
        // System.out.println("Substring is: " + sub);
        sc.close();
    }
}
// Substring extraction: When you only need part of a string!
// Fun fact: Built-in substring() method is optimized and more efficient!