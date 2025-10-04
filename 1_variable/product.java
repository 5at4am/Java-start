/*
 * File: Product.java
 * Description: This program calculates the product of two numbers entered by the user.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Take user input using Scanner
 * - Perform multiplication operation
 * - Display formatted output
 * - Properly close Scanner resources
 */
import java.util.*;

public class product {
     public static void main(String args[]) {
          Scanner sc = new Scanner(System.in);
          System.out.print("enter number a: ");
          float a = sc.nextFloat();
          System.out.print("enter number b: ");
          float b = sc.nextFloat();
          float product = a * b;
          System.out.println("product of a and b is: " + product);
          sc.close();

     }
}
// It's a product of its environment.
// Fun fact: Multiplication is just repeated addition in disguise!