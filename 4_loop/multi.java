/*
 * File: Multi.java
 * Description: This program keeps asking for numbers until the user enters a multiple of 10.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Use a do-while loop with infinite condition (while true)
 * - Take integer input from the user using Scanner
 * - Check if a number is a multiple of 10 using modulo operator
 * - Use break statement to exit the infinite loop when condition is met
 * - Provide feedback to the user about their input
 * - Properly close Scanner resources
 * 
 * The program continues asking for input until a multiple of 10 is entered.
 */
import java.util.*;
public class multi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("enter the number : ");
            int n = sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n+" is not multiple of 10 \nTry again...");
        } while (true);
        sc.close();
    }
}
// Multiple of 10 checker: Keep trying until you get it right!
// Fun fact: Any number ending in 0 is a multiple of 10!
