import java.util.*;

public class better {
    public static boolean sort(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = arr.length;
        if (n == 0 || n == 1) {
            System.out.println("Array is already sorted");
        } else {
            System.out.println(sort(arr, n));
        }

        sc.close();
    }
}