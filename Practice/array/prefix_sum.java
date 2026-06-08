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

    public static void maxsum(int[] arr, int k) {
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
    
    public static void subByK(int[] arr, int k) {
        int ans = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            int rem = sum % k;
            if (rem < 0) {
                rem = rem + k;
            }
            if (map.containsKey(rem)) {
                res += map.get(rem);
            }
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        System.out.println("result is : " + res);

    }

    public static void MaxLen01(int[] arr){
        int zero = 0,one = 0;
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zero++;
            } else {
                one++;
            }
            int diff = zero - one;

            if (map.containsKey(diff)) {
                int prevIdx = map.get(diff);
                res = Math.max(res, i - prevIdx);
            } else {
                map.put(diff, i);
            }
        }
        System.out.println(res);

    }

    public static void main(String[] args) {
        // int[] arr = { 1, 7, 3, 6, 5, 6 };
        // prefix(arr);
        // System.out.println();
        // suffix(arr);
        // pivot(arr);
        // maxsum(arr1, 5);
        // int[] arr1 = { 4, 5, 0, -2, -3, 1 };
        // subByK(arr1, 5);
        int[] arr = { 0, 1, 1, 1, 1, 1, 0, 0, 0 };
        MaxLen01(arr);

        
    }
    
}
