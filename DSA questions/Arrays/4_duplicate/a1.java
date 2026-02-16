public class a1 {

    public static int Lrotate(int arr[]) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
        return arr.length;
    }

    public static int Rrotate(int arr[]) {
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        return arr.length;
    }

    public static int Krotate(int arr[], int k) {

        int temp[] = new int[k];
        // storing an array in temp
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        // shifting an array
        for (int i = k; i < arr.length; i++) {
            arr[i - k] = arr[i];

        }
        // storing an array
        for (int i = arr.length - k; i < arr.length; i++) {
            arr[i] = temp[i - (arr.length - k)];

        }
        return arr.length;

    }
    

    

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5,6,7 };
        int n = 2;
        int k = Krotate(arr, n);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");

        }

    }

}
 