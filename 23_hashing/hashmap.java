import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("india", 120);
        map.put("china", 150);
        map.put("usa", 50);

        System.out.println(map);
        // System.out.println(map.get("india"));
        // System.out.println(map.containsKey("butan"));
        // System.out.println(map.remove("china"));
        // System.out.println(map);

        // System.out.println(map.size());
        // map.clear();
        // System.out.println(map.isEmpty());
        // System.out.println();
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }
    }

}
