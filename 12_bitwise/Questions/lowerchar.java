/*
 * File: Lowerchar.java
 * Description: This program converts uppercase letters to lowercase using bitwise operations.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Convert uppercase letters to lowercase using bitwise OR with space
 * - Understand ASCII relationships between uppercase and lowercase letters
 * - The difference between uppercase and lowercase letters is bit 5 (32 in decimal)
 * - Use bitwise OR to set the 6th bit and make letters lowercase
 * - Properly close Scanner resources
 * 
 * Bitwise logic:
 * - Uppercase letters A-Z are ASCII 65-90
 * - Lowercase letters a-z are ASCII 97-122
 * - Difference is 32 (bit 5 set), so OR with 32 (or space ' ' which is 32) converts
 * - ch | 32 or ch | ' ' will convert uppercase to lowercase
 */
package Questions;

import java.util.*;
public class lowerchar 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the character : ");
        // char ch = sc.next().charAt(0);
        // System.out.println("The lowercase of "+ch+" is "+(char)(ch|32));

        for(char ch = 'A'; ch <= 'Z'; ch++)
        {
             //System.out.println("The lowercase of "+ch+" is "+(char)(ch|32));

             System.out.println((char) (ch|' '));   // ' '(space) is 32 in ascii
        }


        sc.close();
    }
}
// Converting to lowercase with bitwise operations: When | ' ' does the job!
// Fun fact: Space character has ASCII value 32, which is the difference between upper and lower!