import java.util.*;

public class str_buil {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        // O(26) 
        // O(n^2)
        System.out.println(sb);
        System.out.println(sb.length());
        sc.close();
    }
}