package Question;
import java.util.*;

public class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] num = {{1, 4, 9}, {11, 4, 3}, {2, 2, 3}};
        int sum = calculateSum(num, 1);
        System.out.println(sum);
        sc.close();
    }

    private static int calculateSum(int[][] num, int row) {
        int sum = 0;
        for (int j = 0; j < num[row].length; j++) {
            sum += num[row][j];
        }
        return sum;
    }
}
