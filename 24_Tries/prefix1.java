public class prefix1 {
    static class Node {
        Node child[] = new Node[26];
        boolean eow = false;

        public Node() {
            for (int i = 0; i < 26; i++) {
                child[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.child[idx] == null) {
                curr.child[idx] = new Node();
            }
            curr = curr.child[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            if (curr.child[idx] == null) {
                return false;
            }
            curr = curr.child[idx];
        }
        return curr.eow;
    }

    public static boolean wordbreak(String key) {
        if (key.length() == 0) {
            return true;
        }
        for (int i = 1; i <= key.length(); i++) {
            if (search(key.substring(0, i)) && wordbreak(key.substring(i))) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        String words[] = { "i", "like", "sam", "samsung", "mobie", "ice" };
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        String key ="ilikesamsung";
        System.out.println(wordbreak(key));

    }
}
