
public class mergesortll {
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

    public Node merge(Node head1, Node head2) {
        Node mergedll = new Node(-1);
        Node temp = mergedll;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }

        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedll.next;

    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;

        }

        // find mid
        Node mid = mid(head);

        // left & right ms
        Node rightHead = mid.next;
        mid.next = null;
        Node NewLeft = mergeSort(head);
        Node NewRight = mergeSort(rightHead);

        // merge
        return merge(NewLeft, NewRight);

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
        mergesortll ll = new mergesortll();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        System.out.println("Before Sort:");
        ll.print();

        ll.head = ll.mergeSort(ll.head);

        System.out.println("After Sort:");
        ll.print();


    }

}
