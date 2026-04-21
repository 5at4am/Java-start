public class main {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // create a binary tree when the input is an array

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data> val){
            //left sub tree
            root.left = insert(root.left, val);
        }else{
            //right sub tree
            root.right = insert(root.right,val);
        }
        return root;
    }




    // search on binary tree //? (BST)

    public static boolean search(Node root,int key){        // O(H) -> height
        if(root == null) return false;

        if(root.data == key) return true;

        if(root.data > key){
            return search(root.left,key);
        }else{
            return search(root.right,key);
        }

    }

    public static void main(String[] args) {    

        int value[]= {5,1,3,4,2,7};
        Node root =null;
        for(int i = 0;i<value.length;i++){
            root = insert(root,value[i])
        }
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.right = new Node(6);

        System.out.println(search(root, 2));
        

    }
}