package Questions;

import java.util.*;

public class Q5 {
    public List<List<Integer>> threesum(int num[]) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                for (int k = j + 1; k < num.length; k++) {
                    if (num[i] + num[j] + num[k] == 0) {
                        List<Integer> triplet = new ArrayList<Integer>();
                        triplet.add(num[i]);
                        triplet.add(num[j]);
                        triplet.add(num[k]);
                        Collections.sort(triplet);
                        result.add(triplet);
                    }

                }
            }
        }
        result = new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>>(result));
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num[] = { -1, 0, 1, 2, -4 };
        Q5 q5 = new Q5(); // Create an instance of Q5
        List<List<Integer>> result = q5.threesum(num); // Call the method

        System.out.println("Unique triplets that sum up to zero: " + result);
        // System.out.println(threesum(num));
        sc.close();
    }
}