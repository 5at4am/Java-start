import java.util.*;

public class nextGreater {
    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();
        int nxt[] = new int[arr.length];
        for (int i = arr.length - 1; i >=0; i--) {
            // while
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();

            }
            // if else
            if (s.isEmpty()) {
                nxt[i] = -1;
            } else {
                nxt[i] = arr[s.peek()];
            }
            // push el 
            s.push(i);

            for (int j = 0; j < nxt.length; j++) {
                System.out.print(nxt[j] + " ");

            }
            System.out.println();

        }

        System.out.println("your complete solution");
        for (int j = 0; j < nxt.length; j++) {
            System.out.print(nxt[j] + " ");

        }
        System.out.println();

    }
}
