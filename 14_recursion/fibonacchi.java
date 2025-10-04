public class fibonacchi {
    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fib1 = fibo(n - 1);
        int fib2 = fibo(n - 2);
        int fibn = fib1 + fib2;
        return fibn;
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(fibo(n));
    }

}
