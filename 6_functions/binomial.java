public class binomial {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is " + fact);
        return fact;

    }

    public static int BinoCoff(int n, int r) {
        int n_fact = factorial(n);
        int r_factorial = factorial(r);
        int nmr = factorial(n - r);
        int binomial = n_fact / (r_factorial * nmr);
        return binomial;
    }

    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        int BC = BinoCoff(n, r);
        System.out.println("your output is " + BC);

    }
}
