import java.util.*;

public class equal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s1 = "tony";
        String s2 = "tony";
        String s3 = new String("tony");

        if (s1 == s2) {
            System.out.println("it is quual");

        } else {
            System.out.println("it is not equal");
        }
        if (s1.equals(s3)) {
            System.out.println("it is equal");
        } else {
            System.out.println("it is not equal");
        }

        sc.close();
    }
}