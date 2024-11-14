import java.util.*;
public class num_para 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = sc.nextInt();
        //left side
        for(int i=1;i<=n;i++){
            //space
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //decending
            for(int l=i;l>=1;l--){
                System.out.print(l);
            }
            //accending
            for(int m=2;m<=i;m++){
                System.out.print(m);
            }
            System.out.println();
        }

        
        
        sc.close();
    }
}