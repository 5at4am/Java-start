public class nextgre {
    public static void main(String[] args) {

        int arr[]={6,8,0,1,3};
        int count[]= new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            count[i]=-1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    count[i]= arr[j];
                    break;
                }
            }
        }

        for(int k =0;k<arr.length;k++){
            System.out.print(count[k]+ ", ");
        }

    }
}