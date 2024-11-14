package Question;
import java.util.*;

public class Q3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number to check if it is palindrome or not : ");
        int a = sc.nextInt();
        int original = a;
        int rev =0; 

        while(a>0){
            int rem = a%10;
            rev = rev*10 + rem;
            a = a/10;
        }
        if(rev == original){
            System.out.println("this is palindrome");
        }else{
            System.out.println("your number is not palindrome");
        }
        System.out.println("Reverse of the number is: "+rev);
        sc.close();

    }
}
