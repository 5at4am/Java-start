    import java.util.*;
    public class slowfast {

        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
        
        Node head = null;
        Node tail = null;

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
        
        public static boolean checkcycle(Node head) {
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    return true;
                }
            }
            return false;
        }
        
        public static void startCycle(Node head){
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    break;
                }
            }
            fast = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            System.out.println(slow.data);

        }

        // check happy number
        public static boolean happy( int n){
            int slow = n,fast=getsum(n);
            while (fast != 1 && slow != fast) {
                fast = getsum(getsum(fast));
                slow = getsum(slow);
            }
            return fast == 1;
        }
        public static int getsum(int n){
            int sum = 0;
            while(n>0){
                int rem = n%10;
                sum += rem*rem;
                n = n/10;
            }
            return sum;
        }
        public static void main(String[] args) {
            //  Creating a linked list
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
            // connect the last node to 4th node
            // head.next.next.next.next = head.next; // it is for cycle at 4th node from last  
            // System.out.println(checkcycle(head));
            // startCycle(head);
            System.out.println(happy(19));
        }
    }