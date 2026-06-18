public class AVL {
    static class Node {
        int data;
        int height;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
            height = 1;
        }
    }

    public static Node root;

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return root.height;
    }

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int balance(Node root) {
        if (root == null) {
            return 0;
        }
        return height(root.left) - height(root.right);
    }

    // left rotation
    public static Node leftRotation(Node x) {
        Node y = x.right;
        Node z = y.left;

        y.left = x;
        x.right = z;

        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        return y;

    }

    public static Node rightRotation(Node y) {
        Node x = y.left;
        Node z = x.right;

        x.right = y;
        y.left = z;

        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        return x;

    }

    public static Node insert(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.data) {
            // left sub tree
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            // right sub tree
            root.right = insert(root.right, key);
        } else {
            return root; // duplicate are not allowed
        }

        // update root height;
        root.height = 1 + Math.max(height(root.left), height(root.right));

        // get root balance factor
        int bf = balance(root);

        // ! LL case
        if (bf > 1 && key < root.left.data) {
            return rightRotation(root);
        }
        // ! RR case
        if (bf < -1 && key > root.right.data) {
            return leftRotation(root);
        }
        // ! left right case
        if (bf > 1 && key > root.left.data) {
            root.left = leftRotation(root.left);
            return rightRotation(root);

        }
        // ! right left case
        if (bf < -1 && key < root.right.data) {
            root.right = rightRotation(root.right);
            return leftRotation(root);
        }

        return root;

    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);

        preorder(root);

    }
}