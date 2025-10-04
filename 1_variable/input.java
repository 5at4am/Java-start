/*
 * File: InputDemo.java
 * Description: This program demonstrates how to take input from the user using Scanner.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Use Scanner to read different types of input
 * - Read string, integer, and float values
 * - Handle input/output operations
 * 
 * Note: This program has a potential issue - mixing next() and nextLine() can cause
 * unexpected behavior due to how the Scanner handles line separators.
 */
import java.util.*;
public class input {
     public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          String input = sc.next();
          System.out.println("your name is : "+input);

          String name = sc.nextLine();
          System.out.println("name : "+name);


          int number = sc.nextInt();
          System.out.println("number "+number);

          float pi = sc.nextFloat();
          System.out.println("value "+pi);

          sc.close();
}
}
// I'm not listening to you, I'm just taking your input.
// Fun fact: Always remember to close your Scanner to prevent resource leaks!