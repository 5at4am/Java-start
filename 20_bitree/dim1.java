import java.util.*;
public class dim1{
    static class Node{          
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }        
    }
    static class btree{
        static int idx = -1;
        public static Node build(int Node[]){
            idx++;
            if(Node[idx] == -1) return null;
            Node newNode = new Node(Node[idx]);
            newNode.left = build(Node);
            newNode.right = build(Node);
            return newNode;
        } 
    }
    public static int hight(Node root){
        if(root == null) return 0;
        int lh = hight(root.left);
        int rh = hight(root.right);
        return Math.max(lh, rh) + 1;
    }
    public static int diameter(Node root){ // O(N^2)
        if(root == null) return 0;

        int ld = diameter(root.left);
        int lh = hight(root.left);
        int rd = diameter(root.right);
        int rh = hight(root.right);

        int self = lh +rh+1;
        return Math.max(self, Math.max(ld, rd));

    }
    
    static class info{
        int dim;
        int hight;
        info(int dim, int hight){
            this.dim = dim;
            this.hight = hight;
        }

    }
    
    public static info diameter2(Node root){ // O(N)

        if(root == null) return new info(0,0);
        info li = diameter2(root.left);
        info ri = diameter2(root.right);

        int dim = Math.max(Math.max(li.dim, ri.dim), li.hight+ri.hight+1);
        int hight = Math.max(li.hight, ri.hight)+1;
        return new info(dim, hight);


    }


    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        btree bt = new btree();
        Node root = bt.build(nodes);
        System.out.println(diameter2(root).dim);
    }

}