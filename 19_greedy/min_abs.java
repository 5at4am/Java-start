import java.util.Arrays;

public class min_abs {
    public static void main(String[] args) {
        int a[] = { 1, 2, 4, 2, 6 };
        int b[] = { 5, 2, 1, 2, 1 };

        Arrays.sort(a);
        Arrays.sort(b);
        int min = 0;

        for (int i = 0; i < b.length; i++) {
            min += Math.abs(a[i] - b[i]);
        }
        System.out.println(min);

    }

}
