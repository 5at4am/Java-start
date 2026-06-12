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
            st.push(s.charAt(i));
        }
        while (!st.isEmpty()) {
            ans += st.pop();
        }

        // reverse string
        ans = new StringBuilder(ans).reverse().toString();
        Print(ans);
    }

    public static boolean valid_parenthesis(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if((ch == '(') ||( ch =='{')|| (ch =='[')){
                st.push(ch);
            }else{
                if (st.isEmpty()) {
                    return false;
                }

                if( (st.peek() == '(' && ch == ')')
                || (st.peek() == '{' && ch == '}')
                || (st.peek() == '[' && ch == ']'))
                {
                    st.pop();
                }else{
                    return false;
                }
                
            }
        }
        if (!st.isEmpty()) {
            return false;
        }else{
            return true;
        }
    }

    public static void prev_great(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        res[0] = -1;
        st.push(arr[0]);
        for (int i = 1; i < res.length; i++) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }
        // print result
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
    
    public static void prev_small(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        res[0] = -1;
        st.push(arr[0]);
        for (int i = 1; i < res.length; i++) {
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }
        // print result
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static void next_small(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        res[n - 1] = -1;
        st.push(arr[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }
        // print result
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
    
    public static void next_greatest(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        res[n - 1] = -1;
        st.push(arr[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }
        // print result
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static void main(String[] args) {
        // String s = "abbaca";
        // remove_adjacent(s);

        // String s = "({})[]";
        // System.out.println(valid_parenthesis(s));
        
        int[] arr = { 4,1,2,5,3};
        // prev_great(arr);
        // prev_small(arr);
        // next_small(arr);
        next_greatest(arr);


    }
}