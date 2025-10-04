/*
 * File: Character.java
 * Description: This program prints a character pattern based on user input, using consecutive letters.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Take integer input from the user using Scanner
 * - Use nested for loops to create character patterns
 * - Print consecutive alphabetic characters in increasing rows
 * - Increment character values using ASCII arithmetic
 * - Move to the next line after each row
 * - Properly close Scanner resources
 * 
 * Pattern created: Each row contains consecutive letters starting from 'A',
 * with the sequence continuing across rows.
 * Example for n=3:
 * A
 * BC
 * DEF
 */
// This program prints a character pattern based on user input.
import java.util.*;

public class character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (char j = 1; j <= i; j++) {

                System.out.print(ch);
                ch++;
            }
            System.out.println();

        }

        sc.close();
    }
}
// Hope you enjoyed the character pattern!
// Fun fact: Characters can be incremented just like numbers using their ASCII values!