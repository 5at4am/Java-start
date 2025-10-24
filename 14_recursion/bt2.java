// ? backtracking way, print n to 1,  without fn(i-1,n) using recursion


public class bt2 {

     public static void bt(int i,int n){
        if (i>n) {
            return;
        }
        bt(i+1,n);

        System.out.println(i+" ");

    }

    public static void main(String[] args) {
        bt(1,3);  
    }
    
}
