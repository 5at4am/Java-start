import java.util.*;

public class brute {
    public static void rotate(int arr[], int n, int k) {
        if (n == 0) {
            return;
        }
        k = k % n;
        if (k == 0)
            return;
            

        // Step 1: Store the first k elements in a temporary array
        int temp[] = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        // Step 2: Shift the remaining elements to the front
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }
        // Step 3: Put the elements from temp back into arr
        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;
        int k = 3;
        rotate(arr, n, k);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}