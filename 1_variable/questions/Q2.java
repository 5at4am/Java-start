/*
 * File: Q2.java
 * Description: This program calculates the area and perimeter of a square.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Take integer input from the user using Scanner
 * - Perform mathematical calculations (squaring and multiplication)
 * - Calculate area (side²) and perimeter (4 × side) of a square
 * - Display formatted output with proper labels
 * - Properly close Scanner resources to prevent resource leaks
 * 
 * Formulas used:
 * Area of square = side × side
 * Perimeter of square = 4 × side
 */
import java.util.*;

public class Q2 {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("enter the side of square to dind the area : ");

      int side_of_square = sc.nextInt();
      int area = side_of_square * side_of_square;
      int parameter = 4 * side_of_square;
      System.out.println("area of square is : " + area);
      System.out.println("parameter of square is : " + parameter);
      sc.close();
   }
}
// Don't be a square, be a rhombus.
// Fun fact: A square is a special type of rhombus where all angles are 90 degrees!