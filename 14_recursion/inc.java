public class inc {

    public static void incr(int i, int n) {
        if (i == n) {
            System.out.println(i);
            return;
        }
        System.out.println(i);
        incr(i + 1, n);
    }

    public static void increas(int n) {
        if (n == 0)
            return;

            increas(n - 1);
            System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 5;
        int i = 0;
        incr(i, n);
        increas(n);
    }
}