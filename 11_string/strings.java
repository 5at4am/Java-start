/*
 * File: Strings.java
 * Description: This program demonstrates various String operations and methods in Java.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Create strings using literals and new keyword
 * - Access string characters using charAt()
 * - Get string length using length() method
 * - Concatenate strings using + operator
 * - Iterate through string characters
 * - Understand string immutability
 * - Compare string creation methods
 * - Properly close Scanner resources
 * 
 * Key String concepts:
 * - Strings are immutable in Java
 * - Different ways to create strings: literals vs new keyword
 * - Common string methods: charAt(), length(), concatenation
 */
import java.util.*;

public class strings {
    public static void printletter(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    } 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char arr[] = { 'a', 'b', 'c', 'd' };
        String str = "abcd";
        String str2 = new String("xyz");
        System.out.println(arr[0]);
        System.out.println(str);
        System.out.println(str2);

        // strings are immutable

        // String str3 =sc.nextLine();
        // System.out.println(str3);

        // length .length()
        String full_name = "Tony Stark";
        System.out.println(full_name.length());

        // concatenation
        String first = "satyam";
        String last = "raj";
        String full = first + " " + last;
        System.out.println(full);
        System.out.println(full.charAt(2));

        printletter(full);

        sc.close();
    }
}
// String operations: The fundamentals of text processing in Java!
// Fun fact: Once a String is created, it cannot be changed (immutable)!