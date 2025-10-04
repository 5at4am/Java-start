public class last {

    public static int lastoc(int arr[], int i, int key) {

        if (i == arr.length) {
            return -1;
        }
        int isfound = lastoc(arr, i + 1, key);

        if (isfound == -1 && arr[i] == key) {
            return i;
        }
        return isfound;
    }

    // public static int first_occ(int arr[], int i, int key) {
    // i = arr.length - 1;

    // if (i == 1) {
    // return 0;
    // }
    // if (key == arr[i]) {
    // return i;
    // }
    // if (key != arr[i]) {
    // return -1;
    // }

    // return first_occ(arr, i - 1, key);

    // }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 1, 1, 1 };
        int key = 1;
        System.out.println(lastoc(arr, 0, key));
    }

}
