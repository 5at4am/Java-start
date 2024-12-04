
import java.util.*;

public class compress {
    public static StringBuilder comp(String str) {
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            char ch = str.charAt(i);

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(ch);
            if (count > 1) {
                sb.append(count);
            }
        }
        return sb;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = "aaabbcccd&&  22";
        System.out.println(comp(str));
        sc.close();
    }
}

// import java.util.Scanner;

// public class compress {
//     public static StringBuilder compress(String str) {
//         StringBuilder sb = new StringBuilder();

//         for (int i = 0; i < str.length(); i++) {
//             int count = 1;
//             char ch = str.charAt(i);

//             while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
//                 count++;
//                 i++;
//             }
//             sb.append(ch);
//             if (count > 1) {
//                 sb.append(count);
//             }
//         }
//         return sb;
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         String str = "aaabbcccdd";
//         System.out.println(compress(str));
//         sc.close();
//     }
// }
