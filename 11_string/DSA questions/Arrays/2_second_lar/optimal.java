import java.util.*;

public class optimal {
    public static int Sec_small(int arr[], int n) {
        if (n < 2) {
            return -1;
        }

        int small = Integer.MAX_VALUE;
        int sec_small = Integer.MAX_VALUE;
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] < small) {
                sec_small = small;
                small = arr[i];
            } else if (arr[i] < sec_small && arr[i] != small) {
                sec_small = arr[i];
            }

        }
        return sec_small;
    }

    public static int Sec_lar(int arr[], int n) {
        if (n < 2) {
            return -1;
        }

        int large = Integer.MIN_VALUE;
        int sec_large = Integer.MIN_VALUE;
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] > large) {
                sec_large = large;
                large = arr[i];
            } else if (arr[i] > sec_large && arr[i] != large) {
                sec_large = arr[i];
            }

        }
        return sec_large;

    }

    

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 1, 7, 7, 5 };
        int n = arr.length;
        System.out.println("Second smallest element is " + Sec_small(arr, n));
        System.out.println("Second largest element is " + Sec_lar(arr, n));

        sc.close();
    }
}