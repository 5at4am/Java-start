import java.util.*;

public class a1_size {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(21);
        list.add(123);
        list.add(12);
        list.add(13);

        System.out.println(list.size());

        // iterate over the ArrayList

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ",");

        }
        System.out.println();

        // fix reverse of an ArrayList

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // fix Find maximum in ArrayList

        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            // if (list.get(i) > max) {
            //     max = list.get(i);
            // }
            // opt optimal solution
            max = Math.max(list.get(i), max);

        }
        System.out.println("maximum is:" + max);

    }

}
