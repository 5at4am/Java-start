import java.util.ArrayList;
import java.util.*;

import org.w3c.dom.Node;

public class lca {
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

   public static boolean getPath(Node root, int a, ArrayList<Node> p1) {
      if (root == null)
         return false;

      p1.add(root);

      if (root.data == a) {
         return true;
      }
      boolean FoundLeft = getPath(root.left, a, p1);
      boolean FoundRight = getPath(root.right, a, p1);

      if (FoundLeft || FoundRight) {
         return true;
      }

      p1.remove(p1.size() - 1);
      return false;
   }

   // Approach 1

   public static Node ances(Node root, int a, int b) {
      ArrayList<Node> p1 = new ArrayList<>();
      ArrayList<Node> p2 = new ArrayList<>();
      getPath(root, a, p1);
      getPath(root, b, p2);
      int i = 0;
      for (; i < p1.size() && i < p2.size(); i++) {
         if (p1.get(i) != p2.get(i)) {
            break;
         }
      }
      Node ances = p1.get(i - 1);
      return ances;

   }

   // approach 2
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

   public static void main(String[] args) {
      Node root = new Node(1);
      root.left = new Node(2);
      root.right = new Node(3);
      root.left.left = new Node(4);
      root.left.right = new Node(5);
      root.right.left = new Node(6);
      root.right.right = new Node(7);

      int a = 5;
      int b = 2;
      Node ances = lca2(root, a, b);
      System.out.println(ances.data);
   }

}
