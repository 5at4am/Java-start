/*
 * File: Swit.java
 * Description: This program demonstrates the use of switch-case statements in Java with a fun example.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Take integer input from the user using Scanner
 * - Implement switch-case conditional logic
 * - Use multiple case statements with break
 * - Implement default case handling
 * - Properly close Scanner resources
 * 
 * Switch cases implemented:
 * - Case 1: Print "one"
 * - Case 2: Print "two"
 * - Case 3: Print "three"
 * - Default: Print "'ZERO'"
 */
import java.util.*;
public class swit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("number of girlfriend you want ");
        int number = sc.nextInt();
        System.out.print("\nnumber of girlfriend you got ");
        switch (number){
            case 1:
            System.out.println("one");
            break;
            case 2:
            System.out.println("two");
            break;
            case 3:
            System.out.println("three");
            break;
            default:
            System.out.println("'ZERO'");
        }
        sc.close();
    }
}
// Switch cases provide a clean way to handle multiple conditions!
// Fun fact: Switch statements can be more efficient than multiple if-else statements for many cases!