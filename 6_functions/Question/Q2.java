package Question;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int a = sc.nextInt();
        System.out.println("your number " + is_even(a));

        sc.close();

    }

    public static boolean is_even(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}