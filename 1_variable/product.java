import java.util.*;

public class product {
     public static void main(String args[]) {
          Scanner sc = new Scanner(System.in);
          System.out.print("enter number a: ");
          float a = sc.nextFloat();
          System.out.print("enter number b: ");
          float b = sc.nextFloat();
          float product = a * b;
          System.out.println("product of a and b is: " + product);
          sc.close();

     }
}
