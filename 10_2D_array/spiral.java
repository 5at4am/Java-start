import java.util.*;

public class spiral {
    public static void siral(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;

        int SR = 0, ER = n - 1, SC = 0, EC = m - 1;

        while (SR <= ER && SC <= EC) {
            // top
            for (int j = SC; j <= EC; j++) {
                System.out.print(mat[SR][j] + " ");
            }
            // right
            for (int i = SR + 1; i <= ER; i++) {
                if (SR == ER) {
                    break;
                }
                System.out.print(mat[i][EC] + " ");
            }
            // bottom
            for (int j = EC - 1; j >= SC; j--) {
                if (EC == SC) {
                    break;
                }
                System.out.print(mat[ER][j] + " ");
            }

            for (int i = ER - 1; i >= SR + 1; i--) {
                System.out.print(mat[i][SC] + " ");
            }
            SC++;
            EC--;
            SR++;
            ER--;

        }
        //System.out.println();

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the row number : ");
        int m = sc.nextInt();
        System.out.print("\nenter the column number : ");
        int n = sc.nextInt();
        int mat[][] = new int[m][n];
        System.out.println("\nenter the elements of the matrix " + m * n + " digit  :");

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nthe matrix is : ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("your spiral number is in here ");

        siral(mat);

        sc.close();
    }
}
