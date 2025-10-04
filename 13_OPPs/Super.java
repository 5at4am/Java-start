public class Super {
    public static void main(String[] args) {

        horse h = new horse();
        System.out.println(h.color);


    }    
}

class animal{
    String color;
    animal() {
        System.out.println("Animal constructor called..");
    }
}

class horse extends animal{
    horse() {
        super.color ="brown";
    //    super();
        System.out.println("Horse constructor called..");
    }
}
