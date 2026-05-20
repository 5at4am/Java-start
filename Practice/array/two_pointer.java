import java.util.*;
public class two_pointer {

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[] { left + 1, right + 1 };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] { -1, -1 };
    }
    // find all unique pairs in an array that sum to a given target

    public static void two_sum_with_duplicate(int[] arr, int target) {

        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println(arr[left] + " " + arr[right]);
                while (left < right && arr[left] == arr[left + 1]) {
                    left++;
                }
                while (left < right && arr[right] == arr[right - 1]) {
                    right--;
                }
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }

    // triplet sum == 0
    public static void triplet_sum(int[] arr) {
        int n = arr.length - 1;
        for (int i = 0; i < n - 1; i++) {

            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            if (arr[i] > 0) {
                break;
            }

            int left = i + 1;
            int right = n;
            int sum = -1 * arr[i];
            while (left < right) {
                int s = arr[left] + arr[right];
                if (s == sum) {
                    System.out.println(arr[i] + " " + arr[left] + " " + arr[right]);
                    right--;
                    left++;
                    // to avoid duplicate we use this while loop for left and right
                    while (left < right && arr[left] == arr[left - 1]) {
                        left++;
                    }
                    while (left < right && arr[right] == arr[right + 1]) {
                        right--;
                    }

                } else if (s < sum) {
                    left++;
                } else {
                    right--;
                }

            }
        }
    }


    public static void closest_3sum(int[] arr, int target){
        int n = arr.length-1;
        int max = Integer.MAX_VALUE;
        int res = 0;

        for (int i = 0; i < n - 1; i++) {
            int left = i + 1;
            int right = n;
            
            while (left<right) {
                int sum = arr[i]+arr[left]+arr[right];
                if( sum == target){
                // System.out.println("->"+arr[i]+" "+arr[left]+" "+arr[right]);
                System.out.println("sum->"+sum);
                left++;
                right--;
                }else if(Math.abs(target-sum)<max){
                    max = Math.abs(target-sum);
                    res = sum;
                    left++;
                }else{
                    right--;
                }
            }
            // System.out.println(">>"+arr[i]+" "+arr[left]+" "+arr[right]);
        }
        System.out.println("total result -> "+res);
    }

    public static void remove_duplicate(int[] arr) {

        int s = arr[0];
        int f = arr[1];
        while (f < arr.length) {
            if (arr[s] != arr[f]) {
                s++;
                arr[s] = arr[f];
            }
            f++;
        }
    }
    public static void smallest(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length - 1;
        int ans = 0;
        for(int i=0;i<n-1;i++){
            int left = i+1;
            int right =n;
            while(left<right){
                int sum = arr[i]+arr[left]+arr[right];
                if(sum >=target){
                    right--;
                }else{
                    ans = ans+(right-left);
                    left++;
                }
                System.out.println("->"+arr[i]+" "+arr[left]+" "+arr[right] + " = "+ans);
            }
        }
        System.out.println(ans);
        
    }

    public static void color(int arr[]){
            
        int start = 0;
        int mid = 0;
        int end = arr.length-1;
        while(mid <=end){
                
                if(arr[mid]==0){
                    int temp = arr[start];
                    arr[start++] = arr[mid];
                    arr[mid++] = temp;
                    // start++;
                    // mid++;
                }else if( arr[mid] ==1){
                    mid++;
                }else{
                    int temp = arr[mid];
                    arr[mid] = arr[end];
                    arr[end--] = temp;
                }
            }
                 
        }
        
    
    public static void main(String[] args) {

        // int[] arr = { 2, 7, 11, 15 };
        // int target = 9;
        // int[] result = twoSum(arr, target);
        // System.out.println("Indices: " + result[0] + ", " + result[1]);

        // int[] arr = { 1, 2, 2, 3, 4, 4, 5 };
        // remove_duplicate(arr);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // })

        // int[] arr = { 1, 1, 2, 2, 4, 4, 5, 5, 7, 7, 8, 8, 9, 9, };
        // int target = 9;
        // two_sum_with_duplicate(arr, target);
        // System.out.println("Indices: " + result[0] + ", " + result[1]);

        // int[] arr = { -1, 0, 1, 2, -1, 4 };
        // triplet_sum(arr);
        // int[] arr = { -3,-2,-1,0,0,1,2,3};
        // closest_3sum(arr, 3);

        // int[] arr = {2,7,4,9,5,1,3};
        // smallest(arr, 10);

        int arr[] = {2,0,2,1,1,0};
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        color(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
        

    }
}
