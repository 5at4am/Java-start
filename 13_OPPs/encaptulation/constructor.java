package encaptulation;

public class constructor {

    public static void main(String[] args) {
        student s0 = new student();
        student s1 = new student("satyam", 106);
        System.out.println(s1.name);
        student s2 = new student("satyam");
        student s3 = new student(123);

        System.out.println(s0 + " " + s1 + " " + s2 + " " + s3);
    }

}

class student {
    String name;
    int rollno;

    // ↓ nothing is instialized in the student
    student() { // non paramiterized constructor
        System.out.println("your constructor called : ");

    }

    // ↓ something is instialized in the student
    student(String name, int rollno) { // paramiterized constructor
        this.name = name;
        System.out.println("Constructor called " + name);
        this.rollno = rollno;
        System.out.println("construct called " + rollno);
    }

    student(String name) { // paramiterized constructor
        this.name = name;
    }

    student(int rollno) { // paramiterized constructor
        this.rollno = rollno;
    }

}
