package questions;

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number for factorial : ");
        int num = sc.nextInt();     // hold the number
        int fact= 1;                //hold factorial
        for (int i = 1; i <=num; i++) {
            fact *=i;
        }
        System.out.println("number = "+fact);

        sc.close();
    }
}
