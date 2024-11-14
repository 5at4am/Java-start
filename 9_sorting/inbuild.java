//import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class inbuild
{
    public static void arry_print(Integer num[]) {
        for (int i = 0; i < num.length; i++) { 
                      System.out.print(num[i] + " ");

        }
    }
    public static void arry_print(int num[]) {
        for (int i = 0; i < num.length; i++) { 
                      System.out.print(num[i] + " ");

        }
    }
    public static void main(String args[])
    {

        // Scanner sc = new Scanner(System.in);
        int num[]={5,4,1,3,2};
        Arrays.sort(num);
        System.out.println();
        arry_print(num);
        Arrays.sort(num,0,3);
        System.out.println();
        
        Integer arr[]={5,4,1,3,2};
        Arrays.sort(arr, Collections.reverseOrder());
        arry_print(arr);
        System.out.println();
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        arry_print(arr);
        // sc.close();
    }
}