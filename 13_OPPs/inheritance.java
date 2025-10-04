

public class inheritance {
    public static void main(String[] args) {
        fish shark = new fish();
        shark.eat();
        shark.color = "red";

        dog doggy = new dog();
        doggy.eat();
        doggy.legs = 4;
        doggy.breed = "poodle";
        System.out.println(doggy.legs);
        System.out.println(doggy.breed);

        bird sparrow = new bird();
        sparrow.fly();
        sparrow.color = "brown & black";
        System.out.println("Sparrow color is : " + sparrow.color);

    }

}

// base/parent class
class animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breath() {
        System.out.println("it breath...");
    }
}

// derived/child class
class fish extends animal {
    int fins;

    void swim() {
        System.out.println("swim in water...");
    }

}

class mamal extends animal {

    void walk() {
        System.out.println("walk on land");
    }

    int legs;

}

class dog extends mamal {
    String breed;

}

class bird extends animal {
    void fly() {
        System.out.println("fly in sky");
    }

}
