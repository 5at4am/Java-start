public class dec {

    public static void decr(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        decr(n - 1);

    }

    public static void decre(int i, int n) {
        if (i > n) {
            return;
        }
        decre(i + 1, n);
        System.out.println(i);

    }

    public static void main(String[] args) {
        int n = 3;
        int i = 1;
        decr(n);
        decre(i, n);

    }
}