import java.util.ArrayList;
import javal.util.*;

public class coin {
    public static void main(String[] args) {
        int num[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        Arrays.sort(num, Comarator.reverseOrder());
        int amount = 590;
        int count = 0;
        ArrayList<Integer>  ans  = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            if (num[i] < amount) {
                while (num[i]<=amount) {
                    
                    count++;
                    ans.add(num[i]);    
                    amount -= num[i];
                }
            }
        }
        System.out.println("coin : " + count);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i)+" ");
            
        }
    }
}
