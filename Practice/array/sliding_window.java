public class sliding_window {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 7, 3};
int k = 3, windowSum = 0, maxSum = 0;

for (int i = 0; i < k; i++) windowSum += arr[i];
maxSum = windowSum;

for (int i = k; i < arr.length; i++) {
    windowSum += arr[i] - arr[i - k];  // slide: add new, remove old
    maxSum = Math.max(maxSum, windowSum);
}
System.out.println(maxSum);
    }
}