package DSAsheetQuestions.Array;

import java.util.Arrays;

public class Sort01 {
    static void sort01(int[] nums){
        int i =0;
        int j=0;
        while(i < nums.length-1){
            if(nums[i] == 1){
                i++;
            }else {
                swap(nums,i,j);
                i++;
                j++;
            }
        }

    }

    private static void swap(int[]nums,int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,1,0,0,1,0,0,1};
        sort01(nums);
        System.out.println(Arrays.toString(nums));
    }
}
