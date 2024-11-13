import java.util.*;
public class input {
     public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          String input = sc.next();
          System.out.println("your name is : "+input);

          String name = sc.nextLine();
          System.out.println("name : "+name);


          int number = sc.nextInt();
          System.out.println("number "+number);

          float pi = sc.nextFloat();
          System.out.println("value "+pi);

          sc.close();
}
}