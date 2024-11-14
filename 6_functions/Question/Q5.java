package Question;

import java.util.*;

public class Q5 {
    public static int sum(int a) {
        int sum = 0;
        while (a > 0) {
            int r = a % 10;
            sum += r;
            a /= 10;

        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the num you want the sum of : ");
        int a = sc.nextInt();

        System.out.println("your output is : " + sum(a));

        sc.close();

    }
}
