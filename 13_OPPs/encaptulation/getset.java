package encaptulation;
public class getset {

    public static void main(String[] args) {

        pen p1 = new pen();
        p1.color = "Red";
        p1.tip = 10;

        System.out.println(p1.getcolor());
        System.out.println(p1.tip);

    }

}
 
class pen {
    public String color;

    String getcolor() {
        return this.color;
    }

    public int tip;

    void settip(int tip) {
        this.tip = tip;

    }

}
