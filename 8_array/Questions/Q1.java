package Questions;

import java.util.*;

public class Q1 {

    public static boolean twice(int num[]) {

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1[] = { 1, 2, 3, 1 };
        int num2[] = { 1, 2, 3, 4 };
        int num3[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        System.out.println(twice(num1));
        System.out.println(twice(num2));
        System.out.println(twice(num3));

        sc.close();
    }
}