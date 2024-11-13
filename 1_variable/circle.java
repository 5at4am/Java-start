import java.util.*;

public class circle {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        float r = sc.nextFloat();
        float pi = 3.14f;
        float area = pi * r * r;
        System.out.println("The area of the circle is : " + area);

        sc.close();
    }
}