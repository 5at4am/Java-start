public class first {
    
    public static int first_occ(int arr[],int i,int key){
        
        if(i==arr.length-1){
            return -1;
        }
        if(key ==arr[i]){
            return i;
        }
        
        return first_occ(arr, i+1, key);

    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5,4,6};
        int key=4;
        System.out.println(first_occ(arr, 0, key));
    }
    
}
