import java.util.*;

public class brute_force {
    public static void main(String args[]) {
        int arr[] = { 2, 5, 1, 3, 0 };
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Largest num is : " + arr[arr.length - 1]);
    }
}


/*
  Time complexity = O(n*log*n)

  space cpmplexity = O(n)
 */