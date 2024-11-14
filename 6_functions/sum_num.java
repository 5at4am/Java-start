import java.util.*;

public class sum_num {
    public static int sum1(int num1, int num2) { // parameter or formal parameter
        int c = num1 + num2;
        return c;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number");
        int a = sc.nextInt();
        System.out.print("Enter second number");
        int b = sc.nextInt();
        int sum = sum1(a, b); // argument or actual parameter
        System.out.println("your output is : " + sum);
        sc.close();

    }
}

// import java.util.*;
// public class sum_num {
// public static int sum(int a, int b){
// int c = a+b;
// return c ;
// }
// }
// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// System.out.println("enter the num for x : ");
// int a = sc.nextInt();
// System.out.println("enter the num for y : ");
// int b = sc.nextInt();
// sum(a, b);

// System.out.println("sum is : "+sum(a, b));

// }