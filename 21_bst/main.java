public class main {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // create a binary tree when the input is an array

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            // left sub tree
            root.left = insert(root.left, val);
        } else {
            // right sub tree
            root.right = insert(root.right, val);
        }
        return root;
    }

    // search on binary tree //? (BST)

    public static boolean search(Node root, int key) { // O(H) -> height
        if (root == null)
            return false;

        if (root.data == key)
            return true;

        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }

    }

    public static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);

    }

    public static Node delet(Node root, int key) {
        if (root == null) {
            return null;
        }

        if (root.data < key) {
            root.right = delet(root.right, key);
        } else if (root.data > key) {
            root.left = delet(root.left, key);
        } else {
            // case 1 = root has no child
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2 = single child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3 = two children
            Node IS = InOrderSuccessor(root.right);
            root.data = IS.data;
            root.right = delet(root.right, IS.data);
        }
        return root;

    }
    public static void printrange(Node root, int k1, int k2){
        if(root == null){
            return;
        }

        if( k1<= root.data && root.data<= k2){
            printrange(root.left,k1,k2);
            System.out.print(root.data + " ");
            printrange(root.right,k1,k2);

        }else if( root.data < k1){
            printrange(root.right,k1,k2);
        }else{
            printrange(root.left,k1,k2);
        }

    }

    public static Node InOrderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;

    }

    public static void main(String[] args) {

        int value[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < value.length; i++) {
            root = insert(root, value[i]);
        }
        // root = new Node(4);
        // root.left = new Node(2);
        // root.right = new Node(5);
        // root.left.left = new Node(1);
        // root.left.right = new Node(3);
        // root.right.right = new Node(6);

        // System.out.println(search(root, 2));

        // inorder(root);
        // System.out.println();
        // root = delet(root, 1);
        // System.out.println();
        // inorder(root);
        printrange(root,3,5);

    }
}