import java.util.*;

public class max_area {

    public static void maa(int arr[]) {
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        Stack<Integer> s = new Stack<>();

        // next smallest right
        for (int i = arr.length - 1; i > 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // next smallest left
        s = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
                // -1
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // Current area : //* width = j-i-1 = nsr[i]-nsl[i]-1
        for (int i = 0; i < arr.length; i++) {
            int h = arr[i];
            int w = nsr[i] - nsl[i] - 1;
            int curr = h * w;
            maxArea = Math.max(curr, maxArea);

        }
        System.out.println(" max = " + maxArea);

    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3 };
        maa(arr);

    }
}
