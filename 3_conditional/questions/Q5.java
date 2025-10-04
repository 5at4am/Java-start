/*
 * File: Q5.java
 * Description: This program determines if a user-entered year is a leap year using nested if statements.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Take year input from the user using Scanner
 * - Implement complex conditional logic for leap year calculation
 * - Use nested if statements for multi-level conditions
 * - Apply the rules for leap year determination:
 *   - Divisible by 4: possibly a leap year
 *   - Divisible by 100: not a leap year unless also divisible by 400
 *   - Divisible by 400: definitely a leap year
 * - Properly close Scanner resources
 * 
 * Leap Year Rules:
 * - If divisible by 400: leap year
 * - If divisible by 100 but not 400: not leap year
 * - If divisible by 4 but not 100: leap year
 * - Otherwise: not leap year
 */
package questions;

import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year");
                } else {
                    System.out.println(year + " is not a leap year");
                }
            } else {
                System.out.println(year + " is a leap year");
            }
        } else {
            System.out.println("not a leap year");
        }
        sc.close();
    }

}
// Leap years: Adding an extra day every 4 years to keep our calendar in sync!
// Fun fact: Without leap years, our calendar would drift by about 6 hours each year!
