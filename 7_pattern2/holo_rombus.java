/*
 * File: HoloRombus.java
 * Description: This program prints a hollow rhombus pattern using nested loops.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Create a hollow rhombus with stars on borders and spaces inside
 * - Use leading spaces to create the slanted sides of the rhombus
 * - Apply conditional logic to print stars only on the borders
 * - Take user input for the size of the rhombus
 * - Properly close Scanner resources
 * 
 * Pattern structure:
 * - Leading spaces decrease with each row: (n-i)
 * - Hollow rectangle logic for the inner part: print stars only on borders
 * - For each row, print stars on first/last row or first/last column
 */
import java.util.*;

public class holo_rombus {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();

        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");

            }
            for(int k=1;k<=n;k++){
                if(i==1||k==1||i==n||k==n){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
           
            System.out.println();
        }
        sc.close();
    }
}
// Hollow rhombus: Combining slanted sides with hollow interior!
// Fun fact: This pattern combines spacing logic with border detection!