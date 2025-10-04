// This program calculates the area of a circle based on user input.
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
// Fun fact: The area of a pizza with radius 'z' and height 'a' is pizza.