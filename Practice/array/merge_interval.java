import java.util.*;

public class merge_interval {
    
    // merger interval 
    public static void merge(int[][] arr){
        if(arr.length == 0) return;
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));

        List<int[]> res = new ArrayList<>();
        int s1 = arr[0][0];
        int e1 = arr[0][1];
        for(int i = 1;i<arr.length;i++){
            int s2 = arr[i][0];
            int e2 = arr[i][1];
            if(e1>=s2){
                e1 = Math.max(e1,e2);
            }else{
            res.add(new int[]{s1,e1});
            s1 = s2;
            e1 = e2;}
        }
        res.add(new int[]{s1,e1});
        for(int[] i : res){
            System.out.println(Arrays.toString(i));
        }
    }


    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,6},{8,10},{15,18}};
        merge(arr);
    }
}