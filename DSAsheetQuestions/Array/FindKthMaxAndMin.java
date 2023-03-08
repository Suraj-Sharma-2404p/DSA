package DSAsheetQuestions.Array;

import java.util.Arrays;


public class FindKthMaxAndMin {
    static MinMax getKthMinMax(int[] nums , int k){
        MinMax minMax = new MinMax();
        Arrays.sort(nums);
        minMax.max = nums[(nums.length)-k];
        minMax.min = nums[k-1];
        return minMax;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,3,4,5,6,7,8,9};
           MinMax minmax =  getKthMinMax(nums,4);
        System.out.println("4th maximum is :"+ minmax.max);
        System.out.println("4th min is :"+ minmax.min);
    }
}
