import java.util.*;

public class linear {
    public static int linear_search(int number[], int key) {
        for (int i = 0; i <= number.length; i++) {
            if (key == number[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int key = 10;
        int number[] = { 2, 4, 6, 8, 10, 12, 14, 16 };

        linear_search(number, key);
        if (key == -1) {
            System.out.println("key not found");
        } else {
            System.out.println(linear_search(number, key) + " index");
        }
        String menu[] = { "chaat", "pani puri", "samosa", "tea", "coffiee", };
        String dish = "tea";

        pick(menu, dish);
        System.out.println("dish is : " + pick(menu, dish));
        sc.close();
    }

    public static int pick(String menu[], String dish) {
        for (int i = 0; i <= menu.length; i++) {
            if (menu[i] == dish) {
                return i;
            }

        }
        return -1;
    }
}