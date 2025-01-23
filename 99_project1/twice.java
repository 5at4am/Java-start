import java.util.*;
//? question is to check if there are two same numbers in the array
//? if there are two same numbers then return true else return false
public class twice 
{
    public static boolean two(int arr[],int n){
        for(int i= 0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if (arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num1[] = { 1, 2, 3, 1 };
        int n = num1.length;
        System.out.println(two(num1,n));
        sc.close();
    }
}