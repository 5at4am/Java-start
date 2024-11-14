import java.util.*;

public class factorial_recursion {
    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        fact(n);
        System.out.println("your factorial of " + n + " is : " + fact(n));
        sc.close();
    }
}
