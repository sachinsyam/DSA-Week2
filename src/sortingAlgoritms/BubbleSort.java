package sortingAlgoritms;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Bubble Sort");
        int[] arr ={ 8,5,6,1,0,2,3,4,7,6 };
        print(arr);

        boolean shifted = true;

     //   print(arr);

        while(shifted){
            shifted = false;
            for (int i = 0; i < arr.length-1; i++) {
                    if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    shifted = true;
                }
            }
        }
        print(arr);


    }

    static void print(int [] arr){
        System.out.println();
        Arrays.stream(arr).forEach(a -> System.out.print(a+" "));
    }

    static int[] recursion(int [] arr, boolean shifted){
        if(shifted){
            for (int i = 0; i <arr.length-1 ; i++) {
                shifted = false;
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    shifted = true;
                }
            }
            return recursion(arr,shifted);
        }
        return arr;
    }


}

