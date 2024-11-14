package questions;
import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        do{
            System.out.print("enter the number : ");
            int num = sc.nextInt();

            for (int i = 1; i <=10; i++) {
                System.out.println(num+" * "+i+" = "+num*i);
            }

            System.out.println("do you want to continue y = yes n = no : ");
            choice= sc.next().charAt(0);
        
        }while(choice=='y');
        sc.close();
    }
}
