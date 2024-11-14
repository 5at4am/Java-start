package Questions;

import java.util.*;

public class Q2 {
    public static int search(int[] num, int target) {
        int min = min_search(num);
        // Check if target is within the range of the rotated array
        if (num[min] <= target && target <= num[num.length - 1]) {
            return search(num, min, num.length - 1, target); // Search in the right segment
        } else {
            return search(num, 0, min - 1, target); // Search in the left segment
        }
    }

    public static int search(int[] num, int left, int right, int target) {
        int l = left;
        int r = right;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (num[mid] == target) {
                return mid; // Target found
            } else if (num[mid] < target) {
                l = mid + 1; // Move to the right half
            } else {
                r = mid - 1; // Move to the left half
            }
        }
        return -1; // Target not found
    }

    public static int min_search(int[] num) {
        int left = 0;
        int right = num.length - 1;

        // Handle case when the array is not rotated
        if (num[left] < num[right]) {
            return 0; // The first element is the minimum
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid > 0 && num[mid - 1] > num[mid]) {
                return mid; // Found minimum element
            } else if (num[left] <= num[mid] && num[mid]>num[right]) {
                left = mid + 1; // Move right
            } else {
                right = mid-1; // Move left
            }
        }
        return left; // Return index of minimum element
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num[] = { 4, 5, 6, 7, 0, 1, 2 }; // Example rotated sorted array
        int target = 0; // Target to search for

        int result = search(num, target);

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found.");
        }

        sc.close();
    }
}
