import java.util.*;

public class stack_2 {
    static class queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        // add - O(n)
        public static void add(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }

        }

        public static int remove() {
            if (s1.isEmpty()) {
                System.out.println("stack is empty");
                return -1;
            }
            return s1.pop();
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("is empty");
                return -1;
            }
            return s1.peek();

        }
    }

    public static void main(String[] args) {
        queue q = new queue();
        q.add(0);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()) {
            System.out.println(q.remove()\);
        }

    }

}
