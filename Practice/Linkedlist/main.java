
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

        head = reverseLL(head);

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data+ " -> ");
            curr = curr.next;
        }

    }
}
