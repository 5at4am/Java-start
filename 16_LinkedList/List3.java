import java.util.LinkedList;

public class List3 {

    public static void main(String[] args) {
        // craete LinkedList using Object DataType; eg (Integer,Boolean,Character,Float)

        LinkedList<Integer> ll = new LinkedList<>();

        // Add in linkedlist;
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        ll.addFirst(2);
        ll.add(2, 21);
        

        System.out.println(ll);
        // Remove linkedlist
        ll.remove();
        ll.removeFirst();
        ll.removeLast();
        // remove by value
        ll.remove(Integer.valueOf(21));

        System.out.println(ll);

        // access element

    }

}
