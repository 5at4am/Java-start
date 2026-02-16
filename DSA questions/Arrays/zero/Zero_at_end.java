public class Zero_at_end {

    public static void zero(int arr[]) {
        int temp[] = new int[arr.length];
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp[idx++] = arr[i];
            }
        }
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
        for (int i = temp.length; i < arr.length; i++) {
            arr[i] = 0;

        }
    }

    public static void zeros(int arr[]) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }

        }
        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                swap(arr, i, j);
            }
        }

    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 0, 2, 3, 0, 0, 4, 6, 0 };
        System.out.println("Before");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        zeros(arr);
        System.out.println("After");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
