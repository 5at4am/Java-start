import java.util.*;

public class LinkedList {
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
    public static int size;

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
    // note: Add element in last position

    public void addLast(int data) {

        // create a new node
        Node newNode = new Node(data);
        size++;

        // empty linkedlis
        if (head == null) {
            head = tail = newNode;

        }
        // tail.next = new node
        tail.next = newNode;

        // tail = new node
        tail = newNode;

    }

    // note: Print LinkedList
    public void print() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linkedlist is empty");
            return;
        }
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

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);

        // add first
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(2);

        // add last
        ll.addLast(1);
        ll.addLast(8);

        // add middle
        ll.add(3, 7);

        // print ll
        ll.print();
        System.out.println(ll.size);
        ll.removeFirst();
        ll.print();
        System.out.println(ll.size);

    }

}
