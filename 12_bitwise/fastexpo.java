import java.util.*;
public class fastexpo 
{
    public static int expo(int n, int a ){
        int ans = 1;
        while(n>0){
            if((n&1)!=0){
                ans = ans*a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter the number : ");
        int a = sc.nextInt();

        System.out.print(" enter the power of the number : ");
        int n  = sc.nextInt();

        expo(n, a);
        System.out.println("your answer is : "+ expo(n, a));
        sc.close();
    }
}