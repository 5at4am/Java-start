// ?  backtracking way, print 1 to n,  without fn(i+1,n)

public class bt1 {



    public static void bt(int i){
       if (i<1){ 
            return;
        }

       bt(i-1);
        System.out.print(i+" ");

    }

    public static void main(String[] args) {
        bt(3);
    }
    
}
