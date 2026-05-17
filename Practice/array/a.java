import java.util.*;
public class a {

    public static void traverse(int arr[]){
        for(int i = 0;i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    
    public static void insert(int arr[],int idx,int k){
        for(int i =arr.length-1;i<idx;i++){
            arr[i+1] = arr[i];
        }
        arr[idx] = k;
        traverse(arr);
    }
    
    public static void delete(int arr[],int idx){
        for(int i =idx;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        traverse(arr);
    }
    // prefix sum
    public static void prefixsum(int arr[]){
        for(int i = 1;i<arr.length;i++){
            arr[i] += arr[i-1];
        }
        traverse(arr);
    }
    public static void slidingWindow(int arr[], int k){
        for(int i = 0;i<arr.length-k;i++){
            for(int j = i;j<i+k;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
        
    }
    public static void RemoveDuplicate(int[] arr1){
        for(int i = 0;i<arr1.length;i++){
            for(int j = i+1;j<arr1.length;j++){
                if(arr1[i]==arr1[j]){
                    arr1[j] = -1;
                }
            }
        }
        for(int i = 0;i<arr1.length;i++){
            if(arr1[i]!=-1){
                System.out.print(arr1[i]+" ");
            }
        }
        
    }
    public static int secondLargest(int[] arr){
        int l = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>l){
                sl = l;
                l = arr[i];

            }else if(arr[i]>sl && arr[i]!=l){
                sl = arr[i];
            }
        }
        return sl;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int[] arr1= {0,1,1,2,2,2,2,3,3,4};
        
        // ! traversal
        // traverse(arr);

        // ! insertion
        // insert(arr, 2, 7);

        // ! deletion
        //# delete(arr, 3);
        
        // ! prefix sum
        // prefixsum(arr);

        // ! sliding window
        // slidingWindow(arr,3);

        // ! duplicate
        // RemoveDuplicate(arr1);

        // second Largest
        System.out.println(secondLargest(arr1));


        
    }
}