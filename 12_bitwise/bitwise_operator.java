public class bitwise_operator {
    public static void main(String args[]) {
        int a = 5;
        int b = 6;
        int and = a & b;
        int or = a | b;
        int xor = a ^ b;
        int not = ~a;   // most significant bit is 1 and all other bits are 1's complement of 'a'
        int leftshift = a << 2;
        int rightshift = a >> 2;
        System.out.println("AND: " + and);
        System.out.println("OR: " + or);
        System.out.println("XOR: " + xor);
        System.out.println("NOT: " + not);
        System.out.println("Left shift : " + leftshift);
        System.out.println("Right shift : " + rightshift);

    }
}