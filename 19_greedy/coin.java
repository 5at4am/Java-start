import java.util.*;

public class coin {
    public static void main(String[] args) {
        Integer num[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        Arrays.sort(num, Comparator.reverseOrder());
        int amount = 1590;
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
