package Questions;

import java.util.*;

public class Q3 {
    public static int stock(int price[]) {
        int buy = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < price.length; i++) {
            // System.out.println(buy+" |");
            if (buy < price[i]) {
                profit = Math.max(price[i] - buy, profit);

            } else {
                buy = price[i];
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