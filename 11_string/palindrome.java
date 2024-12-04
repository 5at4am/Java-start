import java.util.*;

public class palindrome {
    public static boolean pal(String str) {
        for (int i = 0; i <= (str.length() / 2); i++) {
            if (str.charAt(i) == str.charAt(str.length() - i - 1)) {
                System.out.println("The string is a palindrome");
                return true;
            }
        }

        System.out.println("not a palaindrome");
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        pal(str);

        sc.close();
    }
}