package DSAsheetQuestions.Array;

import java.util.Arrays;

public class CyclicRotationByK {
    static void swap(int[] array , int i , int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    static void reverse(int[] array , int start , int end){
        while(start <= end){
            swap(array , start, end);
            start++;
            end--;
        }
    }
    static void rotate(int[] array , int k){
        reverse(array,0,array.length-1);
        reverse(array,k, array.length-1);
        reverse(array,0, k-1);
    }


    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};
        rotate(array,2);
        System.out.println(Arrays.toString(array));
    }
}
