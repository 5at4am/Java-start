/*
 * File: UserNum.java
 * Description: This program prints numbers from 1 to n (user-defined) using a while loop.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Take integer input from the user using Scanner
 * - Use a while loop with a user-defined upper limit
 * - Print numbers in sequence from 1 to n
 * - Increment the counter to avoid infinite loops
 * - Properly close Scanner resources
 */
import java.util.*;

public class user_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 1;
        int n = sc.nextInt();

        while (num<=n) {
            System.out.print(" "+num);
            num++;
            
        }
        sc.close();
    }
}
// Printing numbers from 1 to n - custom range counting!
// Fun fact: This is similar to num1_10.java but with a dynamic upper limit!
