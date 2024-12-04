import java.util.*;

public class strings {
    public static void printletter(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    } 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char arr[] = { 'a', 'b', 'c', 'd' };
        String str = "abcd";
        String str2 = new String("xyz");
        System.out.println(arr[0]);
        System.out.println(str);
        System.out.println(str2);

        // strings are immutable

        // String str3 =sc.nextLine();
        // System.out.println(str3);

        // length .length()
        String full_name = "Tony Stark";
        System.out.println(full_name.length());

        // concatination
        String first = "satyam";
        String last = "raj";
        String full = first + " " + last;
        System.out.println(full);
        System.out.println(full.charAt(2));

        printletter(full);

        sc.close();
    }
}