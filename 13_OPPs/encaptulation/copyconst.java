package encaptulation;
public class copyconst {
    public static void main(String[] args) {

        student s1 = new student();
        s1.name = "John";
        s1.age = 21;
        s1.password = "1234";
        s1.mark[0] = 100;
        s1.mark[1] = 90;
        s1.mark[2] = 80;

        student s2 = new student(s1);
        s2.password = "abcd";
        s1.mark[2] = 50;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.mark[i]);
        }
    }

}

class student {
    String name;
    int age;
    String password;
    int mark[];

    // *shallow copy constructor
    // student(student s1) {
    // mark = new int[3];
    // this.name = s1.name;
    // this.age = s1.age;
    // this.mark = s1.mark;

    // }

    // * deep copy constructor

    student(student s1) {
        mark = new int[3];
        this.name = s1.name;
        this.age = s1.age;
        for (int i = 0; i < mark.length; i++) {
            this.mark[i] = s1.mark[i];
        }
    }

    public student() {
        mark = new int[3];

        System.out.println("Calling a constructor...");
    }

}