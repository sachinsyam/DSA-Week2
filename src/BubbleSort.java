import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[1000];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(1000);
        }
        boolean shifted = true;

     //   print(arr);

        while(shifted){
            shifted = false;
            for (int i = 0; i < arr.length-1; i++) {
                System.out.println(i);
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    shifted = true;
                }
            }
        }
        System.out.println("\nSorted");
        print(arr);

//        int [] sortedArray = recursion(arr,true);
//        print(sortedArray);

    }

    static void print(int [] arr){
        System.out.println();
        Arrays.stream(arr).forEach(a -> System.out.print(a+"\n"));
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

