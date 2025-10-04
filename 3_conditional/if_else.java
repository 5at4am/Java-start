/*
 * File: IfElse.java
 * Description: This program demonstrates conditional statements (if-else) in Java to determine voting eligibility and age groups.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Use Scanner for user input
 * - Implement multiple conditional statements
 * - Use logical operators (&&) in conditions
 * - Handle different age categories with conditional logic
 * - Properly close Scanner resources
 * 
 * Logic implemented:
 * - Age >= 18: Eligible for voting
 * - Age > 13 && < 18: Teenager
 * - Other cases: Not eligible
 */
import java.util.*;
public class if_else 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your age : ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("you are eligible for voting");
        }
        if (age>13 && age<18) {
            System.out.println("you are teenager");
            
        }else{
            System.out.println("your are not eligible");
        }
        sc.close();
    }
}
// Conditionals are the decision-makers of programming!
// Fun fact: Be careful with nested conditionals - they can sometimes lead to unexpected else behavior!