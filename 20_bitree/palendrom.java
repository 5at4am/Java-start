public class palendrom {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,1};
        n = arr.length;
        for(int i = 0; i<n;i++){
            for(int j = n-1;j<0;j--){
                if(arr[i]==arr[j]){
                    System.out.println("palendrom");
                }else{
                    System.out.println("not");
                }
            }
        }
    }
}