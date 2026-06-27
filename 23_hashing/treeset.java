import java.util.*;
public class treeset {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("delhi");
        ts.add("mumbai");
        ts.add("bangalore");
        ts.add("chennai");
        for (String c : ts) {
            System.out.println(c);
        }
    }
}
