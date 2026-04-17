import java.util.*;

import org.w3c.dom.Node;

public class subtree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class btree {
        static int idx = -1;

        public static Node build(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = build(nodes);
            newNode.right = build(nodes);
            return newNode;
        }
    }

    public static boolean isIdentical(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        } else if (root1 == null || root2 == null || root1.data != root2.data) {
            return false;
        }

        if (!isIdentical(root1.left, root2.left))
            return false;
        if (!isIdentical(root1.right, root2.right))
            return false;

        return true;
    }

    public static boolean issubtree(Node root, Node subRoot) {
        if (root == null)
            return false;
        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot))
                return true;
        }

        // boolean l = issubtree(root.left,subRoot);
        // boolean r = issubtree(root.right,subRoot);
        return issubtree(root.left, subRoot) || issubtree(root.right, subRoot);
    }

    public static int height(Node root) {
        if (root == null)
            return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        return 1 + Math.max(lh, rh);

    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        btree bt = new btree();
        Node root = bt.build(nodes);

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(3);

        System.out.println(issubtree(root, subRoot));

    }

}
