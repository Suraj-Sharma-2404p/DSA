package algortithms;

import java.util.Arrays;

public class algopractice {

    // public static void bubbleSort(int[] arr){
    //     for (int i = 1; i <= arr.length-1; i++) {
    //         for (int j = 0; j < arr.length - i; j++) {
    //             if (arr[j+1] < arr[j]) {
    //                 swap(arr, j+1 , j);
    //             }
    //         }
    //     }
    // }

    // public static void selectioSort(int[] arr){

    //     for(int i = 0 ; i < arr.length; i++){
    //         int mindex = i ;
    //         for(int j = i+1 ; j < arr.length ; j++){
    //             if (arr[j] < arr[mindex]) {
    //                 mindex = j;
    //             }
    //         }
    //         swap(arr, i, mindex);
    //     }
    // }

    public static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int j = i-1;
            while(j >= 0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }
    
    private static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,4,5,1,2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
