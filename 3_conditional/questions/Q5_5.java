/*
 * File: Q5_5.java
 * Description: This program determines if a user-entered year is a leap year using boolean logic and compound conditions.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Take year input from the user using Scanner
 * - Store boolean conditions in variables for clarity
 * - Use compound conditions with logical operators (&&, ||)
 * - Implement leap year logic in a more concise way than nested if statements
 * - Apply the rules for leap year determination
 * - Properly close Scanner resources
 * 
 * Leap Year Logic:
 * - A year is a leap year if (divisible by 4) AND (divisible by 100 OR divisible by 400)
 * - This is a more compact version of the traditional nested if approach
 */
package questions;

import java.util.*;

public class Q5_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("input the year");
        int year = sc.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) == 0;
        boolean z = (year % 400) == 0;

        if (x && (y || z)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

        sc.close();
    }
}
// Boolean logic: Making leap year calculations more readable!
// Fun fact: This compact logic is equivalent to the nested if approach but more elegant!