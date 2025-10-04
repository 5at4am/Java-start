public class optimal {
    public static int removeDuplicates(int arr[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int j = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 1, 1, 2, 2, 2, 3, 3, 3 };
        int n = arr.length;
        int result = removeDuplicates(arr, n);
        System.out.println("Result after removing duplicates: ");
        for (int i = 0; i < result; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}