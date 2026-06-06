import java.util.HashMap;

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

    public static void pivot(int[] arr) {
        int totalsum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalsum += arr[i];
        }
        int leftsum = 0;
        for (int i = 0; i < arr.length; i++) {
            int rightsum = totalsum - leftsum - arr[i];
            if (leftsum == rightsum) {
                System.out.println("index is : " + i);
                System.out.println("sum is : " + leftsum);
                return;

            }
            leftsum += arr[i];
        }
        System.out.println("-1");
    }

    public static void maxsum(int[] ar, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int prefix = 0;
        int count = 0;
        for (int i : arr) {
            prefix += i;
            if (map.containsKey(prefix - k)) {
                count += map.get(prefix - k);
            }
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
            
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 7, 3, 6, 5, 6 };
        // prefix(arr);
        // System.out.println();
        // suffix(arr);
        pivot(arr);

        
    }
    
}
