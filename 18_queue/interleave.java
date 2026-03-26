import java.util.*;
import java.util.LinkedList;

public class interleave {

    public static void interleave(Queue<Integer> q) {

        Queue<Integer> f = new LinkedList<>();
        int n = q.size()/2;
        for (int i = 0; i < n; i++) {
            f.add(q.remove());
        }
        while (!f.isEmpty()) {
            q.add(f.remove());
            q.add(q.remove());
        }

    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(0);

        interleave(q);
        while (!q.isEmpty()) {
            System.out.println(q.remove());

        }
    }

}
