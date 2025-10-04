/*
 * File: Q3.java
 * Description: This program calculates the maximum profit from buying and selling stocks.
 * Author: Satyam Raj
 * Date: October 2025
 * 
 * Purpose: This program demonstrates how to:
 * - Find the maximum profit from a single stock transaction
 * - Track the minimum buying price seen so far
 * - Calculate potential profit at each price point
 * - Update maximum profit when a better opportunity is found
 * - Properly close Scanner resources
 * 
 * Algorithm (Kadane's variant):
 * - Keep track of the lowest price (buy) seen so far
 * - For each price, calculate potential profit (current - buy price)
 * - Update maximum profit if current profit is better
 * - Update the buy price if current price is lower
 * 
 * Time complexity: O(n)
 * Space complexity: O(1)
 */
package Questions;

import java.util.*;

public class Q3 {
    public static int stock(int price[]) {
        int buy = Integer.MAX_VALUE;  // Minimum price to buy
        int profit = 0;               // Maximum profit achieved
        for (int i = 0; i < price.length; i++) {
            // System.out.println(buy+\" |\");
            if (buy < price[i]) {
                profit = Math.max(price[i] - buy, profit);  // Calculate max profit

            } else {
                buy = price[i];  // Update minimum buy price
            }

        }
        return profit;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int price[] = { 7, 5, 4, 2, 1, 5, 3, 6, 4, 0 };
        System.out.println("your profit is : " + stock(price));

        sc.close();
    }
}
// Stock profit maximization: Buy low, sell high for maximum gain!
// Fun fact: This algorithm efficiently finds the best buy-sell pair in one pass!