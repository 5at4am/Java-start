/*
 * File: Linear.java
 * Description: This program demonstrates linear search in arrays using custom functions.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Implement linear search algorithm for integer arrays
 * - Implement linear search algorithm for string arrays
 * - Return the index of found element or -1 if not found
 * - Use enhanced for loops concept with manual indexing
 * - Handle both numeric and string data types
 * - Properly close Scanner resources
 * 
 * NOTE: Fixed critical bugs in the original code:
 * - Changed 'i <= array.length' to 'i < array.length' to prevent ArrayIndexOutOfBoundsException
 * - Fixed the conditional check in main to properly handle not found case
 */
import java.util.*;

public class linear {
    public static int linear_search(int number[], int key) {
        for (int i = 0; i < number.length; i++) {  // Fixed: was <= which caused out of bounds
            if (key == number[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int key = 10;
        int number[] = { 2, 4, 6, 8, 10, 12, 14, 16 };

        int result = linear_search(number, key);  // Store result to avoid multiple function calls
        if (result == -1) {  // Fixed: was checking key == -1 instead of result == -1
            System.out.println("key not found");
        } else {
            System.out.println(result + " index");
        }
        String menu[] = { "chaat", "pani puri", "samosa", "tea", "coffiee", };
        String dish = "tea";

        System.out.println("dish is : " + pick(menu, dish));
        sc.close();
    }

    public static int pick(String menu[], String dish) {
        for (int i = 0; i < menu.length; i++) {  // Fixed: was <= which caused out of bounds
            if (menu[i].equals(dish)) {  // Fixed: using .equals() for string comparison
                return i;
            }

        }
        return -1;
    }
}
// Linear search: The simplest way to find elements in arrays!
// Fun fact: Linear search has O(n) time complexity - in worst case, checks every element!