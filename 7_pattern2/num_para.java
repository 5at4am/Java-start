/*
 * File: NumPara.java
 * Description: This program prints a number pyramid pattern that increases and decreases in each row.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Create a complex number pattern with leading spaces
 * - Print descending numbers followed by ascending numbers in each row
 * - Calculate proper spacing for center alignment
 * - Take user input for pattern size
 * - Properly close Scanner resources
 * 
 * Pattern structure:
 * For n=4:
 *    1
 *   212
 *  32123
 * 4321234
 * 
 * Each row has: spaces, descending numbers, ascending numbers
 */
import java.util.*;
public class num_para 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = sc.nextInt();
        //left side
        for(int i=1;i<=n;i++){
            //space
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //decending
            for(int l=i;l>=1;l--){
                System.out.print(l);
            }
            //accending
            for(int m=2;m<=i;m++){
                System.out.print(m);
            }
            System.out.println();
        }

        
        
        sc.close();
    }
}
// Number pyramid with ascending and descending sequences!
// Fun fact: Each row creates a symmetric number pattern around its center!