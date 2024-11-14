import java.util.*;

public class selection_sort {
    public static void selection(int num[]) {
        int n = num.length;
        for (int i = 0; i < n - 1; i++) {
            int small = i;
            for (int j = i + 1; j < n; j++) {
                if (num[small] > num[j]) {
                    small = j;
                }
            }
            int temp = num[small];
            num[small] = num[i];
            num[i] = temp;
        }
    }

    public static void arry_print(int num[]) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");

        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num[] = { 5, 4, 1, 3, 2 };
        selection(num);
        arry_print(num);
        sc.close();
    }
}