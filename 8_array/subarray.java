import java.util.*;

public class subarray {
    public static void sub(int num[]) {
        int total_subarray=0;
/*
Outer Loop:
The first loop iterates over each element in the array using index i. 
This loop determines the starting point of the subarray.

Middle Loop:
The second loop uses index j, which starts from i and goes to the end of the array.
This loop defines the endpoint of the subarray.

Inner Loop:
The innermost loop iterates from index i to j,
printing each element of the current subarray defined by these indices. 
*/
        for (int i = 0; i < num.length; i++) {
            for (int j = i ; j < num.length; j++) {
                for (int k = i; k < j+1; k++) {
                    System.out.print(num[k]+" ");
                }
                total_subarray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub array = "+total_subarray);
        
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num[] = { 2, 4, 6, 8, 10 };
        sub(num);
        //System.out.println("sub array is: "+num);
        sc.close();
    }
}