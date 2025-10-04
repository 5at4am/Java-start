package second_lar;

import java.util.Arrays;
import java.util.Scanner;

public class brute {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 4, 7, 7, 5 };

        Arrays.sort(arr);
        // to print array
        System.out.println("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nSecond smallest is : " + arr[1]);
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != arr[arr.length - 1]) {
                System.out.println("Second largest is : " + arr[i]);
                break;
            }
        }
        sc.close();
    }
}