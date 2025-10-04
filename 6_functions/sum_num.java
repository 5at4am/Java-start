/*
 * File: SumNum.java
 * Description: This program demonstrates function creation with parameters and return values for addition.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Create a function with parameters (formal parameters)
 * - Return a value from a function
 * - Call a function with arguments (actual parameters)
 * - Take user input using Scanner
 * - Pass values to functions and receive return values
 * - Properly close Scanner resources
 * 
 * The sum1 function takes two integers, adds them, and returns the result.
 * The main function gets user input, calls the sum function, and displays the result.
 */
import java.util.*;

public class sum_num {
    public static int sum1(int num1, int num2) { // parameter or formal parameter
        int c = num1 + num2;
        return c;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number");
        int a = sc.nextInt();
        System.out.print("Enter second number");
        int b = sc.nextInt();
        int sum = sum1(a, b); // argument or actual parameter
        System.out.println("your output is : " + sum);
        sc.close();

    }
}

// import java.util.*;
// public class sum_num {
// public static int sum(int a, int b){
// int c = a+b;
// return c ;
// }
// }
// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// System.out.println("enter the num for x : ");
// int a = sc.nextInt();
// System.out.println("enter the num for y : ");
// int b = sc.nextInt();
// sum(a, b);

// System.out.println("sum is : "+sum(a, b));

// }
// Functions with parameters and return values: The power of reusability!
// Fun fact: Parameters allow functions to work with different values each time they're called!