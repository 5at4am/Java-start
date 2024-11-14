import java.util.*;

public class max_subarray {
    public static void maxsub(int num[]) {
        int current = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                current = 0;
                for (int k = i; k <= j; k++) {

                    // sub array sum
                    current += num[k];
                }
                System.out.print(current + " ");
                if (max < current) {
                    max = current;
                }
            }
            System.out.println();
        }
        System.out.println("MAximum sum  = " + max);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num[] = { 1, -2, 6, -1, 3 };
        maxsub(num);
        // System.out.println(num);
        sc.close();
    }
}