/*
 * File: Prime.java
 * Description: This program checks if a user-entered number is prime using a for loop.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Take integer input from the user using Scanner
 * - Use a for loop to check for factors of a number
 * - Implement prime number checking logic
 * - Use boolean flags to track conditions
 * - Handle special cases (like number 2)
 * - Properly close Scanner resources
 * 
 * Note: Fixed a bug where '2' was incorrectly identified as not prime.
 * Prime numbers are numbers greater than 1 that are divisible only by 1 and themselves.
 */
import java.util.*;
public class prime {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("enter the prime no. : ");
         int n = sc.nextInt();
         if(n==2){
            System.out.println("is prime");
         }else{
            boolean isprime = true;  //assume number is prime
         for (int i = 2; i <= n -1; i++) { //loop 2 to n-1
            if(n%i==0){     // n is multiple of i (i not equal to 1 or n)
                isprime = false;    
            }
         }
         if(isprime==true){
            System.out.println("is prime");
         }else{
            System.out.println("is not prime");
         }

         }
         
         sc.close();
    }
}
// Prime numbers: The building blocks of all integers!
// Fun fact: 2 is the only even prime number - all other primes are odd!
