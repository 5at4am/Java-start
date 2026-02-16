import java.util.ArrayList;

public class arrlst {
    public static void main(String[] args) {

        // ArrayList<DataType> name = new ArrayList<>();

        // ! Create arraylist

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> lst2 = new ArrayList<>();
        ArrayList<Boolean> lst3 = new ArrayList<>();

        // ! Add elements

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // ! Print arraylist

        System.out.println(list);

        lst2.add("Satyam");
        lst2.add("Raj");

        System.out.println(lst2);

        lst3.add(true);
        lst3.add(false);

        System.out.println(lst3);
        // Get Operation

        int val = list.get(1);
        System.out.println(val);

        // ! delete peration
        
        list.remove(3);
        System.out.println(list);

        // ! update operation
        list.set(2, 100);
        System.out.println(list);

        // ! contain element
        System.out.println(list.contains(100));
        
        // ! size operation
        int size = list.size();
        System.out.println(size);

        list.add(1, 2002);
        System.out.println(list);

    }

}
