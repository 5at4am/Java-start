public class heap_sort {

    public static void heapify(int[] arr, int i, int size) {
        int left = 2 * i + 1;
        int rigth = 2 * i + 2;
        int max = i;
        if (left < size && arr[left] > arr[max]) {
            max = left;
        }
        if(right<  size && arr[left] > arr[max]){
            max = right;
        }
        if (max != i) {
            // swap
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;

            heapify(arr, rigth, size);

        }

    }

    public static void sort(int[] arr) {
        // build max heap
        int n = arr.length;

        for (int i = n / 2; i >= 0; i--) {
            heapify(i, n);
        }

        // push largest at end
        for (int i = n - 1; i > 0; i--) {
            // swap
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }

    }

    public static void main(String[] args) {

    }

}
