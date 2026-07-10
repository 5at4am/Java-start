import org.w3c.dom.Node;

public class prefix2 {
    static class Node {
        Node child[] = new Node[26];
        boolean eow = false;
        int freq;

        public Node() {
            for (int i = 0; i < 26; i++) {
                child[i] = null;
            }
            freq = 1;
        }
    }

    public static Node root = new Node();

    // find shortest unique prefix
    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.child[idx] == null) {
                curr.child[idx] = new Node();
            } else {
                curr.child[idx].freq++;
            }
            curr = curr.child[idx];
        }
        curr.eow = true;
    }


    public static String shortestUniquePrefix(String s) {
        Node curr = root;
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            curr = curr.child[idx];

            ans += s.charAt(i); // Always add character

            if (curr.freq == 1) {
                break; // First unique point
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        //shortest unique prefix
        String word[] = { "zebra", "dog", "duck", "dove" };
        for (int i = 0; i < word.length; i++) {
            insert(word[i]);
        }
        for (int i = 0; i < word.length; i++) {
            System.out.println(shortestUniquePrefix(word[i]));
        }
    }
}