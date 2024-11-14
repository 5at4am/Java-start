import java.util.*;
public class digit_3 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);

        System.out.print("enter the 'A' number : ");
        int a = sc.nextInt();
        System.out.print("enter the 'B' number : ");
        int b = sc.nextInt();
        System.out.print("enter the 'C' number : ");
        int c = sc.nextInt();

        if((a>b)&&(a>c)){
            System.out.println("A is greater then B & C");
        }else if(b>c){
            System.out.println("B is greater then A & C ");
        }else{
            System.out.println("C is greater then A & B");
        }

        sc.close();
    }
}