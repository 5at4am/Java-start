public class polymorphism {
    public static void main(String[] args) {

        // Method overloading
        calculator calc = new calculator();
        System.out.println(calc.sum(10, 20));
        System.out.println(calc.sum(10.5f, 20.5f));
        System.out.println(calc.sum(10, 20, 30));

        // Method Overriding
        deer d = new deer();
        d.eat();
        
    }
}

// Method Overloading
class calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

// Method Overriding
class animal{
    void eat(){
        System.out.println("eat anything");
    }
}

class deer extends animal{
    void eat(){
        System.out.println("eat grass");
    }
}