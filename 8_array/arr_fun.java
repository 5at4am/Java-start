import java.util.*;

public class arr_fun {
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int marks[] = { 89, 98, 77 };
        update(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}