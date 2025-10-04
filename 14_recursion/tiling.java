public class tiling {

    public static int tile(int n) { // 2*n floor
        if (n == 0 || n == 1) {
            return 1;
        }

        // for vertical tile
        int ver = tile(n - 1);

        // for horizontal tile
        int hor = tile(n - 2);

        // total ways
        int total = ver + hor;
        return total;

    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(tile(n));

    }

}
