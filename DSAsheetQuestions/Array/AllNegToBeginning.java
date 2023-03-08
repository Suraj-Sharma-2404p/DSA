package DSAsheetQuestions.Array;

import java.util.*;

public class AllNegToBeginning {

    static  void solution(int[] nums){
        int i=0;
        int j =0;
        while (i < nums.length){
            if(nums[i] >=0 ){
                i++;
            }else{
                swap(nums,j,i);
                i++;
                j++;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args){
        int[] nums = new int[]{0,-1,-1,0,0,-1,0,0,-1};
        solution(nums);
        System.out.println(Arrays.toString(nums));
    }

}
