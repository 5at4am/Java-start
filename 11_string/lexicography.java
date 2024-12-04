import java.util.*;

public class lexicography {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str[] = { "Mango", "apple", "banana", "orange" };
        String largest = str[0];
        for (int i = 0; i < str.length; i++) {
            if (largest.compareTo(str[i]) < 0) {
                largest = str[i];
            }
        }
        System.out.println("lergest is : " + largest);
        sc.close();
    }
}