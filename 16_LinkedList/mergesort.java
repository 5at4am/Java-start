import java.util.LinkedList;

public class mergesort {
    public static class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public Node mid(Node head) {

        Node fast = head.next;
        Node slow = head;
        if (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(32);
        ll.addFirst(31);
        ll.addFirst(30);
        ll.addFirst(34);
        ll.addFirst(35);
        // ll.addFirst(39);
        System.out.println(ll.size());
        int val = ll.size() / 2;
        System.out.println(val);

    }

}
