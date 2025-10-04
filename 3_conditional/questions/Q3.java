/*
 * File: Q3.java
 * Description: This program takes a number (1-7) from the user and returns the corresponding day of the week.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Take integer input from the user using Scanner
 * - Implement switch-case logic for day lookup
 * - Use multiple case statements with breaks
 * - Handle invalid inputs with default case
 * - Properly close Scanner resources
 * 
 * Days of the week mapping:
 * - 1: Sunday, 2: Monday, 3: Tuesday, 4: Wednesday
 * - 5: Thursday, 6: Friday, 7: Saturday
 * - Default: Invalid number
 */
package questions;

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the weel number 1-7");
        int num = sc.nextInt();
        System.out.println("your week is : ");
        switch (num) {
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");
                break;
            default:
                System.out.println("invalid number");
        }

        sc.close();

    }

}
// Days of the week: The rhythm of our lives!
// Fun fact: The names of the days come from celestial bodies in many cultures!
