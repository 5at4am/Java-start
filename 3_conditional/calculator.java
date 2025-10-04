/*
 * File: Calculator.java
 * Description: This program implements a basic calculator using switch-case for different operations.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Take two integer inputs from the user using Scanner
 * - Take an operator input using Scanner
 * - Implement multiple arithmetic operations using switch-case
 * - Handle different operations: addition, subtraction, multiplication, division, modulo
 * - Implement default case for invalid operators
 * - Properly close Scanner resources
 * 
 * Operations supported:
 * - Addition (+), Subtraction (-), Multiplication (*), Division (/), Modulo (%)
 */
import java.util.*;
public class calculator {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    int num1 = sc.nextInt();
    
    System.out.print("\nEnter the second number: ");
    int num2 = sc.nextInt();
    
    System.out.println("\nchosse the operator \n 1. + \n 2. -\n 3. * \n 4. / \n 5. % ");
    
    System.out.print("\ninter the opertaor :");
    char op = sc.next().charAt(0);
    
    int result = 0;
    
    switch (op) {
        case '+':
        result = num1 + num2;
        System.out.println(result);    
        break;
    
        case '-':
        result = num1 - num2;
        System.out.println(result);
        break;
    
        case '*':
        result = num1 * num2;
        System.out.println(result);
        break;
    
        case '/':
        result = num1/num2;
        System.out.println(result);
        break;
    
        case '%':
        result = num1%num2;
        System.out.println(result);
        break;
    
        default:
        System.out.println("enter the number given above");
    }
    sc.close();
    }   
}
// Calculators: Making math easier since the digital age!
// Fun fact: This is a basic implementation - real calculators handle more complex operations!