/*
 * File: Array.java
 * Description: This program demonstrates basic array usage by storing and calculating marks for three subjects.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Declare and initialize an array with a fixed size
 * - Store values in specific array indices
 * - Access and retrieve values from array indices
 * - Calculate percentage from stored values
 * - Take user input to populate the array
 * - Properly close Scanner resources
 * 
 * Note: The array is declared with size 50 but only first 3 elements are used.
 * This demonstrates memory allocation and indexing in arrays.
 */
import java.util.*;
public class array 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[50];
        System.out.print("enter phy marks : ");
        marks[0]=sc.nextInt();
        System.out.print("enter chem marks : ");
        marks[1]=sc.nextInt();
        System.out.print("enter math marks : ");
        marks[2]=sc.nextInt();

        System.out.println("phy : "+marks[0]);
        System.out.println("chem : "+marks[1]);
        System.out.println("math : "+marks[2]);
        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage : "+percentage+"%");

        sc.close();
    }
}
// Arrays: The first step to managing collections of data!
// Fun fact: Arrays have fixed size and zero-based indexing (0, 1, 2, ... n-1)!