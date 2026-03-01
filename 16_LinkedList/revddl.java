public class revddl {

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    // add first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    // Add Last
    public void addLast(int data) {

        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

    }

    // remove first
    public void removeFirst() {
        if (head == null) {
            System.out.println("linkedlist is Empty");
            return;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;

        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;

    }

    // remove Last
    public void removeLast() {
        if (head == null) {
            System.out.println("LinkedList is Empty");
            return;
        }

        // Case 1: Only one node
        if (head == tail) {
            head = tail = null;
            size--;
            return;
        }

        // Case 2: More than one node
        tail = tail.prev;
        tail.next = null;
        size--;

    }

    // reverse a linkedlist
    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // print the LL
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <--> ");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        revddl dll = new revddl();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(4);
        dll.addLast(5);

        dll.print();
        dll.reverse();

        dll.print();

    }

}
