import java.util.Scanner;

public class opt_prime {
    public static boolean opt_prim(int n) {
        // Check if n is less than 2, as 0 and 1 are not prime numbers
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Not a prime number
            }
        }
        return true; // It's a prime number
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char yes;

        do {
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            System.out.println(opt_prim(n));

            System.out.print("Do you want to continue? (y/n): ");
            yes = sc.next().charAt(0);
        } while (yes == 'y' || yes == 'Y');

        sc.close();
    }
}