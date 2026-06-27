import java.util.*;

public class iterator {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("delhi");
        hs.add("mumbai");
        hs.add("bangalore");
        hs.add("chennai");

        // Iterator itr = hs.iterator();
        // while (itr.hasNext()) {
        // System.out.println(itr.next());
        // }

        for (String c : hs) {
            System.out.println(c);
        }

    }
}
