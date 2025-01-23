import java.util.*;
public class diagonal 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int n = arr.length;
        int sum = 0;

        //brute force method        time comple = O(n^2)

        // for(int i = 0; i < n; i++){
        //     for(int j=0;j<n;j++){
        //         if(i==j ){
        //             sum +=arr[i][j];
        //         }
        //         else if (i+j == arr.length-1){
        //             sum += arr[i][j];
        //         }
        //     }
        // }

        
        //optemize code

         for(int i = 0; i < n; i++){
             sum += arr[i][i];

             if(i !=arr.length-1-i)                     // i+j==num.length-1
                sum+=arr[i][arr.length-1-i];            // j== num.length-1-i
                
         }
         
        System.out.println(sum);

        sc.close();
    }
}