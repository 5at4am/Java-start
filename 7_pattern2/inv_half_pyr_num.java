/*
 * File: InvHalfPyrNum.java
 * Description: This program prints an inverted half pyramid pattern of numbers.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Create an inverted pyramid pattern using numbers
 * - Print decreasing count of numbers in each row
 * - Use nested loops with calculated range (n-i+1)
 * - Take user input for pyramid size
 * - Properly close Scanner resources
 * 
 * Pattern structure:
 * For n=5:
 * 12345
 * 1234
 * 123
 * 12
 * 1
 * 
 * The number of elements in each row is (n - i + 1)
 */
import java.util.*;

public class inv_half_pyr_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ente the num : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i+1; j++) {
                System.out.print(j);

            }
            System.out.println();
        }
        sc.close();
    }

}
// Inverted number pyramid: Numbers decreasing from top to bottom!
// Fun fact: Each row contains numbers from 1 to (n-i+1) in sequence!
