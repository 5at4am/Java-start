import java.util.*;
public class clear_range 
{
    public static int clearRange(int n, int i, int j){
        int a = (~0)<<(j+1);
        int b= (1<<i)-1;
        int c = a|b;
        return n & c;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the n : ");
        int n = sc.nextInt();
        System.out.print("enter the i : ");
        int i = sc.nextInt();
        System.out.print("enter the range j : ");
        int j = sc.nextInt();

        clearRange(n,i,j);
        System.out.println("your input range is : "+ clearRange(n,i,j));
        sc.close();
    }
}