// This program calculates the sum of two numbers entered by the user.
import java.util.*;
public class sum_input {
     public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.print("enter number a: ");
     int a= sc.nextInt();
     System.out.print("enter number b: ");
     int b=sc.nextInt();
     int sum = a+b;
     System.out.println("sum of a and b is: "+sum);
     sc.close();
}
}
// Some say the whole is greater than the sum of its parts.