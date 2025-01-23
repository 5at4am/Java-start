import java.util.*;

public class operation {
    public static int get_bits(int n, int i) {
        int mask = 1 << i;
        if ((n & mask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int set_bits(int n, int i) {
        int mask = 1 << i;
        return n | mask;
    }

    public static int clear_bit(int n, int i) {
        int mask = ~(1 << i);
        return n & mask;

    }

    public static int update_bit(int n, int i) {
        int val = 0;
        int mask = 1 << i;
        int newbit = get_bits(n, i);

        if (newbit == 1) {
            val = 1;
        }
        return n & ~mask + val << i;

    }

    public static int ClearlastBit(int n, int i) {
        int mask = (~0) << i;
        return n & mask;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.print("Enter the i number : ");
        int i = sc.nextInt();

        get_bits(n, i);
        System.out.println("Your ith bit is in the number : " + get_bits(n, i));

        set_bits(n, i);
        System.out.println("Your ith bit is set in the number : " + set_bits(n, i));

        clear_bit(n, i);
        System.out.println("You ith bit is cleared in the number : " + clear_bit(n, i));

        ClearlastBit(n, i);
        System.out.println("your last ith bit is cleared with number : " + ClearlastBit(n, i));
        sc.close();
    }
}