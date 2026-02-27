public class zig {

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

    public void ZigZag() {
        // find mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // .reverse 2nd half

        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        Node left = head;
        Node right = prev;

        Node nextL, nextR;

        // merge alternative

        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;

        }

    }

    public static void main(String[] args) {
        zig ll = new zig();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        System.out.println("Before:");
        ll.print();

        ll.ZigZag();
        System.out.println("After:");
        ll.print();

    }

}
