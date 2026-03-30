public class product_self {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4};
        int n = arr.length;
        int p = 1;

        for (int i = 0; i < n; i++) {
            p*=arr[i];
            
        }
        // System.out.println(p);
        int res[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            res[i] = p / arr[i];
            System.out.println(res[i]);
        }
        

    }
}