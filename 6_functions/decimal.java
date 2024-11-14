import java.util.*;

public class decimal {

    public static void DecToBin(int decimal) {
        int pow = 0;
        int binary = 0;
        while (decimal > 0) {
            int rem = decimal % 2;
            binary = binary + (rem * (int) Math.pow(10, pow));
            pow++;
            decimal = decimal / 2;

        }

        System.out.println("decimal of " + decimal + " is : " + binary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the decimal number : ");
        int decimal = sc.nextInt();

        DecToBin(decimal);
        sc.close();
    }
}
