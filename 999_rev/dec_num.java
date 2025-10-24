
public class dec_num {
    public static void  num(int n) {
        if (n==1) {
            System.out.println(n);
            return ;
            
        }
        System.out.print(n+" ");
        num(n-1);

    }

    public static void main(String[] args) {
        int n = 10;
        num(n);


    }
}