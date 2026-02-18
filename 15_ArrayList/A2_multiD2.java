import java.util.*;
public class A2_multiD2 {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        ArrayList<Integer> lst2 = new ArrayList<>();
        ArrayList<Integer> lst3= new ArrayList<>();

        for (int i = 1; i <=5; i++) {
            lst.add(i);
            lst2.add(i *2);
            lst3.add(i *3);
        }
        ArrayList<ArrayList<Integer>> multiD = new ArrayList<>();
        multiD.add(lst);
        multiD.add(lst2);
        multiD.add(lst3);
        // System.out.println(multiD);

        for (int i = 0; i < multiD.size(); i++) {
            for (int j = 0; j < multiD.get(i).size(); j++) {
                System.out.print(multiD.get(i).get(j) + " ");
            }
            System.out.println();
            
        }
        for(Integer num : lst){
            System.out.println(num);
        }
    }
}
