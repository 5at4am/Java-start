import java.util.*;

public class Pyramid_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        //int n = 10; // Number of rows in the pyramid

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" "); // Use space for better alignment
            }

            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) { //*shortcut rule
                System.out.print("*"); // Print stars without tabs
            }

            // Move to the next line after each row
            System.out.println();
        }
        sc.close();
    }
}