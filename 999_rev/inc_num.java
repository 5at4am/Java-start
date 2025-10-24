public class inc_num {

    public static void num(int n ){
        if (n==10) {
            System.out.println(n);
            return;
            
        }

        System.out.println(n+" ");

        num(n+1);
    }


    public static void main(String[] args) {
        int n = 1;
        num(n);

    }
}
