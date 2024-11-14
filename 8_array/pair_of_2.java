import java.util.*;

public class pair_of_2 {
    public static void pair(int num[]) {
        int total_pair = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                System.out.print(" (" + num[i] + "," + num[j] + ")");
                total_pair++;
            }
            System.out.println();
        }
        System.out.println("total pair = "+total_pair);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num[] = { 2, 4, 6, 8, 10 };
        pair(num);
        System.out.println(num);
        sc.close();
    }
}