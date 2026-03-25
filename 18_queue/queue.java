import java.util.*;
import java.util.LinkedList;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(); // * ArrayDeque
        Queue<Integer> q1 = new ArrayDeque<>(); //* ArrayDeque 
        
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        
        q1.add(4);
        q1.add(3);
        q1.add(2);
        q1.add(1);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
            
        }
        while (!q1.isEmpty()) {
            System.out.println(q1.peek());
            q1.remove();
            
        }
    }
}
