import java.util.*;

public class prefix_sum {
    public static void presum(int num[]) {
        int current = 0;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];

        prefix[0] = num[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];
        }

        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                current = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                if (max < current) {
                    max = current;
                }
            }
        }
        System.out.println("max sum = " + max);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num[] = { 1, -2, 6, -1, 3 };
        presum(num);

        sc.close();
    }
}