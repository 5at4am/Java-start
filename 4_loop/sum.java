import java.util.*;
public class sum {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

        int num = 0;
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        int sum = 0;

        while (num<=n) {
            System.out.print(num+" + ");
            sum +=num;
            num++;
            
        }
        System.out.print("  =  "+sum);
        sc.close();
    }
}