import java.util.*;

//  maintain order here. using Doublie LinkedList
public class linkedhashset {
    public static void main(String[] args) {

        HashSet<String> h = new HashSet<>();
        h.add("delhi");
        


        
        LinkedHashSet<String> hs = new LinkedHashSet<>();

        hs.add("delhi");
        hs.add("mumbai");
        hs.add("bangalore");
        hs.add("chennai");

        for (String c : hs) {
            System.out.println(c);
        }
    }
}