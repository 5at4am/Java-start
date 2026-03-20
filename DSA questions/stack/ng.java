import java.util.*;
public class ng {
    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();
        int next[] = new int[arr.length];


        // for rigt side

        //! for(int i = arr.length-1;i>=0;i--){}


        // for left side
        for (int i = 0; i < arr.length; i++) {

            // for smaller element
            // ! while(!s.isEmpty() && arr[s.peek()]>=arr[i])
        
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                next[i] = -1;
            } else {
                next[i] = arr[s.peek()];
            }
            s.push(i);
        }

        for(int i = 0; i<next.length;i++){
            System.out.print(next[i]+" , ");
        
        }
        
        
    }
    
}
