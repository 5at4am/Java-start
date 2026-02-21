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

    public int removeLast() {
        if (size == 0) {
            System.out.println("no element here");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    // note: Search in LinkedList O(n)
    public int search(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;

        }
        return -1;

    }

    // note: Search with (Resursion)
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int searchRec(int key) {
        return helper(head, key);
    }

    // note: reverse an array
    public int reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

        return -1;

    }

    // note: find and remove nth node from end using iterative approach
    public void deletenth(int n) {
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (n == sz) {
            head = head.next;
            return;
        }
        // sz - n
        int i = 1;
        int iFind = sz - n;
        Node prev = head;
        while (i < iFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;

    }

    // note: check if LinkedList is palindrome or not
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // slow is middle node

    }

    public boolean check_palindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // find mid
        Node mid = findMid(head);

        // reverse the 2nd half

        Node curr = mid;
        Node next;
        Node prev = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // right half head
        Node left = head;

        // check left half and right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;

        }
        return true;

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);

        // add first
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        // add last
        ll.addLast(2);
        ll.addLast(1);

        // add middle
        ll.add(3, 3);

        // // print ll
        ll.print();
        // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.print();
        // System.out.println(ll.size);
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);
        // System.out.println("at indext " + ll.search(3));
        // ll.print();
        // System.out.println(ll.size);
        // System.out.println("at indext " + ll.search(10));

        // System.out.println(ll.searchRec(3));

        // ll.deletenth(5);
        System.out.println(ll.check_palindrome());
    }

}
