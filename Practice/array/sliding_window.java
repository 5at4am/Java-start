public class sliding_window {

    public static void window(int[] arr, int k) {
        int windowSum = 0, maxSum = 0;

        for (int i = 0; i < k; i++)
            windowSum += arr[i];
        maxSum = windowSum;

        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k]; // slide: add new, remove old
            maxSum = Math.max(maxSum, windowSum);
        }
        System.out.println(maxSum);

    }

    public static void subarray(int[] arr) { // its time complexity is O(n^2)
        int start = 0, end = 0;
        while (start <= arr.length - 1) {
            for (int i = start; i <= end; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            end++;
            if (end == arr.length) {
                start++;
                end = start;
            }
        }

    }

    public static void sum(int[] arr, int k) {
        int start = 0;
        int max = 0;
        for (int i = 0; i < arr.length - k; i++) {
            int sum = 0;
            for (int j = start; j < start + k; j++) {
                sum = sum + arr[j];
            }
            max = Math.max(max, sum);
            start++;
        }
        System.out.println(max);

    }

    public static void max(int[] arr, int k) {
        int start = 0, end = k, res = 0, sum = 0;
        for (int i = start; i < end; i++) {
            sum += arr[i];
        }
        res = sum;
        while (end < arr.length) {
            
            sum -= arr[start ];
            start++;
            
            sum += arr[end];
            end++;

            res = Math.max(res, sum);

        }

        System.out.println(res);

    }

    public static void main(String[] args) {

        int[] arr = { 2, 1, 5, 1, 3, 2 };
        int k = 4;
        // window(arr, k);
        // subarray(arr);
        max(arr, k);
    }
}