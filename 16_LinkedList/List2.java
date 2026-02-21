public class List2 {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public int size;

    // note: Add element in first position
    public void addFirst(int data) {

        // create new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }
        // new node.next = head
        newNode.next = head;

        // head = new node
        head = newNode;

    }

    /// note: Add element in last position

    public void addLast(int data) {

        // create a new node
        Node newNode = new Node(data);
        size++;

        // empty linkedlis
        if (head == null) {
            head = tail = newNode;
            return;

        }
        // tail.next = new node
        tail.next = newNode;

        // tail = new node
        tail = newNode;

    }

    // note: Print LinkedList
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

    // note: add element in middle or any positions
    public void add(int idx, int data) {

        if (idx == 0) {
            addFirst(data);
            return;
        }
        if (idx < 0 || idx > size) {
            System.out.println("Invalid Index");
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;

        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    // note: remove element from first position
    public int removeFirst() {
        if (size == 0) {
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;

            System.out.println("you linkedlist is now empty ");
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while(fast != null&& fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                return true;

            }
        }
        return false;
    }

    public static void del_loop(){
        // detect cycle
        Node slow = head; 
        Node fast = head;
        boolean cycle = false;
        while(fast != null&& fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }
        
        // find meeting point
        slow = head;
        Node prev = null;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next
        } 

        // remove cycle -> last.next = null
        prev.next = null;

    }

    public static void main(String[] args) {
        // List2 ll = new List2();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4); 
        // head.next.next.next = head.next;
       
        System.out.println(isCycle());

        // ll.print();

    }

}
