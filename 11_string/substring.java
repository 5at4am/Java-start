import java.util.*;

public class substring {
    public static String stustr(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }  
        return substr;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String str = "Hello world";
        int si = 0, ei = 4;
        System.out.println(stustr(str, si, ei));
        System.out.println(str.substring(3, 7));

        // System.out.println("Enter the string");
        // String str = sc.nextLine();
        // System.out.println("Enter the starting index");
        // int start = sc.nextInt();
        // System.out.println("Enter the ending index");
        // int end = sc.nextInt();
        // String sub = str.substring(start, end);
        // System.out.println("Substring is: " + sub);
        sc.close();
    }
}