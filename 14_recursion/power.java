public class power {
    public static int pow(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        int ans = base* pow(base, exponent-1);

        return ans;
    }

    public static void main(String[] args) {
        int base = 9;
        int exponent = 2;
        System.out.println(pow(base, exponent));
    }
    
}
