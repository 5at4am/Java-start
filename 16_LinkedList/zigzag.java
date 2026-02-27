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

        // reverse the 2nd half

        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public Node merge(Node h1, Node h2) {

        Node nextL, nextR;

        while (h1 != null && h2 != null) {
            nextL = h1.next;
            h1.next = h2;
            nextR = h2.next;
            h2.next = nextL;

            h1 = nextL;
            h2 = nextR;
        }
        return head;

    }

    public Node zz(Node head) {

        // find mid
        Node mid = mid(head);

        // reverse 2nd Half
        Node rev = reverse(mid.next);

        mid.next = null;

        // alternate merge
        return merge(head, rev);

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
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        System.out.println("Before:");
        ll.print();

        ll.head = ll.zz(ll.head);
        System.out.println("After:");
        ll.print();

    }

}
