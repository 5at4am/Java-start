/*
 * File: Equal.java
 * Description: This program demonstrates the difference between == and equals() for String comparison.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Understand the difference between == and .equals() operators
 * - Compare strings using reference equality (==) vs content equality (.equals())
 * - Work with string literals and String objects
 * - Properly close Scanner resources
 * 
 * Key concepts:
 * - == compares memory references (addresses)
 * - .equals() compares actual string content
 * - String literals are stored in string pool (same reference for identical literals)
 * - new String() creates new object in heap (different reference even if content is same)
 */
import java.util.*;

public class equal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s1 = "tony";
        String s2 = "tony";
        String s3 = new String("tony");

        if (s1 == s2) {
            System.out.println("it is quual");

        } else {
            System.out.println("it is not equal");
        }
        if (s1.equals(s3)) {
            System.out.println("it is equal");
        } else {
            System.out.println("it is not equal");
        }

        sc.close();
    }
}
// String comparison: When == and .equals() tell different stories!
// Important: Always use .equals() for content comparison, not == for strings!