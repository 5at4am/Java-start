// This program prints a character pattern based on user input.
import java.util.*;

public class character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (char j = 1; j <= i; j++) {

                System.out.print(ch);
                ch++;
            }
            System.out.println();

        }

        sc.close();
    }
}
// Hope you enjoyed the character pattern!