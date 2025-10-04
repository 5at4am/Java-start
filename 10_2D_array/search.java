// This program searches for a key in a 2D array and prints its location.
import java.util.*;
public class search 
{
    public static void sorting(int arr[][],int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    System.out.println("your num is at row "+i+" column "+j);
                }

            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int key =6;
        sorting(arr, key);        

        sc.close();
    }
}
// I'm not a search engine, but I can find what you're looking for.