import java.util.*;

public class main {
    public static int firstunique(String s) {
        if (s.length() == 0) {
            return -1;
        }
        if (s.length() == 1) {
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        
       
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch + "")) {
                map.put(ch,map.get(ch)+ 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (int i = 1; i < n; i++) {
            char ch = s.charAt(i);
            if (map.get(ch) == 1) {
                return i;
            }
        }
        return -1;

        
    }

    public static void main(String[] args) {
        String s = "a";
        System.out.println(firstunique(s));

    }
}
