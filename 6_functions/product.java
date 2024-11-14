public class product {
    public static int prod(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String args[]) {
        int a = 2;
        int b = 4;

        int product = prod(a, b);
        System.out.println("product is : " + product);
        product = prod(3, 5);
        System.out.println("product is : " + product);
    }
}
