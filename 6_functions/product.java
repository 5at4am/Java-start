/*
 * File: Product.java
 * Description: This program demonstrates function usage to calculate products of two numbers.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Create a function that multiplies two integers
 * - Return the product from the function
 * - Call the function with different sets of parameters
 * - Store the returned value in variables
 * - Show function reusability with different inputs
 * 
 * The prod function takes two integers, multiplies them, and returns the result.
 * The function is called twice with different values to demonstrate reusability.
 */
public class product {
    public static int prod(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String args[]) {
        int a = 2;
        int b = 4;

        int product = prod(a, b);
        System.out.println("product is : " + product);
        product = prod(3, 5);
        System.out.println("product is : " + product);
    }
}
// Multiplication functions: When you need to multiply numbers repeatedly!
// Fun fact: Functions can be called multiple times with different arguments!
