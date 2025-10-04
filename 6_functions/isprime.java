/*
 * File: IsPrime.java
 * Description: This program checks if a number is prime using a function that returns a boolean.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Create a function that returns a boolean value
 * - Implement prime number checking logic in a separate function
 * - Use a loop to check for factors of a number
 * - Use the break statement to optimize the function
 * - Take user input and display appropriate messages
 * - Properly close Scanner resources
 * 
 * Prime number definition: A number greater than 1 that is divisible only by 1 and itself.
 * Note: This implementation can be optimized further (e.g., check up to square root of n).
 */
import java.util.*;

public class isprime {
    public static boolean is_prime(int n) {
        boolean isprime = true;

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isprime = false;
                break;

            }
        }
        return isprime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if (is_prime(n)) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
        sc.close();
    }
}
// Prime number detection: The ancient art of identifying indivisible numbers!
// Fun fact: There are infinitely many prime numbers, and they're crucial in cryptography!
