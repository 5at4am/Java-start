package Question;

import java.util.*;

public class Q1 {
    public static double avg(double a, double b, double c) {
        double avg = (a + b + c) / 3;
        return avg;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        double a = sc.nextDouble();
        System.out.println("Enter second number");
        double b = sc.nextDouble();
        System.out.println("Enter third number");
        double c = sc.nextDouble();

        System.out.println("your output is : " + avg(a, b, c));
        sc.close();

    }
}
