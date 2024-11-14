import java.util.*;

public class stock {
    public static int price(int num[]) {

        int buying = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < num.length; i++) {
            if (buying < num[i]) {
                int profit = num[i] - buying;
                maxProfit = Math.max(maxProfit, profit);

            } else {
                buying = num[i];
            }
        }
        return maxProfit;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(price(num));
        sc.close();
    }
}