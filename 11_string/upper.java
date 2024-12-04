import java.util.*;

public class upper {
    public static String up(String name) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(name.charAt(0));
        sb.append(ch);
        for (int i = 1; i < name.length(); i++) {

            if (name.charAt(i) == ' ' && i < name.length() - 1) {
                sb.append(name.charAt(i));
                i++;
                sb.append(Character.toUpperCase(name.charAt(i)));
            } else {
                sb.append(name.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = "my name is satyam";

        System.out.println(up(name));
        sc.close();
    }
}