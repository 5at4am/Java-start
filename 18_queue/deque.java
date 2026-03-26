import java.util.*;
import java.util.LinkedList;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
        d.addFirst(1);
        d.addLast(2);
        d.addLast(3);
        d.addLast(5);
        d.addFirst(0);
        System.out.println(d);
        System.out.println(d.removeLast() + " " + d.removeFirst() + " " + d.removeFirst());
        System.out.println(d.getFirst() + " " + d.getLast());

    }
}