package stack;
import java.util.*;

public class stack1 {
    
    // print string
    public static void Print(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }
    }

    public static void remove_adjacent(String s) {
        Stack<Character> st = new Stack<>();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (st.isEmpty()) {
                st.push(s.charAt(i));
                continue;
            }
            if (st.peek() == s.charAt(i)) {
                st.pop();
                continue;
            }
            st.push(s.chatAt(i));
        }
        Print(st);
        
    }


    public static void main(String[] args) {
        String s = "abbaca";
        remove_adjacent(s);
    }
}