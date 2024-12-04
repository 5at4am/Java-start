package Question;

import java.util.*;

public class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = " satyam raj is a mesmarizing person";
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("Number of vowels in the string is: " + count);
        sc.close();

        System.out.println();
        System.out.println();

        // Question 2;

        String str = "Hello, World!";
        String Str1 = "Hello";
        String Str2 = "Hello, World!";
        System.out.println(str.equals(Str1) + " " + str.equals(Str2));
        System.out.println();

        // Question 3;

        String na = "Apna Collage".replace("l", "_");
        System.out.println(na);
    }
}