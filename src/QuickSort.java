import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        Random random = new Random();


        int [] arr = new int[10];

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = random.nextInt(10);
        }

        print(arr);
        quickSort(arr, 0, arr.length-1);
        print(arr);
    }

    static void quickSort(int [] arr, int lowIndex, int highIndex){
        if(lowIndex>=highIndex)
            return;

        int leftPointer = partition(arr, lowIndex, highIndex);

        quickSort(arr,lowIndex,leftPointer-1);
        quickSort(arr,leftPointer+1,highIndex);

    }

    private static int partition(int[] arr, int lowIndex, int highIndex) {

        int pivot = arr[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while(leftPointer < rightPointer){
            while(arr[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            while(arr[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }
            swap(arr, leftPointer, rightPointer);
        }

        swap(arr,leftPointer, highIndex);
        return leftPointer;
    }

    static void swap(int [] arr, int index1, int index2){
        int temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }

    static void print(int [] arr){
        Arrays.stream(arr).forEach(a -> System.out.printf(a+" "));
        System.out.println();
    }
}
