package Question;

import java.util.*;

public class Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int row = 2, col = 3;
        int num[][] = { { 1, 3, 5 }, { 2, 4, 6 } };
        printMatrix(num);

        int trans[][] = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                trans[j][i] = num[i][j];
            }
        }
        printMatrix(trans);

        sc.close();
    }
    public static void printMatrix(int[][] matrix){
        System.out.println("The Matrix is: ");
        for(int i = 0;i<matrix.length; i++){
        for(int j = 0;j<matrix[0].length; j++){
        System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
        }
        }
}
