/*
 * File: Tax.java
 * Description: This program calculates tax based on income brackets using conditional statements.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Take income input from the user using Scanner
 * - Implement multiple conditional branches (if-else if-else)
 * - Calculate tax based on different income brackets
 * - Display both tax amount and net income after tax
 * - Properly close Scanner resources
 * 
 * Tax brackets implemented:
 * - Income < 500,000: No tax (0%)
 * - Income 500,000-1,000,000: 20% tax
 * - Income > 1,000,000: 30% tax
 */
import java.util.*;
public class tax {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your income: ");
        int income = sc.nextInt();
        int tax;

        if (income<500000){
            System.out.println("You are exempted from tax");
            tax =0;

        }else if(income>=500000 && income<=1000000){
            tax =  (int) (income * 0.2);
            System.out.println("Your tax is: "+tax);
            System.out.println("your actual income in hand is " + (income-tax));

        }else{
            tax = (int) (income * 0.3);
            System.out.println("Your tax is: "+tax);
            System.out.println("your actual income in hand is " + (income-tax));
        }
        sc.close();
    }
}
// Taxes: The only thing certain in life besides death!
// Fun fact: Progressive tax systems like this are used in many countries to ensure fairness!