import java.util.ArrayList;
public class mergebst {
    static class Node {
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void Inorder(Node root, ArrayList<Integer> arr) {
        if (root == null)
            return;
        Inorder(root.left, arr);
        arr.add(root.data);
        Inorder(root.right, arr);
    }

    public static Node createBST(ArrayList<Integer> arr, int st, int end) {
        if (st > end) {
            return null;
        }
        int mid = (st + end) / 2;
        Node root = new Node(arr.get(mid));
        root.left = createBST(arr, st, mid - 1);
        root.right = createBST(arr, mid + 1, end);
        return root;
    }

    public static Node merge(Node r1, Node r2) {
        // step 1 - BST1 sequence
        ArrayList<Integer> arr1 = new ArrayList<>();
        Inorder(r1, arr1);

        // BST2
        ArrayList<Integer> arr2 = new ArrayList<>();
        Inorder(r2, arr2);
        // merge
        int i = 0;
        int j = 0;
        ArrayList<Integer> final1 = new ArrayList<>();

        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                final1.add(arr1.get(i));
                i++;
            } else {
                final1.add(arr2.get(j));
                j++;
            }
        }

        while (i < arr1.size()) {
            final1.add(arr1.get(i));
            i++;
        }
        while (j < arr2.size()) {
            final1.add(arr2.get(j));
            j++;
        }
        // bst
        return createBST(final1, 0, final1.size() - 1);
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
        Node r1 = new Node(2);
        r1.left = new Node(1);
        r1.right = new Node(4);

        Node r2 = new Node(9);
        r2.left = new Node(3);
        r2.right = new Node(12);

        Node root = merge(r1, r2);
        preorder(root);

    }

}