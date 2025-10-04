/*
 * File: Reverse.java
 * Description: This program reverses the digits of a hardcoded number using a while loop.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Use modulo operator to extract the last digit of a number
 * - Build a reversed number digit by digit
 * - Use a while loop to process all digits
 * - Divide by 10 to remove the last digit in each iteration
 * - Print intermediate steps of the reversal process
 * 
 * Algorithm: Extract last digit using %10, add to reversed number, remove digit using /10
 */
public class reverse {
    public static void main(String[] args) {

        int num = 12345;
        int rev =0;
        while (num>0) {
            int lastdigit = num%10;
            rev = rev*10+lastdigit;
            
            System.out.print(rev+"\t");

            num = num/10;


        }
        System.out.println("\n"+rev);
    }
}
// Reversing numbers: Digit by digit, from last to first!
// Fun fact: This algorithm can be used to check if a number is a palindrome!