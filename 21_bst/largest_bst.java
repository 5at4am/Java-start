import org.w3c.dom.Node;

public class largest_bst {
    static class Node{
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info{
        boolean isbst;
        int size;
        int min;
        int max;

        public Info(boolean isbst, int size, int min, int max){
            this.isbst = isbst;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    public static int maxBst = 0;

    public static Info larg(Node root) {
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info left = larg(root.left);
        Info right = larg(root.right);
        int size = left.size + right.size + 1;
        int min = Math.min(root.data, Math.min(left.min, right.min));
        int max = Math.max(root.data, Math.max(left.max, right.max));

        if (root.data <= left.max || root.data >= right.min) {
            return new Info(false, size, min, max);
        }
        if (left.isbst && right.isbst) {
            maxBst = Math.max(maxBst, size);
            return new Info(true, size, min, max);
        }
        return new Info(false, size, min, max);

    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(60);
        root.left.left = new Node(5);
        root.left.right = new Node(25);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);
        Info ans = larg(root);
        System.out.println(maxBst);

    }
}