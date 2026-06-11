import java.util.*;

public class merge_interval {

    // merger interval
    public static void merge(int[][] arr) {
        if (arr.length == 0)
            return;
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> res = new ArrayList<>();
        int s1 = arr[0][0];
        int e1 = arr[0][1];
        for (int i = 1; i < arr.length; i++) {
            int s2 = arr[i][0];
            int e2 = arr[i][1];
            if (e1 >= s2) {
                e1 = Math.max(e1, e2);
            } else {
                res.add(new int[] { s1, e1 });
                s1 = s2;
                e1 = e2;
            }
        }
        res.add(new int[] { s1, e1 });
        for (int[] i : res) {
            System.out.println(Arrays.toString(i));
        }
    }

    // insert interval
    public static void insertInterval(int[][] arr, int[] interval) {
        if (arr.length == 0)
            return;
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> res = new ArrayList<>();
        boolean insert = false;

        // Insert interval at correct position
        for (int i = 0; i < arr.length; i++) {
            if (!insert && interval[0] < arr[i][0]) {
                res.add(interval);
                insert = true;
            }
            res.add(arr[i]);
        }
        // Merge intervals
        List<int[]> ans = new ArrayList<>();

        int s1 = res.get(0)[0];
        int e1 = res.get(0)[1];

        for (int i = 1; i < res.size(); i++) {

            int s2 = res.get(i)[0];
            int e2 = res.get(i)[1];

            if (e1 >= s2) {
                e1 = Math.max(e1, e2);
            } else {
                ans.add(new int[] { s1, e1 });
                s1 = s2;
                e1 = e2;
            }
        }

        ans.add(new int[] { s1, e1 });

        for (int[] x : ans) {
            System.out.println(Arrays.toString(x));
        }

    }

    public static void meeting_room(int[] start, int[] stop) {
        Arrays.sort(start);
        Arrays.sort(stop);
        int res = 0;
        int room = 0;
        int i = 0, j = 0;
        while (i < start.length) {
            if (start[i] < stop[j]) {
                room++;
                res = Math.max(res, room);
                i++;
            } else {
                room--;
                j++;
            }
        }
        System.out.println(res);
        
    }

    public static void twoMerge(int[][] arr1, int[][] arr2) {
        ArrayList<int[]> res = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            int s1 = arr1[i][0];
            int e1 = arr1[i][1];
            int s2 = arr2[j][0];
            int e2 = arr2[j][1];

            if(s1<=s2){
                if (e1 >= s2) {
                    int s = Math.max(s1, s2);
                    int e = Math.min(e1, e2);
                    res.add(new int[]{s,e});
                }
            }else{
                if (e2>=s1) {
                    int s = Math.max(s1, s2);
                    int e = Math.min(e1, e2);
                    res.add(new int[]{s,e});
                }
            }
            if (e1<=e2) {
                i++;
            }else{
                j++;
            }
        }
        for (int[] interval : res) {
            System.out.println(Arrays.toString(interval));
        }

    }

    public static void main(String[] args) {
        // int[][] arr = {{1,3},{2,6},{8,10},{15,18}};
        // merge(arr);
        // int[][] arr1 = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        // int[] a = {4,8};
        // insertInterval(arr1, a);
        // int[][] arr1 = { { 0, 2 }, { 5, 10 }, { 13, 23 }, { 24, 25 } };
        // int[][] arr2 = { { 1, 5 }, { 8, 12 }, { 15, 24 }, { 25, 26 } };
        // twoMerge(arr1, arr2);

        int[] a = { 2, 9, 6 };
        int[] b = { 4, 12, 10 };
        meeting_room(a, b); 
        
    }
}