import java.util.*;

public class spiral {
    public static void sp(int mat[][]){
        int n = mat.length;
        int m = mat[0].length;
        int sr = 0, er=n-1, sc=0, ec = m-1;

        while(sr<=er &&sc<=ec){
            for(int j = sc; j<=ec;j++){
                System.out.println(mat[sr][j]);
            }
            for(int i = sr+1;i<=er;i++){
                if(sc==ec){
                    break;
                }
                System.out.print(mat[i][ec]);
            }
            for(int j = ec-1;j>=sc;j--){
                System.out.print(mat[er][j]);

            }
            for(int i = er-1 ;i>=sr+1;i--){
                if(sr==er){
                    break;
                }
                System.out.print(mat[i][sc]);
            }
            sr++;
            er--;
            sc++;
            ec--;


        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int mat[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
         sp(mat);
        sc.close();
        // Your code ends here
    }
}