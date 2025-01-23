package Questions;

import java.util.*;

public class swap {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping the first number is : " + a);
        System.out.println("After swapping the second number is : " + b);

        sc.close();
    }
}
