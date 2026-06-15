import java.util.*;

import org.w3c.dom.Node;
public class BST {
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

    public static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static Node create_bst(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        Node root = new Node(arr[mid]);
        root.left = create_bst(arr, start, mid - 1);
        root.right = create_bst(arr, mid + 1, end);
        return root;
    }

    public static Node CreateBST(ArrayList<Integer> arr, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        Node root = new Node(arr.get(mid));
        root.left = CreateBST(arr, start, mid - 1);
        root.right = CreateBST(arr, mid + 1, end);
        return root;
    }

    public static Node BalanceBst(Node root) {
        // calculate inorder sequence
        ArrayList<Integer> in_order = new ArrayList<>();
        inorder(root, in_order);

        // sorted inorder -> balanced bst
        return CreateBST(in_order, 0, in_order.size() - 1);
        
    }

    public static void main(String[] args) {
        Node root = null;
        int value[] = { 3, 5, 6, 8, 10, 11, 12 };
        for (int i = 0; i < value.length; i++) {
            root = insert(root, value[i]);
        }
        // preorder(root);
        // root = create_bst(value, 0, value.length - 1);
        // System.out.println();
        // preorder(root);

        root = BalanceBst(root);
        System.out.println();
        preorder(root);


    }
}