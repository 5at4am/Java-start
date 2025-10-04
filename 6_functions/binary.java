/*
 * File: Binary.java
 * Description: This program converts a binary number to its decimal equivalent using a function.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Create a function to convert binary to decimal
 * - Use modulo and division operations to extract digits
 * - Apply the power of 2 to calculate decimal value
 * - Use Math.pow for exponentiation
 * - Take user input and call the conversion function
 * - Properly close Scanner resources
 * 
 * Algorithm: Extract each digit from right to left, multiply by 2^position, and sum up
 * Note: Fixed the output to show the original binary number since it's modified during conversion.
 */
import java.util.*;

public class binary {
    public static void bina(int binary) {
        int dec = 0;
        int pow = 0;
        int originalBinary = binary; // Store original to display in output
        while (binary > 0) {
            int ld = binary % 10;
            dec = dec + (ld * (int) Math.pow(2, pow));
            pow++;
            binary = binary / 10;

        }
        System.out.println("decimal of " + originalBinary + " is : " + dec);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the binary number");
        int binary = sc.nextInt();

        bina(binary);
        sc.close();
    }
}
// Binary to decimal conversion: Understanding how computers interpret numbers!
// Fun fact: Each binary digit's value is determined by its position (2^position)!
