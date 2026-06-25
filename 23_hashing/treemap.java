import java.util.*;
public class treemap {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("india", 120);
        map.put("china", 150);
        map.put("usa", 50);
        map.put("japan", 100);
        map.put("russia", 150);
        map.put("germany", 150);
        System.out.println(map);
    }
}
