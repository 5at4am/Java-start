public class constructor {

    public static void main(String[] args) {
        student s1 = new student("satyam", 106);
        System.out.println(s1.name);
    }

}

class student {
    String name;
    int rollno;

    student(String name, int rollno) {
        this.name = name;
        System.out.println("Constructor called " + name);

    }
}
