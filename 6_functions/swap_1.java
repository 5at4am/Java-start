public class swap_1 {

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a : " + a); // call by value - make a copy and give the output here
        System.out.println("b : " + b);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        swap(a, b);
        // System.out.println("a : "+a); // make is print the real value
        // System.out.println("b : "+b); // not the value in function, as call by
        // referance
    }
}
