import java.util.*;

public class chain_pair {
    public static void main(String[] args) {
        int pair[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };
        Arrays.sort(pair, Comparator.comparingDouble(o -> o[1]));

        int len = 1;
        int end = pair[0][1]; // last slected pair end
        for (int i = 1; i < pair.length; i++) {
            if (pair[i][0] > end) {
                len++;
                end = pair[i][1];
            }
        }
        System.out.println("max len " + len);

    }

}
