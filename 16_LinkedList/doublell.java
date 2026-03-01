public class doublell {

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
        doublell dll = new doublell();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();

    }
}
