public class binary_sc {
    public static int binary_search(int num[], int key) {

        int start = 0;
        int end = num.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            // comparision

            if (num[mid] == key) {// found
                return mid;
            }
            // right
            if (num[mid] < key) {
                start = mid + 1;

            } else { // left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int num[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 10;

        System.out.println("num is found in the index : " + binary_search(num, key));

    }
}