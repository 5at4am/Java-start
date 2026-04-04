import java.util.*;

public class one {

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
    
    static class BT {
        static int idx = -1;

        public static Node Build(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = Build(nodes);
            newNode.right = Build(nodes);
            return newNode;

        }

        public static void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
        
        public static void postorder(Node root) {
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
        
    }
    
    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BT bt = new BT();
        Node root = bt.Build(nodes);
        System.out.println(root.data);
        System.out.println("Preorder Traversal");

        bt.preorder(root);
        System.out.println();
        System.out.println("Inorder Traversal");
        bt.inorder(root);
        System.out.println();
        System.out.println("Postorder Traversal");
        bt.postorder(root);

    }
    
}
