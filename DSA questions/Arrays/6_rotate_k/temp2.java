public class temp2 {
    public static void rotate(int arr[], int n, int k) {
        k %= n;
        if (k == n) {
            return;
        }
        int temp[] = new int[n];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        for (int i = k; i < n; i++) {
            arr[n - i] = temp[i];
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;
        int k = 8;

        rotate(arr, n, k);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}