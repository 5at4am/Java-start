import java.util.*;

public class brute {
    public static boolean isaorted(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int n = arr.length;
        if (n == 0 || n == 1) {
            System.out.println("Array is already sorted");
        } else {
            System.out.println(isaorted(arr, n));
        }

        sc.close();
    }
}