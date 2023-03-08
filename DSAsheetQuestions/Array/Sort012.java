package DSAsheetQuestions.Array;
import java.util.*;

public class Sort012 {

    static void solution(int[] nums ){
        // we will divide this in 3 regions
        // 0 to j-1 is 0's area.
        // j to i-1 is 1's area.
        // i to k is unknown.
        // after k+1 is 2's area.
        int i =0 ;
        int j =0;
        int k = nums.length-1;

        while (i <= k){
            if(nums[i] == 1){
                i++;
            } else if (nums[i] == 2) {
                swap(nums , i , k);
                k--;
            } else {
                swap(nums, i , j);
                i++;
                j++;
            }
        }


    }

    private static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,1,2,0,2,0,1,2,0,0,1};
        solution(nums);
        System.out.println(Arrays.toString(nums));

    }
}
