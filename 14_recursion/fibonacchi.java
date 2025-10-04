/*
 * File: Fibonacchi.java
 * Description: This program calculates the nth Fibonacci number using recursion.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Implement the Fibonacci sequence using recursion
 * - Use multiple base cases (n=0 returns 0, n=1 returns 1)
 * - Understand how recursive calls create a tree of computations
 * - See the mathematical definition implemented directly in code
 * 
 * Fibonacci definition:
 * - F(0) = 0, F(1) = 1
 * - F(n) = F(n-1) + F(n-2) for n > 1
 * 
 * Note: This implementation has exponential time complexity due to repeated calculations.
 * For better performance, consider using memoization or iterative approach.
 */
public class fibonacchi {
    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fib1 = fibo(n - 1);
        int fib2 = fibo(n - 2);
        int fibn = fib1 + fib2;
        return fibn;
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(fibo(n));
    }

}
// Fibonacci sequence: Nature's favorite recursive pattern!
// Fun fact: Fibonacci numbers appear in many natural phenomena, from flower petals to shell spirals!
