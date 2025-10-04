/*
 * File: Floyd.java
 * Description: This program prints Floyd's triangle pattern with consecutive numbers.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Create Floyd's triangle pattern with consecutive integers
 * - Use a counter variable that increments across rows
 * - Print increasing numbers of elements in each row
 * - Take user input for the number of rows
 * - Properly close Scanner resources
 * 
 * Floyd's Triangle: A right triangle of consecutive integers
 * where each row contains one more number than the previous row.
 * Example for n=4:
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 */
import java.util.*;
public class floyd 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number : ");
        int n = sc.nextInt();
        int count =1;
        for(int i=1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
        sc.close();
    }
}
// Floyd's Triangle: Named after Robert Floyd, a computer scientist!
// Fun fact: Each number in the triangle is one more than the previous number!