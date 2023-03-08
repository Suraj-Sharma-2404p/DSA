package DSAsheetQuestions.Array;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class MaxMinInArray {

    static MinMax getMinMax(int[] nums , int start , int end){
        MinMax minMax = new MinMax();
        MinMax mml = new MinMax();
        MinMax mmr = new MinMax();

        // if the array has only one elements
        if(start == end){
            minMax.min = nums[start];
            minMax.max = nums[end];
            return minMax;
        }
        // if the array has 2 elements

        if(end == start+1){
            if(nums[start]>nums[end]){
                minMax.max = nums[start];
                minMax.min = nums[end];
            }else {
                minMax.min = nums[start];
                minMax.max= nums[end];
            }
            return minMax
                    ;
        }

        // if the array has more then 2 elements
        int mid = start + (end -start)/2;
        mml = getMinMax(nums,start,mid);
        mmr = getMinMax(nums,mid+1,end);

        minMax.min = Math.min(mml.min, mmr.min);
        minMax.max = Math.max(mml.max,mmr.max);
        return minMax;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6};
        MinMax minMax = getMinMax(nums, 0, nums.length - 1);
        System.out.println("maximun is :"+ minMax.max);
        System.out.println("minimum is :"+ minMax.min);
    }
}
