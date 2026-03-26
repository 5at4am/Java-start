import java.util.*;
import java.util.LinkedList;

public class stack_queue {
    static class Stack {
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data) {
            deque.addLast(data);
        }

        public int pop() {
            return deque.removeLast();
        }

        public int peek() {
            return deque.getLast();

        }

    }

    static class Queue {
        Deque<Integer> deque = new LinkedList<>();

        public void add(int data) {
            deque.addLast(data);
        }

        public int remove() {
            return deque.removeFirst();
        }

        public int peek() {
            return deque.getFirst();

        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(2);
        s.push(1);
        s.push(6);
        s.push(0);

        System.out.println(s.pop());
        Queue q = new Queue();
        q.add(0);
        q.add(3);
        q.add(5);
        q.add(1);
        q.add(9);

    }

}
