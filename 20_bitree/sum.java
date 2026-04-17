public class sum {
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
            if (nodes[idx] == -1)
                return null;
            Node newNode = new Node(nodes[idx]);
            newNode.left = build(nodes);
            newNode.right = build(nodes);
            return newNode;
        }
    }
    public static int s(Node root){
        if( root == null){
            return 0;
        } 
        int ls = s(root.left);
        int rs = s(root.right);
        return ls+rs+root.data;
    }
    public static void main(String[] args){
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        btree bt = new btree();
        Node root = bt.build(nodes);
        System.out.println(s(root));
    }
}