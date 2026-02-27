public class zigzag {

    public static class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public Node mid(Node head) {

        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public void addFirst(int data) {

        // create new node
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        // new node.next = head
        newNode.next = head;

        // head = new node
        head = newNode;

    }

    private Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // find mid
        Node mid = mid(head);

        // reverse the 2nd half

        Node curr = mid;
        Node next;
        Node prev = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // right half head
        Node left = head;

        // check left half and right half
        while (right != null) {
            if (left.data != right.data) {
            }
            left = left.next;
            right = right.next;

        }

        return head;

    }

    // Print the linkedlist
    public void print() {
        if (head == null) {
            System.out.println("Linkedlist is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        zigzag ll = new zigzag();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        System.out.println("Before Sort:");
        ll.print();

    }

}
