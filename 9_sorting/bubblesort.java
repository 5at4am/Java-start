import java.util.*;

public class bubblesort {
    public static void buble(int num[]) {
        int n = num.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j <= n - 2 - i; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            } 
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
        
        buble(num);
        arry_print(num);

        sc.close();
    }
}