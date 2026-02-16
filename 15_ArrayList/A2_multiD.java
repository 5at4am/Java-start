import java.util.*;

public class A2_multiD {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(2);
        List.add(4);
        List.add(6);
        List.add(8);
        System.out.println("ORIGINAL" + List);

        ArrayList<Integer> List2 = new ArrayList<>();
        List2.add(1);
        List2.add(2);
        List2.add(3);
        List2.add(4);
        System.out.println("ORIGINAL" + List2);

        ArrayList<Integer> List3 = new ArrayList<>();
        List3.add(3);
        List3.add(6);
        List3.add(9);
        List3.add(12);
        System.out.println("ORIGINAL" + List3);

        ArrayList<ArrayList<Integer>> main = new ArrayList<>();
        main.add(List);
        main.add(List2);
        main.add(List3);

        for (int i = 0; i < main.size(); i++) {
            ArrayList<Integer> temp = main.get(i);
            for (int j = 0; j < temp.size(); j++) {
                System.out.print(temp.get(j) + " ");
            }
        }
        // System.out.println(main);

    }
}