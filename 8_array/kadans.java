import java.util.*;

public class kadans {
    public static void kadan(int num[]) {
        int current = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            current = current + num[i];
            if (current < 0) {
                current = 0;
            }
            max = Math.max(current, max);
        }
        System.out.println("maximum of sub array : " + max);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadan(num);
        sc.close();
    }
}