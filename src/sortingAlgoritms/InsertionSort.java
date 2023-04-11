package sortingAlgoritms;
public class InsertionSort {
    /*Function to sort array using insertion sort*/
void sort(int [] arr){
    for (int i = 0; i < arr.length; i++) {
        int current = arr[i];
        int j = i-1;
        while(j>=0 && arr[j] > current){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = current;
    }
}

    static void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver method
    public static void main(String args[])
    {
        int[] arr = { 8,5,6,1,0,2,3,4,7,6 };
        printArray(arr);
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);

        printArray(arr);
    }
};