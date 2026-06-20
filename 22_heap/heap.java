import java.util.*;

public class Heap {
    static class Heaap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // add at last idx
            arr.add(data);
            int x = arr.size()-1; // child index
            int par = (x - 1) / 2; // par index

            while (arr.get(x) < arr.get(par)) { // O(logn)
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
                
                x = par;
                par = (x - 1) / 2;  
            }
        }

        public int peek() {
            return arr.get(0);
        }

        public int remove() {
            int data = arr.get(0);
            // swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // - delete last element
            arr.remove(arr.size() - 1);

            // heapify
            heapify(0);
            return data;

        }

        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int min = i;

            if (left < arr.size() && arr.get(left) < arr.get(min)) {
                min = left;
            }
            if (right < arr.size() && arr.get(right) < arr.get(min)) {
                min = right;
            }
            if (min != i) {
                // swap
                int temp = arr.get(i);
                arr.set(i, arr.get(min));
                arr.set(min, temp);

                heapify(min);
            }
        }

        public boolean isEmpty() {
            return arr.size() == 0;
            
        }


    }

    public static void main(String[] args) {

        Heaap h = new Heaap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);
        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }

        
    }
}