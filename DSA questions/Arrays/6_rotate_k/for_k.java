public class for_k {
    // Method to rotate the array 'arr' of size 'n' by 'k' positions
    public static void rotate(int arr[], int n, int k) {
        // Adjust 'k' to be within the bounds of the array size
        k = k % n; 
        // If k is 0, no rotation is needed, so return
        if (k == 0)
            return;

        // Temporary array to hold the last 'k' elements
        int temp[] = new int[k];
        
        /*
         * Copying elements from original array to temp array
         * from index 'n-k' to 'n-1' (last 'k' elements)
         */
        // Copy the last 'k' elements from 'arr' starting from index 'n-k' into the 'temp' array
        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i];
        }
        
        // Shift the remaining elements of 'arr' to the right by 'k' positions
        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i]; // Move element at index 'i' to index 'i+k'
        }
        
        // Copy the elements from the temporary array back to the beginning of 'arr'
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i]; // Place the last 'k' elements at the start of 'arr'
        }
    }

    public static void main(String args[]) {
        // Initialize an array to be rotated
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length; // Get the length of the array
        int k = 8; // Number of positions to rotate

        // Call the rotate method to rotate the array
        rotate(arr, n, k);
        
        // Print the rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); // Output each element of the rotated array
        }
    }
}