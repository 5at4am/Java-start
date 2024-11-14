public class prime_in_range {
    public static boolean is_prime(int n) {
        boolean isprime = true;

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isprime = false;
                break;

            }
        }
        return isprime;
    }

    public static void range_prime(int n) {
        for (int i = 2; i <= n; i++) {
            if (is_prime(i)) {
                System.out.print(i + " ");
            }
        }
        // System.out.println();
    }

    public static void main(String args[]) {
        range_prime(100);

    }
}