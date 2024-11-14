package Questions;

// quetsion 2;
//in short answer

import java.util.*;

public class rotated {
    public static int search(int num[], int target) {
        int start = 0;
        int end = num.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (num[mid] == target) {
                return mid;
            }

            if (num[start] <= num[mid]) { // left
                if (num[start] <= target && target <= num[mid]) {
                    end = mid - 1;

                } else {
                    start = mid + 1;
                }
            } else {
                if (num[mid] <= target && target <= num[end]) {
                    start = mid + 1;

                } else {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 3;
        System.out.println("your indext at : " + search(num, target));

        sc.close();
    }
}