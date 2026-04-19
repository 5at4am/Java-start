import java.util.ArrayList;

import org.w3c.dom.Node;

public class min {
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

    public static Node lca2(Node root, int a, int b) {

        if (root == null || root.data == a || root.data == b) {
            return root;
        }

        Node llca = lca2(root.left, a, b);
        Node rlca = lca2(root.right, a, b);

        // llca - valid rlcs = null
        if (rlca == null) {
            return llca;
        }
        // vv
        if (llca == null) {
            return rlca;
        }
        return root;
    }

    public static int lca_dis(Node root, int n) {
        if(root == null) return -1;

        if(root.data == n) return 0;

        int ldis = lca_dis(root.left,n);
        int rdis = lca_dis(root.right,n);

        if(ldis == -1 && rdis == -1){
            return -1;
        }else if( ldis == -1){
            return rdis+1;
        }else{
            return ldis + 1;
        }

    }

    public static int min_dis(Node root , int n1, int n2){
        Node lca = lca2(root, n1, n2);
        int dis1 = lca_dis(lca,n1);
        int dis2 = lca_dis(lca,n2);
        
        return dis1 + dis2;
 
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int a = 4;
        int b = 6;
        // Node ances = lca_dis(root, a, b);
        System.out.println(min_dis(root,a,b));
        
        
    }

}
