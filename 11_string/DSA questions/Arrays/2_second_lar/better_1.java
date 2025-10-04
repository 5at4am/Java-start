package second_lar;

import java.util.*;

public class better_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 4, 7, 7, 5 };
        int max = arr[0];
        int sec_max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                sec_max = max;
                max = arr[i];
            } else if (sec_max < arr[i] && arr[i] != max) {
                sec_max = arr[i];
            }
        }
        System.out.println(max + " " + sec_max);
        sc.close();
    }
}