import java.util.*;

public class spiral {
    public static void sp(int mat[][]) {

        int n = mat.length;
        int m = mat[0].length;
        int sr =0, sc=0, er=n-1, ec=m-1;

        while (sr<=er && sc<=ec){
            // top
            for (int j = sc; j <=ec;j++){
                System.out.print(mat[sr][j]+" ");
            }
            // right
            for(int i = sr+1;i<=er;i++){
                if(sr==er){
                    break;
                }
                System.out.print(mat[i][ec]+" ");
            }
            // bottom
            for(int j = ec-1; j>=sc;j--){
                System.out.print(mat[er][j]+" ");
            }
            //left
            for(int i = er-1;i>=sr+1;i--){
                System.out.print(mat[i][sc]+" ");
            }
            sr++;
            sc++;
            er--;
            ec--;
            
        }
        
    }

    public static void main(String[] args) {
        int mat[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        sp(mat);
    }
}