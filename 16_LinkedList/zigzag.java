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

    public static void main(String[] args) {

    }

}
