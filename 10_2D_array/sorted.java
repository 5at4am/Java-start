import java.util.*;

public class sorted {
    public static boolean stare(int mat[][], int key) {
        int row = 0, col = mat[0].length - 1;
        while (row < mat.length && col >= 0) {
            if (mat[row][col] == key) {
                System.out.println("found key at (" + row + "," + col + ")");
                return true;
            } else if (key < mat[row][col]) {
                col--;
            } else if (key > mat[row][col]) {
                row++;
            } else {
                System.out.println("key not found");
            }
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int mat[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        int key = 33;
        stare(mat, key);
        sc.close();
    }
}
