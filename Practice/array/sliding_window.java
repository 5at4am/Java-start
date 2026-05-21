import java.util.HashMap;
import java.util.HashSet;

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

    public static void sum(int[] arr, int k) { // brute force
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

            sum -= arr[start];
            start++;

            sum += arr[end];
            end++;

            res = Math.max(res, sum);

        }

        System.out.println(res);

    }

    public static void maxSum(int[] arr, int k) {
        int low = 0, high = k, sum = 0;

        for (int i = 0; i < high; i++) {
            sum += arr[i];
        }
        // System.out.println(sum);

        int res = sum;

        while (high < arr.length) {

            // handle low 1st
            sum -= arr[low];
            low++;
            // handle high
            // if (high == arr.length) {
            // break;
            // }
            sum += arr[high];
            high++;
            res = Math.max(sum, res); // change the max -> min for minimum subarray sum
        }
        System.out.println(res);

    }

    public static void min_siz(int[] arr, int target) {
        int low = 0, high = 0, sum = 0;
        int res = Integer.MAX_VALUE;
        while (high < arr.length) {
            sum += arr[high];
            while (sum >= target) {
                int len = high - low + 1;
                res = Math.min(res, len);
                sum -= arr[low];
                low++;
            }
            high++;
        }
        System.out.println(res);
    }

    public static void distinct_char(String str, int k) {
        // if (k == 0)
        //     return 0;

        int low = 0;
        int res = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int high = 0; high < str.length(); high++) {
            char c = str.charAt(high);
            // Correct way to increment count in a HashMap
            map.put(c, map.getOrDefault(c, 0) + 1);
            while (map.size() > k) {
                char leftChar = str.charAt(low);
                map.put(leftChar, map.get(leftChar) - 1);

                // Check the frequency count, not the character value
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                low++;

            }
            int len = high - low + 1;
            res = Math.max(res, len);

        }
        System.out.println(res);
    }

    public static void duplicate(String str) {
        // if (k == 0)
        // return 0;

        int low = 0;
        int res = Integer.MAX_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int high = 0; high < str.length(); high++) {
            char c = str.charAt(high);
            // Correct way to increment count in a HashMap
            map.put(c, map.getOrDefault(c, 0) + 1);
            int k = high - low + 1;
            while (map.size() == k) {
                char leftChar = str.charAt(low);
                map.put(leftChar, map.get(leftChar) - 1);

                // Check the frequency count, not the character value
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                low++;
                k= high-low+1

            }
            int len = high - low + 1;
            res = Math.max(res, len);

        }
        System.out.println(res);
    }

    public static void main(String[] args) {

        int[] arr = { 3, 5, 6, 2, 4, -1, 1 };
        String str = "aaabbccd";
        int k = 2;
        // window(arr, k);
        // subarray(arr);
        // maxSum(arr, k);
        // sum(arr, k);
        // max(arr, k);
        // min_siz(arr, 11);
        // distinct_char(str, k);
        duplicate(str);
    }
}