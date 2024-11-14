package Questions;

import java.util.*;

public class Q4 {
    public static int rainwater(int num[]) {
        int n = num.length;
        int res = 0, l = 0, r = n - 1;

        int rMax = num[r], lMax = num[l];

        while (l < r) {
            if (lMax < rMax) {
                l++;
                lMax = Math.max(lMax, num[l]);
                res += lMax - num[l];
            } else {
                r--;
                rMax = Math.max(rMax, num[r]);
                res += rMax - num[r];
            }
        }
        return res;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(" your storage is : " + rainwater(num));
        sc.close();
    }
}