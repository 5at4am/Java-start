import java.util.*;

public class reverse {
    public static void reverse_num(int num[]) {
        int start = 0;
        int end = num.length - 1;
        while (start < end) {
            // swap
            int temp = num[end];
            num[end] = num[start];
            num[start] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num[] = { 2, 4, 6, 8, 10 };
        System.out.print("original num = ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        // print
        reverse_num(num);
        System.out.print("\nreverse num = ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        sc.close();
    }
}