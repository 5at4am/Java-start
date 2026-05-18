
public class two_pointer {

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[] { left + 1, right + 1 };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] { -1, -1 };
    }
    // find all unique pairs in an array that sum to a given target

    public static void two_sum_with_duplicate(int[] arr, int target) {

        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println(arr[left] + " " + arr[right]);
                while (left < right && arr[left] == arr[left + 1]) {
                    left++;
                }
                while (left < right && arr[right] == arr[right - 1]) {
                    right--;
                } 
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }

    public static void remove_duplicate(int[] arr) {

        int s = arr[0];
        int f = arr[1];
        while (f < arr.length) {
            if (arr[s] != arr[f]) {
                s++;
                arr[s] = arr[f];
            }
            f++;
        }
    }

    public static void main(String[] args) {

        // int[] arr = { 2, 7, 11, 15 };
        // int target = 9;
        // int[] result = twoSum(arr, target);
        // System.out.println("Indices: " + result[0] + ", " + result[1]);

        // int[] arr = { 1, 2, 2, 3, 4, 4, 5 };
        // remove_duplicate(arr);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // })

        int[] arr = { 1, 1, 2, 2, 4, 4, 5, 5, 7, 7, 8, 8, 9, 9, };
        int target = 9;
        two_sum_with_duplicate(arr, target);
        // System.out.println("Indices: " + result[0] + ", " + result[1]);

    }
}
