import java.util.*;

public class main {
    public static int firstunique(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
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

    public static boolean ransom(String ransom, String magazine) {
        HashMap<Character, Integer> have = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();

        for (char c : ransom.toCharArray()) {
            have.put(c, have.getOrDefault(c, 0) + 1);
        }
        for (char c : magazine.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        for (char c : ransom.toCharArray()) {
            if (have.get(c) < need.get(c)) {
                return false;
            }
        }
        return true;

    }



    public static boolean ransom_val(String ransom, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
    
        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : ransom.toCharArray()) {
            if (map.getOrDefault(c, 0) == 0) {
                return false;
            }
           map.put(c, map.get(c) - 1);
        }
        return true;

    }

    public static int baloon(String s){
        HashMap<Character, Integer> have = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();

        for (char c : s.toCharArray()) {
            have.put(c, have.getOrDefault(c, 0) + 1);
        }
        need.put('b', 1);
        need.put('a', 1);
        need.put('l', 2);
        need.put('o', 2);
        need.put('n', 1);

        int answer = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : need.entrySet()) {
            char c = entry.getKey();
            int required = entry.getValue();
            int available = have.getOrDefault(c, 0);
            answer = Math.min(answer, available / required);

        }
        return answer;
    }

    public static void main(String[] args) {
        // String s = "ab";
        // System.out.println(firstunique(s));
        // String s = "aabc";
        // String t = "aabc";
        // System.out.println(ransom(s, t));

        String t = "balloonbaloonballloon";
        System.out.println(baloon(t));

    }
}
