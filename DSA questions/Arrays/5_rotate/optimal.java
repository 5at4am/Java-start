import java.util.*;
public class optimal 
{
    public static void rotate(int arr[], int n){
        int temp = arr[0];
        for(int i = 0; i < n - 1; i++){
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;
        System.out.print("Your output is: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    } 
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        int n = arr.length;
        System.out.print("Original array: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        rotate(arr,n);
        sc.close();
    }
}