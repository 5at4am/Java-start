package second_lar;

import java.util.*;

public class better {
    public static void get_element(int arr[], int n) {

        if (n == 0 || n == 1) {
            System.out.println("Invalid input");
            return;
        }
        int largest = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        int Smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            largest = Math.max(largest, arr[i]);
            Smallest = Math.min(Smallest, arr[i]);
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > second_large && arr[i] != largest) {
                second_large = arr[i];
            }
            if (arr[i] < second_smallest && arr[i] != Smallest) {
                second_smallest = arr[i];
            }
        }
        System.out.println("laegest is " + second_large);
        System.out.println("smallest is " + second_smallest);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 4, 6, 7, 7, 5 };
        int n = arr.length;
        get_element(arr, n);

        sc.close();
    }
}