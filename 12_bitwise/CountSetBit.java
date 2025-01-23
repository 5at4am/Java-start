import java.util.*;
public class CountSetBit 
{
    public static int count(int n){
        int count = 0; 
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        count(n);
        System.out.println("your count is : "+ count(n));
        sc.close();
    }
}