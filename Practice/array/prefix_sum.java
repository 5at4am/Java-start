public class prefix_sum {

    public static void prefix(int[] arr) {
        int[] pre = new int[arr.length];
        pre[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            pre[i] = pre[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(pre[i] + " ");
        }

    }
    public static void suffix(int[] arr) {
        int[] suff = new int[arr.length];

        suff[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            suff[i] = suff[i + 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(suff[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 7, 3, 6, 5, 6 };
        prefix(arr);
        System.out.println();
        suffix(arr);
        
    }
    
}
