public class OOPS {
    public static void main(String[] args) {

        Pen p1 = new Pen();

        p1.setcolor("Red");
        p1.setTip(10);

        System.out.println(p1.color);
        System.out.println(p1.tip);

        p1.color = "Blue";
        p1.tip = 20;

        System.out.println(p1.color);
        System.out.println(p1.tip);

        bank myacc = new bank();
        myacc.username = "Satyam";
        myacc.setpwd("1234");

    }

}

class Pen {

    String color;
    int tip;

    void setcolor(String newcolor) {
        color = newcolor;
    }

    void setTip(int newtip) {
        tip = newtip;
    }

}

class bank {
    public String username;

    public void setpwd(String pwd) {
    }
}