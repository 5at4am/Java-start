public class power1 {
    public static int pow(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        int halfPow = pow(base, exponent / 2);
        int half = halfPow * halfPow;

        if (exponent % 2 != 0) {
            return half * base;
        }
        return half;

    }

    public static void main(String[] args) {
        int base = 2;
        int exponent = 10;
        System.out.println("2^10 = " + pow(base, exponent));

    }

}
