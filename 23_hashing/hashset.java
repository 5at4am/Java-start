import java.util.*;
public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(3);
        hs.add(4);
        hs.add(1);
        hs.add(2);

        System.out.println(hs);

        if (hs.contains(3)) {
            System.out.println(true);
        }
        if (hs.contains(1)) {
            System.out.println(hs.remove(4));
        }

        System.out.println(hs);
    }
}
