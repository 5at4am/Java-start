import java.util.*;

public class user_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 1;
        int n = sc.nextInt();

        while (num<=n) {
            System.out.print(" "+num);
            num++;
            
        }
        sc.close();
    }
}
