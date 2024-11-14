package questions;

import java.util.*;

public class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number : ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("number is negative");
        } else {
            System.out.println("number is positive");
        }

        sc.close();

    }
}