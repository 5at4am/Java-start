
public class main {

    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    public static Node addLast(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        return head;
    }

    public static Node reverseLL(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // reverse from left to right

    public static Node reverseLR(Node head, int left, int right) {

        if (head == null) {
            return null;
        }
        if (left == right) {
            return head;
        }
        Node before = null;
        int pos = 1;
        Node t = head;
        while (pos < left) {

            before = t;
            t = t.next;
            pos++;

        }
        Node curr = t;
        Node prev = null;
        Node next = null;

        int count = right - left + 1;

        while (count-- > 0) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        t.next = curr;

        if (before == null)
            head = prev;
        else
            before.next = prev;

        return head;

    }

    public static void main(String[] args) {

        Node head = null;
        head = addLast(head, 1);
        head = addLast(head, 2);
        head = addLast(head, 3);
        head = addLast(head, 4);
        head = addLast(head, 5);
        head = addLast(head, 6);
        head = addLast(head, 7);
        head = addLast(head, 8);
        head = addLast(head, 9);
        head = addLast(head, 10);
        head = addLast(head, 11);
        head = addLast(head, 12);

        head = reverseLR(head, 3, 6);

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }

    }
}
