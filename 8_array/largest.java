import java.util.*;

public class largest {
    public static int get_largest(int num[]) {
        int largest = Integer.MIN_VALUE; // -infinity

        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }
        }
        return largest;
    }

    public static int get_smallest(int num[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < smallest) {
                smallest = num[i];

            }
        }
        return smallest;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num[] = { 1, 2, 5, 6, 3 };
        get_largest(num);
        System.out.println("largest digit is : " + get_largest(num));
        get_smallest(num);
        System.out.println("smallest digit is: " + get_smallest(num));

        sc.close();
    }
}