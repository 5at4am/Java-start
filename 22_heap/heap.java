import java.util.*;

public class heap {
    public class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // add at last idx
            arr.add(data);
            int x = arr.size(); // child index
            int par = (x - 1) / 2; // par index

            while (arr.get(x) < arr.get(par)) { // O(logn)
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
            }
        }

        public int peek() {
            return arr.get(0);
        }

        public void remove() {
            int data = arr.get(0);
            // swap firsta and last
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
                int temp = arr.get(min);
                arr.set(min, arr.get(i));
                arr.set(i, temp);

                heapify(min);
            }
        }

    }

    public static void main(String[] args) {
        Heap hp = 
    }
}