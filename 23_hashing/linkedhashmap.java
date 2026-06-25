import java.util.*;

public class linkedhashmap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("india", 120);
        map.put("china", 150);
        map.put("usa", 50);
        map.put("japan", 100);
        map.put("russia", 150);
        map.put("germany", 150);

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
