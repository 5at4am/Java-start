public class stat_keyword {
    public static void main(String[] args) {
        student s1 = new student();
        s1.schoolname = "st";
        student s2 = new student();
        System.out.println(s2.schoolname);
        s2.schoolname = "sm";
        student s3 = new student();
        s3.schoolname = "bvn";
        System.out.println(s2.schoolname);

    }

}

class student {
    String name;
    int roll;

    static String schoolname;

    void setname(String name) {
        this.name = name;
    }

    String getname(String name) {
        return this.name;
    }

    void setroll(int roll) {
        this.roll = roll;
    }

    int getroll(int roll) {
        return this.roll;
    }
}
