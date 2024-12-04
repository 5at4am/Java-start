package Question;

import java.util.*;
public class Q1 
{
    public static int find(int arr[][],int key){
        int num =0;
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    num++;
                }
            }
        }
        return num;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[][]={{4,7,8},{8,8,7}};
        int key=7;
        System.out.println(find(arr,key));
        sc.close();
    }
}