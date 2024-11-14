import java.util.*;
public class if_else 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your age : ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("you are eligible for voting");
        }
        if (age>13 && age<18) {
            System.out.println("you are teenager");
            
        }else{
            System.out.println("your are not eligible");
        }
        sc.close();
    }
}