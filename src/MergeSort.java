import java.util.Arrays;

public class MergeSort {

    void merge(int[] arr, int left, int mid, int right){
        System.out.println("INSIDE MERGE");
        // Find sizes of two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        /* Create temp arrays */
        int[] L = new int[n1];
        int[] R = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

        System.out.println("After Merge L:"+left+" M:"+mid+" R:"+right);
        printArray(arr);

    }

    // Main function that sorts arr[l..r] using
    // merge()
    void divide(int[] arr, int left, int right) {
        if (left < right) {
            System.out.println("Inside divide L:"+left+" R:"+right);

            // Find the middle point
            int mid = left + (right - left) / 2;

            System.out.println("Divide Mid:"+mid);
            // Sort first and second halves
            divide(arr, left, mid);
            divide(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
        else{
            System.out.println("Returned from divide L:"+left+" R:"+right);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int[] arr) {
        Arrays.stream(arr).forEach(a -> System.out.print(a+" "));
        System.out.println();
    }

    // Driver code
    public static void main(String[] args){
        int[] arr = { 12, 11, 13, 5, 12, 12, 11, 13, 5, 100,11, 13, 12, 11, 13, 5, 5,12, 11, 0,13, 5,  6, 7 };
//        int[] arr = { 4,0,2,12,6,9 };

        System.out.println("Given Array");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.divide(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        printArray(arr);
    }
}


