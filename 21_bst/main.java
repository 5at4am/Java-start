import java.util.*;

import org.w3c.dom.Node;

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
        System.out.print(root.data + " ");
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

    public static Node InOrderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;

    }
    public static void printrange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }

        if (k1 <= root.data && root.data <= k2) {
            printrange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printrange(root.right, k1, k2);

        } else if (root.data < k1) {
            printrange(root.right, k1, k2);
        } else {
            printrange(root.left, k1, k2);
        }

    }

    

    public static void Printpath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " ");
        }
        System.out.println("Null");

    }

    public static void Print2leaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            Printpath(path);
        }
        Print2leaf(root.left, path);
        Print2leaf(root.right, path);
        path.remove(path.size() - 1);

    }

    public static boolean isValid(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
        // for minimum
        if (min != null && root.data <= min.data) {
            return false;
        } else if (max != null && root.data >= max.data) {
            return false;
        }
        return isValid(root.left, min, root) && isValid(root.right, root, max);

    }

    public static Node mirror(Node root) {
        if (root == null) {
            return null;
        }

        Node left = mirror(root.left);
        Node right = mirror(root.right);
        root.left = right;
        root.right = left;

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

        int value[] = { 8, 5, 3, 6, 10, 11, 14 };
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

        inorder(root);
        System.out.println();
        // root = delet(root, 1);
        // System.out.println();
        // inorder(root);
        // printrange(root,3,5);

        // Print2leaf(root, new ArrayList<>());

        // if (isValid(root, null, null)) {
        // System.out.println("true");
        // } else {
        // System.out.println("false");
        // }
        root = mirror(root);
        preorder(root);

    }
}