/*
 * File: Digit3.java
 * Description: This program compares three user-entered numbers to find the largest one.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Take three integer inputs from the user using Scanner
 * - Compare multiple values using logical operators (&&)
 * - Implement conditional logic to determine the maximum value
 * - Use if-else if-else structure for multiple comparisons
 * - Properly close Scanner resources to prevent resource leaks
 * 
 * Logic implemented:
 * - If A > B AND A > C: A is the largest
 * - Else if B > C: B is the largest
 * - Else: C is the largest
 */
import java.util.*;
public class digit_3 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);

        System.out.print("enter the 'A' number : ");
        int a = sc.nextInt();
        System.out.print("enter the 'B' number : ");
        int b = sc.nextInt();
        System.out.print("enter the 'C' number : ");
        int c = sc.nextInt();

        if((a>b)&&(a>c)){
            System.out.println("A is greater then B & C");
        }else if(b>c){
            System.out.println("B is greater then A & C ");
        }else{
            System.out.println("C is greater then A & B");
        }

        sc.close();
    }
}
// Finding the maximum of three numbers - a classic programming exercise!
// Fun fact: This algorithm can be extended to find the maximum of any number of values!