public class over_para {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static float sum(float a, float b) {
        return (a + b);
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(10, 20)); // Output: 30
        System.out.println(sum(10, 20, 30)); // Output: 60
        System.out.println(sum(10.5f, 20.5229140f)); // Output: 31.02291
        System.out.println(sum(10.999352213425, 20.5)); // Output: 31.499352213425

    }
}
