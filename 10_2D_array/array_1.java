import java.util.*;

public class array_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the row number : ");
        int m = sc.nextInt();
        System.out.print("\nenter the column number : ");
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("\nenter the elements of the array " + m * n + " digit  :");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nthe array is : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        sc.close();
    }
}