public class abstraction {
    public static void main(String[] args) {
        horse h = new horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        mustank ho = new mustank();
        //animal->horse->mustank
        ho.eat();


        chicken c = new chicken();
        c.eat();
        c.walk();
        System.out.println(c.color);
    }
}

abstract class animal {
    String color;

    animal() {
    System.out.println("animal constructor called");
        color = "Brown";
    }

    void eat() {
        System.out.println("animal eat");
    }

    abstract void walk();

}

class horse extends animal {
    horse() {
        System.out.println("horse constructor called");
    }
    void colorchange() {
        color = "white";
    }

    void walk() {
        System.out.println("walk on 4 leg");
    }
}

class mustank extends horse {
    mustank() {
        System.out.println("mustank constructor called");
    }
}

class chicken extends animal {
    void colorchange() {
        color = "white";
    }

    void walk() {
        System.out.println("walk on 2 leg");
    }
}
