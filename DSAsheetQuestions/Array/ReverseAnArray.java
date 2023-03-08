package DSAsheetQuestions.Array;

import java.util.Arrays;

public class ReverseAnArray {

    static void swap(int[] num , int i , int j){
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }

    static void reverse(int[] nums , int start , int end){
        while (start <= end){
            swap(nums,start , end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] num = new int[]{3,4,5,2,1,5};
        reverse(num,0,num.length-1);
        System.out.println(Arrays.toString(num));
    }
}
