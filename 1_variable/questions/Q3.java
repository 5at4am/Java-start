/*
 * File: Q3.java
 * Description: This program calculates the total cost of three items, including GST (Goods and Services Tax).
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Take floating-point input from the user using Scanner
 * - Perform arithmetic operations with decimal numbers
 * - Calculate tax (18% GST in this example)
 * - Compute final total with tax included
 * - Format and display financial calculations
 * - Properly close Scanner resources to prevent resource leaks
 * 
 * Tax calculation: GST = cost × 0.18
 * Final total = original cost + GST
 */
import java.util.*;

public class Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the prize of pencil : ");
        float pencil = sc.nextFloat();
        System.out.print("enter the prize of pen : ");
        float pen = sc.nextFloat();
        System.out.print("enter the prize of eraser : ");
        float eraser = sc.nextFloat();
        float cost = pencil + pen + eraser;
        System.out.println("total cost of stationery is : " + cost);
        float gst = cost * 0.18f;
        System.out.println("gst is : " + gst);
        float total_cost = cost + gst;
        System.out.println("total cost after gst is : " + total_cost);
        sc.close();
    }
}
// The only things certain in life are death and taxes. And maybe bugs.
// Fun fact: In many countries, calculating taxes accurately is essential for business applications!