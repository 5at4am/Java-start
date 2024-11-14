import java.util.*;
public class insertionsort 
{
    public static void insertion(int num[]){
        for(int i=1;i<num.length;i++){
            int curr=num[i];
            int prev=i-1;
            while(prev>=0 && num[prev]>curr){
                num[prev+1]=num[prev];
                prev--;
                
            }
            num[prev+1]=curr;
        }
    }
    public static void arry_print(int num[]) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");

        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num[]={ 5,4,1,3,2};
        insertion(num);
        arry_print(num);
        sc.close();   
    }
}