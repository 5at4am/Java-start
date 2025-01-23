import java.util.*;
public class powerOf2 
{
    public static boolean power(int n){

        return  (n&(n-1)) ==0;



    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number you want to check : ");
        int n = sc.nextInt();

        power(n);
        System.out.println(" this is "+ power(n));
        sc.close();
    }
}