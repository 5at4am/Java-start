import java.util.*;

public class RainWater {

    public static int waterfall(int hight[]) {
        // calculate left
        int left[] = new int[hight.length];
        left[0] = hight[0];
        for (int i = 1; i < hight.length; i++) {
            left[i] = Math.max(hight[i], left[i - 1]);
            //System.out.print(" "+left[i]+" ,");
        }
        // calculate right
        int right[] = new int[hight.length];
        right[hight.length - 1] = hight[hight.length - 1];
        for (int i = hight.length - 2; i >= 0; i--) {
            right[i] = Math.max(hight[i], right[i + 1]);
            //System.out.print(" "+right[i]+" ,");
        }

        int trapped_water = 0;
        // loop
        for (int i = 0; i < hight.length; i++) {

            // water level = min(left,right)
            int waterlevel = Math.min(left[i], right[i]);

            // trapped water = waterfall- hight [i]
            trapped_water += waterlevel - hight[i];
        }
        return trapped_water;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int hight[] = { 4, 2, 0, 6, 3, 2, 5 };
        waterfall(hight);
        System.out.println("waterfall hight " + waterfall(hight));

        sc.close();
    }
}