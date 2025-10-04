import java.util.*;
public class brute 
{
    public static void rotate(int arr[],int n){
        int temp[]= new int[n];
        for(int i = 1; i < n; i++){
            temp[i-1] = arr[i];
        }
        temp[n-1] = arr[0];
        System.out.print(" your output is : ");
        for(int i = 0; i < n; i++){
            System.out.print(temp[i] + " ");
        }
    } 
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        int n = arr.length;
        rotate(arr,n);
        sc.close();
    }
}