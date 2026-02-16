public class a1 {

    public static int slarg(int arr[]) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] > smax & arr[i] != max) {
                smax = arr[i];
            }

        }
        return smax;
    }

    public static int smin(int arr[]) {
        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] < smin & arr[i] != min) {
                smin = arr[i];

            }
        }
        return smin;
    }

    public static void main(String[] args) {
        int ar[] = { 3, 5, 2, 7, 9, 10, 12, 4, 12, 5, 11 };
        // int max = Integer.MIN_VALUE;
        // int m2 = Integer.MIN_VALUE;
        // for (int i = 0; i < ar.length; i++) {
        //     if (ar[i] > max) {
        //         m2 = max;
        //         max = ar[i];

        //     } else if (ar[i] > m2 & ar[i] != max) {
        //         m2 = ar[i];
        //     }
        // }
        // System.out.println(m2);
        System.out.println(slarg(ar));
    }

}
