import java.util.*;

public class union_inter {
    public static void main(String[] args) {
        int[] arr1 = { 7, 3, 9 };
        int[] arr2 = { 6, 3, 9, 2, 9, 4 };
        HashSet<Integer> set = new HashSet<>();
        for (Integer a : arr1) {
            set.add(a);
        }
        for (Integer a : arr2) {
            set.add(a);
        }
        System.out.println(set.size());

        for (Integer u : set) {
            System.out.print(u + " ");
        }
        System.out.println();

        // intersection

        set.clear();
        for (Integer a : arr1) {
            set.add(a);
        }

        int count = 0;

        for (Integer a : arr2) {
            if (set.contains(a)) {
                set.remove(a);
                System.out.print(a + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println(count);

    }
}