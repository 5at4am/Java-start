import java.util.*;

public class Q2 {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("enter the side of square to dind the area : ");

      int side_of_square = sc.nextInt();
      int area = side_of_square * side_of_square;
      int parameter = 4 * side_of_square;
      System.out.println("area of square is : " + area);
      System.out.println("parameter of square is : " + parameter);
      sc.close();
   }
}