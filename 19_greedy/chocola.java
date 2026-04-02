import java.util.*;

public class chocola {
    public static void main(String args[]) {
        int n = 4, m = 6;
        Integer cv[] = { 2, 1, 3, 1, 4 };
        Integer ch[] = { 4, 1, 2 };

        Arrays.sort(cv, Collections.reverseOrder());
        Arrays.sort(ch, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        while (h < ch.length && v < cv.length) {
            if (cv[v] <= ch[h]) { // horizontal cut
                cost += (ch[h] * vp);
                hp++;
                h++;
            } else {
                cost += (cv[v] * hp);
                vp++;
                v++;
            }
        }

        while (h < ch.length) {
            cost += (ch[h] * vp);
            hp++;
            h++;
        }
        while (v < cv.length) {
            cost += (cv[v] * hp);
            vp++;
            v++;
        }
        System.out.println("min cost : "+ cost);
    }
}