package sortingAlgoritms;

public class SelectionSort {
    static void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver method
    public static void main(String args[])
    {
        System.out.println("Insertion Sort");
        int[] arr = { 8,5,6,1,0,2,3,4,7,6 };
        printArray(arr);
        selectionSort(arr);

        printArray(arr);
    }
    static void selectionSort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[j] < arr[min_index])
                    min_index = j;
            }
            //swap
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }
}
