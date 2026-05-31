public class kadan {
    public static void maxsum(int[] arr) {
        int best = arr[0];
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            best = Math.max(arr[i], best + arr[i]);
            ans = Math.max(ans, best);
        }
        System.out.println(ans);
    }
    
    public static void minsum(int[] arr) {
        int best = arr[0];
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            best = Math.min(arr[i], best + arr[i]);
            ans = Math.min(ans, best);
        }
        System.out.println(ans);
    }

    public static void maxprod(int[] arr){
        int bestmax = arr[0];
        int bestmin= arr[0];
        int res = arr[0];
        for(int i = 0;i<arr.length;i++){
            int v1 = arr[i];
            int v2 = bestmax * arr[i];
            int v3 = bestmin * arr[i];
            bestmax = Math.max(v1,Math.max(v2,v3));
            bestmin = Math.min(v1,Math.min(v2,v3));
            res = Math.max(res,Math.max(bestmax,bestmin));
        }
        System.out.println(res);
    }
    public static void remove1(int[] arr){
        int onedel = arr[0];
        int nodel = arr[0];
        int res = arr[0];
        for(int i = 1; i<arr.length;i++){
            int pnodel = nodel;
            int podel = onedel;
            nodel = Math.max(nodel + arr[i], arr[i]);
            int v2;
            if(podel == Integer.MIN_VALUE){
                v2 = arr[i];
            }else{
                v2 = podel +arr[i];
            }
            onedel = Math.max(v2,pnodel);
            res = Math.max(res,Math.max(onedel,nodel));
        }
        System.out.println(res);
    }

    public static void kadan2(int[] a){

    }

    public static void main(String[] args){
        int[] arr = {-2,1,2,-4,5};
        // maxsum(arr);
        int[] arr1 = { -2, 3, -4 };
        // minsum(arr);
        // maxprod(arr1);
        remove1(arr1);
    
    }
}
