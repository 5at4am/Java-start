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

        // fix Swap 2 Numbers in ArrayList
        ArrayList<Integer> lst1 = new ArrayList<>();
        lst1.add(2);
        lst1.add(5);
        lst1.add(9);
        lst1.add(3);
        lst1.add(6);
        swap(lst1, 1, 3);
        System.out.println(lst1);

    }
    
    public static void swap(ArrayList<Integer> list , int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

}
